package Java学习.网络编程.TCP_UDP.UDP通信代码实现.UDP聊天案例;

public class Teacher {
    public static void main(String[] args) {
        //老师发送到 8001 的学生
        new Thread(new Send发送(9000,"127.0.0.1",8001)).start();
        //老师开放9001的端口接受
        new Thread(new Receive接收(9001)).start();

    }
}
