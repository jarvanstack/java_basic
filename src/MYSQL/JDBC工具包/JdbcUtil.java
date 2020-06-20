package MYSQL.JDBC工具包;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * (改为静态static，使用更方便.
 * 这是一个JDBC的工具类，通过配置文件连接数据库，然后获得Connection对象。
 */
public class JdbcUtil {
    private static String url = null;
    private static String user = null;
    private static String password = null;
    public JdbcUtil() {
    }

    /**
     * 一、加载配置和驱动loadConfiguration()
     */
    private static void loadConfiguration() {
        try {
            String configPath = "D:\\Program Files\\JetBrains\\test1\\La" +
                    "b\\src\\MYSQL\\JDBC工具包\\jdbcUtilConf.properties";
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(configPath));
            Properties properties = new Properties();

            //3.将输入流的数据载入到Properties对象里，inputSteam都可以？
            properties.load(bufferedInputStream);
            //4.用properties对象获得配置文件的信息
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            //5.驱动
            Class.forName(properties.getProperty("driver"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 二、getConnection对象。
     *
     * @return 一个配置好的Connection对象。
     * @throws Exception 最大异常，调用方法需处理
     */
    public static Connection getConnection() throws Exception {
        if (url == null) {
            loadConfiguration();
        }
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 三、release()释放3个资源
     * 注意 -- 先开后关原则。
     * @param connection c
     * @param statement Statement
     * @param resultSet ResultSet
     */
    public static void release(Connection connection , Statement statement, ResultSet resultSet){

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
    public static void release(Connection connection , Statement statement){

        if (connection != null){
            try {
                connection.close();
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

    }
}
