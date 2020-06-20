package MYSQL.JDBC实现事务提交;

import MYSQL.JDBC工具包.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 这个类模拟，jdbc事务提交
 * 一、回顾事务
 * 1.原子性：要么完成要么都不完成
 * 2.一致性：总数不变
 * 3.隔离性：分别执行（产生脏读，幻读，不可重复读的原因）
 * 4.持久性，一旦提交就不能回滚
 * 二、jdbc实现事务提交的步骤。
 * 1.关闭自动提交，开启事务（事务是数据库层级Connection.setAuto...)
 * 2.执行SQL提交事务。(重点:这里一个statement只提交一个SQL，
 * 批量使用statement的addBatch()添加SQL组，和executeBatch()）
 * 3.在catch语句中，设置回滚，失败就回滚(这个是自动完成的，但是我们这里显示表现下）
 */
public class Demo {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtil.getConnection();
            //1.关闭自动提交
            connection.setAutoCommit(false);
            //2.执行SQL提交事务.
            String sql = "UPDATE `bmft_blog`.`bank_transfer` SET `saving_acount` = '2000' WHERE `bank_transfer_id` = '1'; ";
            preparedStatement= connection.prepareStatement(sql);
            int i = preparedStatement.executeUpdate();
            if (i > 0){
                System.out.println("执行成功"+i+" rows affected ");
            }
            //==========================执行第二个SQL，重新赋值statement
            String sql2 = "UPDATE `bmft_blog`.`bank_transfer` SET `saving_acount` = '0' WHERE `bank_transfer_id` = '2'; ";
            preparedStatement = connection.prepareStatement(sql2);
            int i1 = preparedStatement.executeUpdate();
            if (i1 > 0 ){
                System.out.println("执行成功"+i1+" rows affected ");
            }
            connection.commit();
        } catch (Exception e) {
            try {
                //显示设置回滚，其实会自动回滚。
                assert connection != null;
                connection.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JdbcUtil.release(connection,preparedStatement);
        }
    }
}
