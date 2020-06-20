package Java学习.Java高级.多线程.多线程方法1;

public class 我的多线程 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }
    }
}
