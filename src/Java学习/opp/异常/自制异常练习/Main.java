package Java学习.opp.异常.自制异常练习;

import java.util.Scanner;

/**
 * 一、目的：自制异常类，模拟用户名注册，如果用户名存在，抛出异常提示：该用户名已经注册
 * 二、步骤分析：
 * 1，使用 ArrayList 保存已经注册的用户名(数据库）
 * 2.使用 Scanner 获取用户输入的用户名（前端）
 * 3.定义一个方法，断是否重复(后端)   抛出异常：
 *      3.1 true : "sorry,the user name already exist."
 *      3.2 false,continue util the ending of the arrayList.: " congratulations ,registration success!"
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
    }
}
