package Java学习.Java高级.多线程.多线程方法2;

//步骤1.  1.创建Runnable接口类：  创建一个MyRunnable implements Runnable 接口，并且重写run()方法
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + Thread.currentThread().getName() + " " + i);

        }
    }
}
