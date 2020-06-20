package Java学习.Java高级.多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 一、概念: 线程池是课重复使用的线程集合，因为使用完成后会自动归还线程
 * 二、步骤：
 * 1.使用线程池工程类Executors(执行者)提供的静态方法
 * newFixedThreadPool()创建一个新的可复用的线程池对象。executorService
 * ExecutorService executorService = Executor.newFixedThreadPool(2);（多态）
 * 2.创建一个新的类，实现Runnable接口，重写run方法，设置线程任务--打印当前线程名称》
 * 3.使用对象调用ExecutorService执行器服务的方法，submit(new MyRunnable())床创建新的线程
 * executorService.submit(new MyRunnable());
 * 4.使用对象调用ExecutorService的方法，shutdown()关闭线程池的所有方法
 * executorService.shutdown();
 */
public class Demo {
    public static void main(String[] args) {
        //1.新建线程池对象.
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //3.获取线程，执行重写的方法。并自动执行
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        //4。终结线程池。（不建议使用）不终结就不会停止程序，
        executorService.shutdown();
        //executorService.submit(new MyRunnable());终结之后再获取新线程就会报错.


    }
}
