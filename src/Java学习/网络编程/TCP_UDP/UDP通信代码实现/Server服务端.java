package Java学习.网络编程.TCP_UDP.UDP通信代码实现;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 服务端
 * 一、步骤 数据套接字
 * 1.构造开端口 ： new DatagramSocket(8888)
 * 2.创建接受数据包的格式 new DatagramPacket(buffer,0,buffer.length),
 * 接受的数据储存到数据包里，到时候输出使用数据包
 * 3.阻塞接受数据 datagramSocket.receive(datagramPacket)
 * 4.关闭datagramSocket
 */
public class Server服务端 {
    public static void main(String[] args) {
        while (true) {
            //声明定义分离
            DatagramSocket datagramSocket = null;
            try {
                // 1.构造开端口 ： new DatagramSocket(8888)
                datagramSocket = new DatagramSocket(8888);
                //2.创建接受数据包的格式 new DatagramPacket(buffer,0,buffer.length)
                byte[] buffer = new byte[1024 ];
                DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
                //3.阻塞接受数据 datagramSocket.receive(datagramPacket)
                datagramSocket.receive(datagramPacket);
                //4.输出接受的数据
                System.out.println("文件来源："+datagramPacket.getAddress()+":"+datagramPacket.getPort());
                byte[] data = datagramPacket.getData();
                System.out.println("文件长度: "+datagramPacket.getLength()+" 字节");
                System.out.println("文件内容： "+(new String(data,0,datagramPacket.getLength())));
                //4.关闭 datagramSocket
                datagramSocket.close();
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
            }
        }
    }
}
