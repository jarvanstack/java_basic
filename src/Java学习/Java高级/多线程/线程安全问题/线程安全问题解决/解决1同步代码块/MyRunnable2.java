package Java学习.Java高级.多线程.线程安全问题.线程安全问题解决.解决1同步代码块;

/**
 * 一、同步代码块线程安全的原理
 * 1. 同步代码块的线程没有锁对象不能执行（阻塞),
 * 2.正在执行的同步代码块会拿走锁对象，直到执行完才归还。
 * 二、详解：
 * 1. 执行线程：
 * 3个线程抢CPU执行权，比如 thread1 抢到了， thread1执行run方法，
 * 2.判断是否有锁对象lock:
 * 遇到synchronized(lock),检查是否有锁对象，有就拿走锁对象lock
 * 没有就阻塞，比如thread1拿到了锁对象开始执行
 * 3，thread2 执行线程：
 * thread2 抢到了cpu的执行权，run()方法，
 * 4.判断有没有锁对象：
 * thread2 的没有锁对象，(thread1拿走了正在运行还没归还)停止运行，阻塞
 */
public class MyRunnable2 implements Runnable {
    private int tickets = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                //必须把判断语句if写到同步代码块里，不然会出问题
                //判断也是会出线程安全的部分。
                if (tickets > 0) {
                    System.out.println(tickets + "on selling...end");
                    tickets--;
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
