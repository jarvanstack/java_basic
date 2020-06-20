package MYSQL.SQL注入的模拟和解决.PrepareStateMent防止SQL注入;

import MYSQL.JDBC工具包.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * PrepareStatement防止SQL注入的原理
 * 把所有的传入参数当做字符串，转义字符 ` （漂）等被忽略，关键字无法生效。
 * 使用方法
 */
public class Demo {
    private static void login(String user_name,String password){
        Connection connection  = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtil.getConnection();
            String url = "SELECT * FROM USER WHERE `user_name` = ? AND `password` = ?;";
            preparedStatement = connection.prepareStatement(url);
            preparedStatement.setString(1,user_name);
            preparedStatement.setString(2,password);
            System.out.println(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
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
        }finally {
            JdbcUtil.release(connection,preparedStatement,resultSet);
        }
    }
    public static void main(String[] args) {
        //1，正常登陆，
        login("张三","111111");
        //2.非正常登陆,此时SQL注入无效
        login("张三' or '1' = '1","123456' or '1' = '1");
    }
}
