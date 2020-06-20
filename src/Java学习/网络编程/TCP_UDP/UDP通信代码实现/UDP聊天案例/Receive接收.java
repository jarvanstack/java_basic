package Java学习.网络编程.TCP_UDP.UDP通信代码实现.UDP聊天案例;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 接受，多线程打开接受，
 * 构造：myPort
 * 一、步骤
 * 1.
 */
public class Receive接收 implements Runnable {
    private int myPort;
    private boolean flag;

    @Override
    public void run() {
        //申明和定义分离
        DatagramSocket datagramSocket = null;
        byte[] bytes = null;
        DatagramPacket datagramPacket = null;
        try {
            //1.开Socket
            datagramSocket = new DatagramSocket(myPort);
            while (flag) {
                //2.新建数据包
                bytes = new byte[1024 * 100];
                datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
                //3.阻塞接受,如果不多线程就无法发送了，
                datagramSocket.receive(datagramPacket);
                //输出发信息来源和内容》
                System.out.println("----" + datagramPacket.getAddress() + ":" + datagramPacket.getPort());
                String message= (new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
                System.out.println(message);
                if (message.toLowerCase() == "bye"){
                    flag = false;
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }

    public Receive接收(int myPort) {
        this.myPort = myPort;
        flag = true;
    }
}
