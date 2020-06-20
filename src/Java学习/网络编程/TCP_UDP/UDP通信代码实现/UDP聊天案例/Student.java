package Java学习.网络编程.TCP_UDP.UDP通信代码实现.UDP聊天案例;

/**
 * 使用多线程，
 */
public class Student {
    public static void main(String[] args) {
        //学生发送消息到老师9001
        new Thread(new Send发送(8000,"127.0.0.1",9001)).start();
        //学生的接收为 8001
        new Thread(new Receive接收(8001)).start();

    }
}
