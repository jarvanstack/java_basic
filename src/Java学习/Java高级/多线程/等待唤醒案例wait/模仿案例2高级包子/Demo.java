package Java学习.Java高级.多线程.等待唤醒案例wait.模仿案例2高级包子;

/**
 * 锁lock 案例失败，使用synchronized 来完成.
 * 一、要求：Seller等待，判断包子不存在，，Customer提交申请，
 *          Customer等待，Seller开始做包子，完成后，激活Customer拿走包子，下一位一共10个包子,
 * 二、步骤
 * 1.新建包子类，定义bonFlag包子是否存在,和包子名称.包子数量NumberOfBun
 * 2.新建商家Seller类 ,
 *      1.带参数的构造，传入包子bon 对象.
 *      2.再Number中遍历，进入线程0，如果包子IsBunExist()就等wait()2的他吃完.
 *      3.没有包子或者吃完后，做包子，然后 IsBunExist() = true
 * 3.新建顾客Customer类
 *      1，传入参数 bun 对象
 *      2.在Number中遍历，进入线程1，如果没有有包子IsBunExist()就wait()1，等他做好.
 *      3.有包子或者吃完后，,然后 IsBunExist() = false;
 * 问题：
 * 1. 一个 bun 对象为何可以在2个线程内同时运行，但是Lock.lock(),unlock()却不行，可能没试过.试试。
 */
public class Demo {
    public static void main(String[] args) {
        Bun bun = new Bun();
        new Thread(new Seller(bun)).start();
        new Thread(new Customer(bun)).start();
    }

}
