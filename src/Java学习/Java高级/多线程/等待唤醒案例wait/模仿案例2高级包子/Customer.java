package Java学习.Java高级.多线程.等待唤醒案例wait.模仿案例2高级包子;

/**
 *  * 二、步骤
 *  * 1.新建包子类，定义bonFlag包子是否存在,和bonOrderFlag订单是否存在.和包子名称.
 *  * 2.新建商家Seller类 ,
 *  *      1.带参数的构造，传入包子bon 对象. 线程函数，
 *  *      2.判断bonOrderFlag 是否存在，false ,bon.wait(),true 就做包子，sleep(1000)
 *  *      3.做完后，bonFlag = true ,
 *  * 3.新建Customer类：
 *  *      1.传入包子对象,进入线程
 *  *      2.判断bonFlag ,if false ,提交订单，bonOrderFlag = true，然后等待，bon.wait()
 */
public class Customer implements Runnable{
    Bun bun ;

    public Customer(Bun bun) {
        this.bun = bun;
    }

    @Override
    public void run() {
        //吃包子的次数.
        for (int i = 0; i < bun.getNumberOfBun(); i++) {
            //进入线程
            synchronized (bun){
                //没有就等包子
                System.out.println("线程：Customer--"+Thread.currentThread());
                if (bun.isBunExist() == false){
                    System.out.println("Customer: 正在等待做包子...");
                    try {
                        bun.wait();//正在等待 1.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Customer: 正在吃包子...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Customer：包子已经吃完");
                bun.setBunExist(false);
                bun.notify();//释放 2.
            }
        }
    }
}
