package Java学习.网络编程.TCP_UDP.TCP通信代码实现.练习2新增规范异常处理和管道流;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 一、步骤
 * 1.客户端： new Socket(String ip,int port)
 * 2.客户端： getOutputStream 然后发送信息给服务端Server
 * 3.服务端 new ServerSocket(int port )
 * 4.服务端 getInputStream客户端的读取数据，要
 * 求读取时使用管道流字节数组输出流.ByteArraysOutputStream防止乱码
 * 二、注意规范，
 * 1. 流先开后关，
 * 2. 变量的声明和定义分离. ServerSocket serverSocket = null;
 * 3.finally 用于关闭流，进行判断 if ( io != null) io.close()
 */
public class Client客户端2 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //1.客户端： new Socket(String ip,int port)
            socket = new Socket("127.0.0.1", 8887);
            //2.客户端： getOutputStream 然后发送信息给服务端Server
            outputStream = socket.getOutputStream();
            outputStream.write("客户端： 发送请求信息".getBytes());
        } catch (IOException e) {

        } finally {
            //先开后关 (1)
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //先开后关（2）
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
