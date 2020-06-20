package Java学习.Java高级.多线程.单线程的弊端和Java线程执行原理;

/**
 * 一、Java程序运行原理：
 *      1，JVM 执行main 方法，
 *      2.main方法会进入栈空间
 *      **3.JVM会找 操作系统开辟一条 main方法的 线程通向cpu
 *      4.cup来执行这个线程，main(主)线程。
 *二、弊端：
 *  1，单线程停止，JVM退出，影响其他线程也停止。
 */
public class 单线程的弊端和Java线程执行原理 {
    private void print(String string){
        for (int i = 0; i < 50; i++) {
            System.out.print(string+i+"次，");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        单线程的弊端和Java线程执行原理 thread = new 单线程的弊端和Java线程执行原理();
        thread.print("张三");
        System.out.println(0/0);
        thread.print("李四");

    }
}
