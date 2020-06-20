package MYSQL.SQL注入的模拟和解决.模拟SQL注入;

import MYSQL.JDBC工具包.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * SQL注入就是提交非法表单，这里模拟下。
 * select * from user where `user_name` = '张三' or '1' = '1' and password = '123456' or '1' = '1'
 */
public class Demo {
    private static void login(String user_name,String password){
        Connection connection ;
        Statement statement;
        ResultSet resultSet;

        try {
            connection = new JdbcUtil().getConnection();
            statement = connection.createStatement();
            String sql = "select * from user where `user_name` = '"+user_name+
                    "' and password = '"+password+"'";
            System.out.println("==================");
            System.out.println(sql);
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.print("账号="+resultSet.getObject("id")+" , ");
                System.out.print("名字="+resultSet.getObject("user_name")+" , ");
                System.out.print("密码="+resultSet.getObject("password")+" , ");
                System.out.print("介绍="+resultSet.getObject("introduction")+" , ");
                System.out.print("手机号"+resultSet.getObject("phone_number")+" , ");
                System.out.print("邮箱"+resultSet.getObject("mailbox")+" , ");
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //1，正常登陆，
        login("张三","111111");
        //2.非正常登陆
        login("张三' or '1' = '1","123456' or '1' = '1");
    }
}
