package Java学习.Java高级.多线程.多线程方法1.Thread类的常用方法.方法2设置线程名;

/**
 * 一、设置线程的2种方式：
 *      1.线程对象有一个setName("name");设置名称
 *      2.new 对象的时候传入name 参数。
 *      此方法需要，MyThread 类创建 带name参数的构造函数。
 */
public class Main {
    public static void main(String[] args) {
        //方法1
        MyThread设置线程名 myThread = new MyThread设置线程名();
        myThread.setName("半亩方糖");
        myThread.start();
        //方法2
        new MyThread设置线程名("嘉文").start();
    }
}
