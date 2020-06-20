package MYSQL.JDBC工具包;

import javax.sql.DataSource;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.*;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Logger;

/**
 * JdbcPool 数据池（数据源）
 * #### 一.myJdbcPool.java实现步骤
 * 1.在loadConfiguration()批量生产配置的Connection放到Victor里面（Victor线程安全）
 * 2.在getConnection()方法里，
 * * （1）.在集合victors取出一个Connection，
 * *  (2).并使用[动态代理技术]()修改close()方法，让其变成归还connection对象到集合里。
 */
public class JdbcPool implements DataSource {
    public static Vector<Connection> victors = new Vector<>();

    /**
     * 1.在loadConfiguration()批量生产配置的Connection
     * 放到Victor里面（Victor线程安全）
     */
    private static void loadConfiguration() {
        try {
            String configPath = "D:\\Program Files\\JetBrains\\test1\\La" +
                    "b\\src\\MYSQL\\JDBC工具包\\jdbcPoolConf.properties";
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(configPath));
            Properties properties = new Properties();

            //将输入流的数据载入到Properties对象里，inputSteam都可以？
            properties.load(bufferedInputStream);
            //用properties对象获得配置文件的信息
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            int jdbcPoolInitSize = Integer.parseInt(properties.getProperty("jdbcPoolInitSize"));
            //驱动
            Class.forName(properties.getProperty("driver"));
            //如果没有初始化就初始化，
            if (victors.size() == 0){
                for (int i = 0; i < jdbcPoolInitSize; i++) {
                    Connection connection = DriverManager.getConnection(url,user,password);
                    System.out.println("日志--获取到链接:"+configPath);
                    victors.addElement(connection);
                }
            }
        } catch (Exception e) {
            System.out.println("日志--创建失败!");
            e.printStackTrace();
        }

    }

    /**
     *  * 2.在getConnection()方法里，
     *   （1）.在集合victors取出一个Connection，
     *    (2).并使用[动态代理技术]()修改close()方法，
     *  让其变成归还connection对象到集合里。
     * @return Connection，close（）被动态代理修改了
     *
     */
    @Override
    public  Connection getConnection()  {
        if (victors.size() == 0){
            JdbcPool.loadConfiguration();
        }
        if (victors.size() > 0){
            //取出一个 Connection,并给final？
            final Connection connection = victors.remove(0);
            //关键的动态代理技术，实现修改connection的close方法
            return (Connection) Proxy.newProxyInstance(JdbcPool.class.getClassLoader(), connection.getClass().getInterfaces(), new InvocationHandler(){
                @Override
                public Object invoke(Object proxy, Method method, Object[] args)
                        throws Throwable {
                    if(!method.getName().equals("close")){
                        return method.invoke(connection, args);
                    }else{
                        //如果调用的是Connection对象的close方法，就把conn还给数据库连接池
                        victors.addElement(connection);
                        System.out.println(connection + "被还给Connections数据库连接池了！！");
                        System.out.println("Connections数据库连接池大小为" + victors.size());
                        return null;
                    }
                }
            });
        }else {
            System.out.println("日志--链接超时！");
            return  null;
        }
    }
    public static void release(Connection connection, Statement statement,ResultSet resultSet){
        //先开后关
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }




//===========================实现的方法========================


                               @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
