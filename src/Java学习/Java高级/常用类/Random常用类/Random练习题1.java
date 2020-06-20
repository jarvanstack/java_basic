package Java学习.Java高级.常用类.Random常用类;

import java.util.Random;
import java.util.Scanner;

/**
 * 题目：
 *      获得 [1,n] 的int随机数，可以取 1 也可以取 n
 */
public class Random练习题1 {
    public static void main(String[] args) {
        System.out.println("Please input the max number of the random");
        int maxInt = new Scanner(System.in).nextInt();
        System.out.println("your random number is :"+new Random().nextInt(maxInt)+1);

    }
}
