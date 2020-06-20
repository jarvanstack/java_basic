package MYSQL.JDBC工具包;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 这个包测试 JdbcPool 是否可用
 */
public class Test02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            //1.connection
            connection = new JdbcPool().getConnection();
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
            JdbcPool.release(connection,statement,resultset);
            System.out.println("用时："+(System.currentTimeMillis() - start));

        }
    }
}