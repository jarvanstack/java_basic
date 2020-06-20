package Java学习.Java高级.多线程.线程安全问题.线程安全问题解决.解决2同步方法;

/**
 * 一、同步方法的原理和解决1的同步代码块一致
 * 二、实现步骤：
 * 1.在MyRunnable实现implements Runnable 的类里新建一个 synchronized 修饰的方法：
 * private synchronized void synchronizedMethod(){
 * }
 * 2. 把解决方法1 中，线程安全的代码(访问共有变量的代码)用方法调用代替即可
 * 三、为什么同步代码块和同步方法原理一致，1，2 3是等价的。
 * 1. 同步方法的锁对象是this,
 * private synchronized void synchronizedMethod(){
 * if (tickets > 0){
 * System.out.println(tickets + " on selling 。。。end.");
 * tickets --;
 * }
 * }
 * 2.  同步方法的锁对象是this,
 * private  void synchronizedMethod(){
 * synchronized(this){
 * if (tickets > 0){
 * System.out.println(tickets + " on selling 。。。end.");
 * tickets --;
 * }
 * }
 * }
 * 3. 解决1.
 */
public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
