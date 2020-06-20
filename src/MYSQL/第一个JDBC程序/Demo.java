package MYSQL.第一个JDBC程序;

import java.sql.*;

/**
 * 我的第一个JDBC程序.
 * 1.加载JDBC驱动
 * 2.填（新建）连接的信息，URL，账号，密码
 * 3.连接数据库，获取数据库Connection对象，
 *      (1)DriverManager.getConnection(url,user,password);
 * 4.通过Connection数据库对象，创建createStatement(),statement执行对象.
 * 5.使用执行对象执行SQL语句，获得ResultSet，Set数据集合
 * 6.使用数据集合取出getObject(columnLabel 列名)想要的数据并打印
 * 7.关闭资源，先开后关。result -- statement -- connection.
 *
 */
public class Demo {
    public static void main(String[] args) {

        //声明定义分离
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            //1.固定写法，加载驱动

            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.填（新建）连接的信息，URL，账号，密码
            //(1)url
            String url = "jdbc:mysql://localhost:3306/" +//(1.1)连接地址，
                    "bmft_blog" +                      //（1.2）连接的数据库
                    "?useUnicode=true&" +                //（1.3）附加条件：支持中编码
                    "characterEncoding=utf8&"+          // （1.4)附加信息：设置utf-8 字符集
                    "useSSL=true&"+                       //（1.5）附加信息3：SSL安全连接
                    "serverTimezone=UTC";                 //解决报错You must configure either the server or JDBC driver
            System.out.println(url);
            //（2）账号
            String user = "root";
            //(3）密码
            String password = "612001";
            //3. 连接数据库并获取Connection对象
            connection = DriverManager.getConnection(url, user, password);
            //4.通过Connection对象获得SQL执行对象statement
            statement = connection.createStatement();
            //5.通过执行对象执行SQL语句获得，ResultSet 结果集
            //SQL dialect is not configured.没有配置SQL语言是什么鬼，还警告。
            resultset = statement.executeQuery("select * from `user`");
            //6.使用resultSet结果集获并打印结果.resultSet 是一个链表，
            while (resultset.next()){
                System.out.print("账号="+resultset.getObject("id")+" , ");
                System.out.print("名字="+resultset.getObject("user_name")+" , ");
                System.out.print("密码="+resultset.getObject("password")+" , ");
                System.out.print("介绍="+resultset.getObject("introduction")+" , ");
                System.out.print("手机号"+resultset.getObject("phone_number")+" , ");
                System.out.print("邮箱"+resultset.getObject("mailbox")+" , ");
                System.out.println();
            }



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //一次关闭资源，先开后关,ResultSet -- statement -- connection
            if (resultset != null){
                try {
                    resultset.close();
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
    }
}
