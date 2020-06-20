package Java学习.Java高级.多线程.等待唤醒案例wait.模仿案例1基本包子;

/**
 * Customer
 *
 */
public class Customer implements Runnable {
    Object object = new Demo().getObject();
    @Override
    public void run() {
        //进入运行状态
        synchronized (object){
            try {
                System.out.println("-------------");
                System.out.println("Customer: 点餐包子");
                //object.wait(500);500毫秒没有被唤醒，自动唤醒
                object.wait();
                System.out.println("Customer: 获得包子");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
