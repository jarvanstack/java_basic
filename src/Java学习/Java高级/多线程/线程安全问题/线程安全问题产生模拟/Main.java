package Java学习.Java高级.多线程.线程安全问题.线程安全问题产生模拟;

/**
 * 模拟买票产生的线程安全问题。
 * 1.一个 Runnable 接口 创建3 个线程，new Thread(myRunnable)
 * 2.三个线程的start()抢占资源，导致 tickets 异常
 */
public class Main {
    private int tickets = 100;

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
