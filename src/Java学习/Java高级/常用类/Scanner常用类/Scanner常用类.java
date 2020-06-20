package Java学习.Java高级.常用类.Scanner常用类;

/**
 * 注意：
 * next() 是返回字符串 nextLine() 是换行!!!
 */

import java.util.Scanner;

public class Scanner常用类 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.next();
    }
}
