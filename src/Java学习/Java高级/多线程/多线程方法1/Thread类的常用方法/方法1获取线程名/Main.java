package Java学习.Java高级.多线程.多线程方法1.Thread类的常用方法.方法1获取线程名;

/**
 * 一、 方法 1 Thread类的 getName()
 * 二、方法2 ：使用Thread类的静态方法获取当前正在执行的线程的对象。
 * 1. Thread.currentThread()
 */
public class Main {
    public static void main(String[] args) {
        new MyThread获取线程名().start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+Thread.currentThread());
        }
    }
}
