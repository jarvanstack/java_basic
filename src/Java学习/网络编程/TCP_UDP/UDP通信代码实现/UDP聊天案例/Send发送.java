package Java学习.网络编程.TCP_UDP.UDP通信代码实现.UDP聊天案例;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * 多线程
 */
public class Send发送 implements Runnable {
    private String toAddress;
    private int toPort;
    private boolean flag;
    private int myPort;

    @Override
    public void run() {
        DatagramSocket datagramSocket = null;
        Scanner scanner = null;
        //构造定义分离
        try {
            //1. 构造开端口自己的开放的端口
            datagramSocket = new DatagramSocket(myPort);
            scanner = new Scanner(System.in);
            System.out.println("--------回车发送，bye 退出-------");
            while (flag) {
                String someText = scanner.nextLine();
                //2. 做一个发送包，指定目标地址，和端口 new DatagramPacket(字节数组，开始位置，结束位置，地址，端口)
                //字节数组，开始位置，结束位置，地址，端口
                DatagramPacket datagramPacket = new DatagramPacket(someText.getBytes(), 0, someText.getBytes().length, InetAddress.getByName(toAddress), toPort);
                //3.阻塞发送.必须多线程.
                datagramSocket.send(datagramPacket);
                if (someText.toLowerCase() == "bye") {
                    flag = false;
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭 dataSocket.close()
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            //关闭scanner
            scanner.close();
        }
    }

    public Send发送(int myPort, String toAddress, int toPort) {
        this.toAddress = toAddress;
        this.toPort = toPort;
        this.myPort = myPort;
        this.flag = true;
    }
}
