package Java学习.JavaSE基础.Scanner1;

import java.util.Scanner;

/**
 * 基础的Scanner用法
 *
 */
public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a Int");
        if (sc.hasNextInt()){
        int i = sc.nextInt();
        System.out.println("The value is "+i);
        }
        else{
            System.out.println("Please input a Int value");
        }
        sc.close();
    }
}
