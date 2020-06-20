package Java学习.Java高级.多线程.等待唤醒案例wait.模仿锁Lock实现失败;

import java.util.concurrent.locks.ReentrantLock;

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
public class Bun {
    private String bunType = "白菜包子";
    private int numberOfBun = 10;
    private boolean isBunExist = false;
    private ReentrantLock lock = new ReentrantLock();

    public ReentrantLock getLock() {
        return lock;
    }
    public String getBunType() {
        return bunType;
    }

    public int getNumberOfBun() {
        return numberOfBun;
    }

    public boolean isBunExist() {
        return isBunExist;
    }

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }

    public void setNumberOfBun(int numberOfBun) {
        this.numberOfBun = numberOfBun;
    }

    public void setBunExist(boolean bunExist) {
        isBunExist = bunExist;
    }
}
