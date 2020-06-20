package Java学习.Java高级.多线程.多线程方法2;

/**
 * 一、使用Runnable好处：
 * 1，避免单继承的局限性，类的可拓展性高
 * 2。高内聚，低耦合：
 * 设置线程任务（在MyRunnable类中重写run（）方法）
 * 和开启线程new Thread()和 start() 分离，
 * 二、原理：new Thread()对象可传递 Runnable接口的实现类的对象。
 * 三、步骤：
 * 1.创建Runnable接口类：  创建一个MyRunnable implements Runnable 接口，并且重写 run方法
 * 2.实例化类：       MyRunnable myRunnable = new MyRunnable();
 * 3.实例化Thread类并传递2的对象为参数： Thread thread = new Thread(myRunnable)
 * 4.调用Thread类的start()方法：       thread.start();
 */
public class Main {
    public static void main(String[] args) {
        //2.实例化新类
        MyRunnable myRunnable = new MyRunnable();
        //3。实例化Thread类并传递2的对象为参数
        Thread thread = new Thread(myRunnable);
        //4 调用Thread类的start()方法
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + Thread.currentThread().getName() + " " + i);
        }
    }
}
