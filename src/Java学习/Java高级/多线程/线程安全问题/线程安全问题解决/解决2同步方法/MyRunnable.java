package Java学习.Java高级.多线程.线程安全问题.线程安全问题解决.解决2同步方法;

public class MyRunnable implements Runnable {
    private int tickets = 100;
    @Override
    public void run() {
        while (true){
            //把有线程安全问题（访问共有变量池）的代码用同步方法解决
            synchronizedMethod();
        }
    }
    private synchronized void synchronizedMethod(){
        if (tickets > 0){
            System.out.println(tickets + " on selling 。。。end.");
            tickets --;
        }
    }
}
