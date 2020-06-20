package Java学习.网络编程.TCP_UDP.TCP通信代码实现;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 一、学习的2个类:
 * 1.Client套接字: Socket 创建Socket 对象，发出OutputStream 请求 ，服务端回复后，InputStream 收到回复
 * 创建Socket(String IP ，String port) 时候会自动和服务端Server3次握手建立联系
 * 2.Server 服务套接字: new ServerSocket(port) 开启服务等待连接
 * 二、步骤
 * 1.服务器新建ServerSocket对象，打开端口，
 * 2..accept()获取Socket开始监听客户端的请求
 * 3.客户端新建Socket，指定IP和端口连接服务端
 * 4.客户端使用getOutputStream 新建一个写入流准备写入字节到服务端
 * 5.服务端结接收到打印信息回复客户端
 * 6.客户端手接受来自服务端的信息，并打印
 * 7.客户端关闭,Socket()
 * 8.服务端关闭获取的Socket,然后关闭 ServerSocket
 */
public class Client用户 {
    public static void main(String[] args) throws IOException {
        //3.客户端新建Socket
        Socket localhost = new Socket("127.0.0.1", 8888);
        //4.客户端使用getOutputStream 新建一个写入流准备写入字节到服务端
        OutputStream outputStream = localhost.getOutputStream();
        //5 客户端调用outputStream.write()写入数据到服务端
        outputStream.write("客户端：调用outputStream.write()写入数据到服务端".getBytes());
        /**
         * 解决阻塞问题 read() 方法在没有文件继续输出的时候会阻塞
         */
        localhost.shutdownOutput();
        //6.客户端手接受来自服务端的信息，并打印
        InputStream inputStream = localhost.getInputStream();
        byte[] bytes2 = new byte[1024];
        int length = inputStream.read(bytes2,0,bytes2.length);
        System.out.println(new String(bytes2,0,length));
        //7.客户端关闭,Socket()
        localhost.close();
        /**
         * 问题：为什么接受不到服务端发送的信息呢???
         */
    }
}
