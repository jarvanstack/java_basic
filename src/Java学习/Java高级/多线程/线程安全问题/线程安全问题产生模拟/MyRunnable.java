package Java学习.Java高级.多线程.线程安全问题.线程安全问题产生模拟;

public class MyRunnable implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (tickets > 0) {
            System.out.println(tickets + "on selling...");
            tickets--;
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
