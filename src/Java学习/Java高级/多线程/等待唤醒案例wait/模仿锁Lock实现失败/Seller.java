package Java学习.Java高级.多线程.等待唤醒案例wait.模仿锁Lock实现失败;

/**
 * * 二、步骤
 * * 1.新建包子类，定义bonFlag包子是否存在,.和包子名称.
 * * 2.新建商家Seller类 ,
 * *      1.带参数的构造，传入包子bon 对象. 线程函数，
 * *      2.判断包子是否存在，false ,bon.wait(),true 就做包子，sleep(1000)
 * *      3.做完后，bonFlag = true ,
 * * 3.新建Customer类：
 * *      1.传入包子对象,进入线程
 * *      2.判断bonFlag ,if false ,提交订单，bonOrderFlag = true，然后等待，bon.wait()
 */
public class Seller implements Runnable {
    private Bun bun;

    public Seller(Bun bun) {
        this.bun = bun;
    }

    @Override
    public void run() {
        //如果包子数量未满就，进入线程.
        for (int i = 0; i < bun.getNumberOfBun(); i++) {
            //进入线程
            bun.getLock().lock();

                //如果包子还没吃完就等待wait()
                if (bun.isBunExist()) {
                    try {
                        System.out.println("Seller: 正在等待包子吃完.");
                        bun.wait();//正在等待 2.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //等待后做包子，或者直接做包子，不用使用else{
                System.out.println("------------------"+i+"---------------------");
                System.out.println("线程：Seller--"+Thread.currentThread());
                System.out.println("Seller: 正在做" + bun.getBunType() + "...");
                try {
                    Thread.sleep(1000);
                    System.out.println("Seller: 完成");
                    bun.setBunExist(true);//设置bunExist = true
                    bun.notify();//释放1.
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            bun.getLock().unlock();
        }
        //最后包子做完了就，完成订单.
        System.out.println("Seller：您的订单已经完成.===");
    }
}
