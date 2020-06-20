package Java学习.Java高级.常用类.Random常用类;

import java.util.Random;

/**
 * 1.   Math.random() 生成 0 -1 的double 数值
 *      等价于 new Random().nextDouble()
 * 2.   new Random().nextInt(10);   0 -9 的随机数值
 */
public class Random常用类 {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextDouble();
        Math.random();
    }
}
