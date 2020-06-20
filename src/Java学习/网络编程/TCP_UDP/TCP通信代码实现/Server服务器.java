package Java学习.网络编程.TCP_UDP.TCP通信代码实现;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 一、学习的2个类:
 * 1.Client套接字: Socket 创建Socket 对象，发出OutputStream 请求 ，服务端回复后，InputStream 收到回复
 * 创建Socket(String IP ，int port) 时候会自动和服务端Server3次握手建立联系
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
public class Server服务器 {
    public static void main(String[] args) throws IOException {
        //1.服务器新建ServerSocket对象，打开端口，
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.accept()获取Socket开始监听客户端的请求
        Socket accept = serverSocket.accept();
        //5.服务端结接收到打印信息回复客户端
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024*10];
        int length;
        while ((length = inputStream.read(bytes,0,bytes.length)) != -1){
            System.out.println(new String(bytes,0,length));
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("服务器： 已经收到信息".getBytes());
        outputStream.flush();
        //8.服务端关闭获取的Socket,然后关闭 ServerSocket
        accept.close();
        serverSocket.close();


    }
}
