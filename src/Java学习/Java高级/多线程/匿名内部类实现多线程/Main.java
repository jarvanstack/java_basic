package Java学习.Java高级.多线程.匿名内部类实现多线程;

/**
 * 一、问题导论：
 * new Person();就是匿名内部类，但是并不可以直接new Thread() 或者 new Runnable()接口，
 * 其实是可以的，只要实现 重写 他们关键的run()方法即可,
 * 二、
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=====1.new Thread()的内部类=========");
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("1.Thread1: "+i);
                }
            }
        }.start();
        System.out.println("==========2.new Runnable()=======");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("2.Runnable: " + i);
                }
            }
        };
        new Thread(runnable).start();
        System.out.println("======把2再精简合并为3=========");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("3.合并后："+i);
                }
            }
        }).start();


    }
}
