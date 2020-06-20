package Java学习.网络编程.TCP_UDP.TCP通信代码实现.练习2新增规范异常处理和管道流;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 一、步骤
 * 1.客户端： new Socket(String ip,int port)
 * 2.客户端： getOutputStream 然后发送信息给服务端Server
 * 3.服务端 new ServerSocket(int port ) 开放端口,并 accept() 获得 客户端的Socket()
 * 4.服务端 getInputStream客户端的读取数据，要
 * 求读取时使用管道流字节数组输出流.ByteArraysOutputStream防止乱码
 * 二、注意原则，
 * 1. 流先开后关，
 * 2. 变量的声明和定义分离. ServerSocket serverSocket = null;
 * 3.finally 用于关闭流，进行判断 if ( io != null) io.close()
 */
public class Server服务端2 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //3.服务端 new ServerSocket(int port ) 开放端口,并 accept() 获得 客户端的Socket()
            serverSocket = new ServerSocket(8887);
            socket = serverSocket.accept();
            //4.服务端 getInputStream客户端的读取数据，要
            inputStream = socket.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024 * 10];
            int length;
            while ((length = inputStream.read(bytes, 0, bytes.length)) != -1) {
                byteArrayOutputStream.write(bytes, 0, length);
            }
            byte[] bytes1 = byteArrayOutputStream.toByteArray();
            System.out.println("收到的信息为： " + (new String(bytes1)));
        } catch (IOException e) {

        } finally {
            //先开后关(1)
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //先开后关(2)
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //先开后关(3)
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //先开后关(4)
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
