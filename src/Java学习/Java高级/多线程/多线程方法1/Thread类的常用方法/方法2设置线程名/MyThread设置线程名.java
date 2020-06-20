package Java学习.Java高级.多线程.多线程方法1.Thread类的常用方法.方法2设置线程名;

public class MyThread设置线程名 extends Thread {
    public MyThread设置线程名() {
    }

    public MyThread设置线程名(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("run:"+Thread.currentThread().getName());
    }
}
