package Java学习.Java高级.多线程.多线程方法1.Thread类的常用方法.方法1获取线程名;

public class MyThread获取线程名 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+getName());
        }

    }
}
