package Java学习.Java高级.多线程.等待唤醒案例wait.模仿案例1基本包子;

/**
 * 卖家
 */
public class Shoper implements Runnable {
    Object object = new Demo().getObject();

    @Override
    public void run() {
        //进入运行
        synchronized (object){
            try {
                System.out.println("卖家：收到订单，开始制作...");
                Thread.sleep(1000);//进入睡眠
                System.out.println("卖家：制作完成.here you are.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                object.notify();
            }
        }
    }
}
