package Java学习.Java高级.多线程.等待唤醒案例wait.模板;

/**
 * 目的，顾客点包子，然后等待，老板做包子，做完后通知顾客(唤醒)。
 * 一、三种暂停状态
 * 1.sleep Thread.sleep(1000)
 * 2.lock锁，线程安全的3个解决方案
 * 3.wait()  :waiting 无限等待，需要notify()方法唤醒
 * 二、案例要求：老板线程和顾客线程的通信,
 * 1. 顾客线程： 告知老板需要的包子的数量，调用obj.wait()方法，等待老板做包子
 * (放弃CPU的执行权力，到Waiting状态)
 * 2. 顾客线程： 花了2秒做包子，然后调用 对应的obj.notify()方法，唤醒对应的等待线程
 * 三：注意：
 * 1.老板和顾客的线程使用同步代码块包裹，防止线程保证等待和唤醒只有一个在执行
 * 2.同步obj.wait() 和 obj.notify()的 obj 对象必须相同，对应
 * 3. wait()和 notify() 是Object类中的方法.
 */
public class Demo {
    public static void main(String[] args) {
        Object object = new Object();
        //Customer----------
        new Thread(new Runnable() {
            @Override
            public void run() {
                //进入同步代码块.获取object.
                synchronized (object) {
                    System.out.println("Customer: 提交包子套餐");
                    try {
                        object.wait();
                        System.out.println("Customer：包子获得成功");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //出来同步代码块，返回object
            }
        }).start();
        //卖家
        new Thread(new Runnable() {
            @Override
            public void run() {
                //进入同步代码块，获得object对象.
                synchronized (object) {
                    try {
                        System.out.println("卖家： 订单获取成功，正在做包子...");
                        Thread.sleep(1000);
                        System.out.println("卖家：包子制作成功,下一位");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        object.notify();
                    }
                }
            }
        }).start();
    }
}
