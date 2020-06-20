package Java学习.Java高级.多线程.等待唤醒案例wait.模仿案例1基本包子;

/**
 * 目的，顾客点包子，然后等待，老板做包子，做完后通知顾客(唤醒),然后顾客2，又来...一共10个包子。
 * 一、三种暂停状态
 * 1.sleep Thread.sleep(1000)
 * 2.lock锁，线程安全的3个解决方案
 * 3.wait()  :waiting 无限等待，需要notify()方法唤醒
 * 二、案例要求：老板线程和顾客线程的通信,
 * 1. 顾客线程： 告知老板需要的包子的数量，调用obj.wait()方法，等待老板做包子
 *      (放弃CPU的执行权力，到Waiting状态)
 * 2. 顾客线程： 花了2秒做包子，然后调用 对应的obj.notify()方法，唤醒对应的等待线程
 * 三：注意：
 * 1.老板和顾客的线程使用同步代码块包裹，防止线程保证等待和唤醒只有一个在执行
 * 2.同步obj.wait() 和 obj.notify()的 obj 对象必须相同，对应
 * 3. wait()和 notify() 是Object类中的方法.
 * 四、下一集的拓展。
 * 1..带参wait(1000):  wait(long) 和 sleep(1000) 类似，如果 1000毫秒后还未被唤醒自动唤醒
 * 2. object.notifyAll() ：唤醒所有object线程,notify()唤醒一个(等待最长的).
 */
public class Demo {
    Object object = new Object();
    public static void main(String[] args) {
        new Thread(new Customer()).start();
        new Thread(new Shoper()).start();
    }

    public Object getObject() {
        return object;
    }
}
