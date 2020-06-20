package Java学习.网络编程.TCP_UDP.UDP通信代码实现;

import java.io.IOException;
import java.net.*;

/**
 * 客户端
 * 一、 步骤 DatagramSocket
 * 1. 构造开端口 new DatagramSocket(8888)
 * 2. 做一个发送包，指定目标地址，和端口 new DatagramPacket(字节数组，开始位置，结束位置，地址，端口)
 * 3. 发送 datagramSocket.send()
 * 4. 关闭 dataSocket.close()
 * 二、 问题
 * 1. 在本机上测试新建的 客户端端口 new DatagramSocket(888*) 不因该和服务端一致
 * 会异常，端口占用，创建是因该用不同的端口，连接时候连接对应的端口
 * 2. 问题2 如何解决多包的问题和读取传输包的字节。
 */
public class Client客户端 {
    public static void main(String[] args) {
        //构造定义分离
        try {
            //1. 构造开端口 new DatagramSocket(8888)
            DatagramSocket datagramSocket = new DatagramSocket(8889);
            //2. 做一个发送包，指定目标地址，和端口 new DatagramPacket(字节数组，开始位置，结束位置，地址，端口)
            String someText= "客户端： 这是客户端发送的信息";
            InetAddress inetAddresses = InetAddress.getByName("localhost");
            //字节数组，开始位置，结束位置，地址，端口
            DatagramPacket datagramPacket = new DatagramPacket(someText.getBytes(), 0, someText.getBytes().length, inetAddresses, 8888);
            //3.
            datagramSocket.send(datagramPacket);
            //4. 关闭 dataSocket.close()
            datagramSocket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
