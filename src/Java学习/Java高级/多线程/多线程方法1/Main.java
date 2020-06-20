package Java学习.Java高级.多线程.多线程方法1;

/**
 * 一、
 * 1，我的线程 继承 Thread，然后重写run方法，
 * 2.Main实现 我的线程 的实例，然后 myThread.start() 启动 run()方法中的内容。
 * 二、解析：
 * 1，Java是抢占式调度，谁的优先级高先执行谁的线程，优先级一致就随机执行。来回快速切换。
 * 三、注意：
 * 1.反复多次启动一个线程是非法的，只能启动一次
 */
public class Main {
    public static void main(String[] args) {
        我的多线程 myThread = new 我的多线程();
        myThread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
        System.out.println("abdlghl".lastIndexOf("dlgh"));
    }
}
