package Java学习.JavaSE基础.Random;
/**
 * 测试 random.nextInt(6) 的返回值 为 0-5；
 */

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomInt = random.nextInt(6);
            System.out.println(randomInt);
        }


    }
}
