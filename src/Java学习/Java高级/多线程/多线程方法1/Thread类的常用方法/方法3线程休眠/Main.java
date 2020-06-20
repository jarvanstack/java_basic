package Java学习.Java高级.多线程.多线程方法1.Thread类的常用方法.方法3线程休眠;

/**
 * 一、：使用静态方法Thread.sleep(Long long);休眠线程多少毫秒
 * 1.注意： 需要捕获异常
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
