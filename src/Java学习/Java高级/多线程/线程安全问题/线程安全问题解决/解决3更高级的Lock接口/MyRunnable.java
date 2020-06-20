package Java学习.Java高级.多线程.线程安全问题.线程安全问题解决.解决3更高级的Lock接口;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{
    private int tickets = 100;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();//获取锁，锁住
            if (tickets>0) {

                try {
                    System.out.println(tickets + "on selling...");
                    tickets--;
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //代码优化，把开锁放到finally，无论是否异常都会把开锁，不会影响其他线程。
                    lock.unlock();//解开，释放。
                }
            }
        }
    }
}
