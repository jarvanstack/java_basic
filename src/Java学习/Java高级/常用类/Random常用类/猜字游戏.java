package Java学习.Java高级.常用类.Random常用类;

import java.util.Random;
import java.util.Scanner;

/**
 * 1-100的随机数字，每猜字一次，计数器+1 ，并且提示十分猜中，和偏大偏小
 */

public class 猜字游戏 {
    int count;
    int target;

    private void gameStar() {
        count = 0;
        Random random = new Random();
        target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("猜1-100的整数");
            int yourAnswer = scanner.nextInt();
            if (yourAnswer > target) {
                System.out.println("太大");
            } else if (yourAnswer < target) {
                System.out.println("太小");
            } else if (yourAnswer == target) {
                break;
            }
        } while (true);
        System.out.println("猜对了答案是："+target);
    }

    public static void main(String[] args) {
        new 猜字游戏().gameStar();
    }
}
