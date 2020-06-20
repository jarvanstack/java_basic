package Java学习.Java高级.多线程.线程安全问题.线程安全问题解决.解决1同步代码块;

/**
 * 模拟买票产生的线程安全问题。
 * 1.一个 Runnable 接口 创建3 个线程，new Thread(myRunnable)
 * 2.三个线程的start()抢占资源，导致 tickets 异常
 * 二、线程安全问题的解决：
 * 1.格式
 * synchronized(锁对象呢){
 * 可能出现线程安全问题的代码.
 * }
 * 2.注意：
 * 2，1：锁对象可以为任何对象，比如Object
 * 2.2 ：但是要保证多线程的锁对象为同一个
 * 2.3：锁对象的作用：
 * 2，3，1：把同步代码块锁住，只允许一个线程在同步代码块中执行。
 * 3.出现的问题：注释掉之前的没有安全的线程，不然会混淆。
 */
public class Main {
    private int tickets = 100;

    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        Thread thread1 = new Thread(myRunnable);
//        Thread thread2 = new Thread(myRunnable);
//        thread.start();
//        thread1.start();
//        thread2.start();
        System.out.println("==========使用同步代码块后=======");
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread thread3 = new Thread(myRunnable2);
        Thread thread4 = new Thread(myRunnable2);
        Thread thread5 = new Thread(myRunnable2);
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
