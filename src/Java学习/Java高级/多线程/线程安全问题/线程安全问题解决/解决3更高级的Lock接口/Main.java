package Java学习.Java高级.多线程.线程安全问题.线程安全问题解决.解决3更高级的Lock接口;

/**
 * 一、更高级的lock接口：
 * 1.常用方法：
 *      1,1 void lock()加锁
 *      1.2 void unlock()解锁
 * 2.常用的接口的实现类：可重复锁.
 *      1. ReentrantLock implements Lock;
 * 二、具体使用步骤：
 * 1，在成员位置创建ReentrantLock对象（多态）
 *          ReentrantLock lock = new ReentrantLock();
 * 2. 在线程安全的问题代码（访问共有变量的代码块）前后加上获取锁和释放锁。
 * 四、代码优化：
 * 1.把锁的释放放到finally语句里，无论线程语句是否异常都会开锁，不会影响其他代码是运行。
 */
public class Main {
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
