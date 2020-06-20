package MYSQL.JDBC工具包;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 这个类用来测下myJdbcUtil工具是否可用
 *
 * Connection十分浪费资源，一个Connection连接用时，900毫秒
 * statement执行SQL用时 几十毫秒
 * 打印Result用时 几毫秒
 */
public class Test01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            //1.connection
            connection = JdbcUtil.getConnection();
            System.out.println("Connection用时："+(System.currentTimeMillis() - start));
            //2。statement
            statement = connection.createStatement();
            //3.执行查询executeQuery(sql)
            resultset = statement.executeQuery("select * from user");
            System.out.println("到执行用时："+(System.currentTimeMillis() - start));

            while (resultset.next()){
                System.out.print("账号="+resultset.getObject("id")+" , ");
                System.out.print("名字="+resultset.getObject("user_name")+" , ");
                System.out.print("密码="+resultset.getObject("password")+" , ");
                System.out.print("介绍="+resultset.getObject("introduction")+" , ");
                System.out.print("手机号"+resultset.getObject("phone_number")+" , ");
                System.out.print("邮箱"+resultset.getObject("mailbox")+" , ");
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.release(connection,statement,resultset);
            System.out.println("用时："+(System.currentTimeMillis() - start));

        }
    }
}
