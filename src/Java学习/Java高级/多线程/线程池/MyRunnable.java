package Java学习.Java高级.多线程.线程池;
//2.创建新的线程类
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"   成功启动");
    }
}
