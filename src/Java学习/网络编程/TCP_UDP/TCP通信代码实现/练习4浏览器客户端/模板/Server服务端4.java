package Java学习.网络编程.TCP_UDP.TCP通信代码实现.练习4浏览器客户端.模板;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 一、步骤
 * 1. 服务端while(true)执行，并accept()到一个Socket连接，新建一个线程，
 * 2. 新线程,接受信息,提取用用访问的文件的路径信息，
 * 3. 使用获取的页面的路径，是用本地流读取，使用HTTP协议网络流写入输出到浏览器，返回给客户端页面
 * @HTTP协议 固定写法
 *      outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
 *      outputStream.write("Content-Type:text/html\r\n".getBytes());
 *      //比如写入空行，不然浏览器不解析
 *      outputStream.write("\r\n".getBytes());
 *
 * 二、问题：
 * 1. 浏览器需要刷新2次服务端才能得到信息.访问成功？？？？，
 * 首次输入连接不行，关闭连接或者刷新才能得到提交的信息,
 * 删除while read，一次接受文件，会一次打印3次，提交的信息？？？？
 * 删除持续服务器的while true 无法打印连接后直接退出？？？
 */
public class Server服务端4 {
    public static void main(String[] args) {
        //声明和定义分离 1
        ServerSocket serverSocket = null;
        Socket accept = null;

        try {

            serverSocket = new ServerSocket(8888);
            System.out.println("服务端已经启动：" + serverSocket);
            /**
             * 1. 服务端while(true)执行，并accept()到一个Socket连接，新建一个线程，
             */
            while (true) {
                accept = serverSocket.accept();

                System.out.println("连接成功！ -- " + accept);
                //新线程
                if (accept != null) {
                    Socket finalAccept = accept;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            /**
                             * 2. 新线程,接受信息,提取用用访问的文件的路径信息，
                             * 提取用用访问的文件的路径信息：
                             * （1）. BufferReader.readLine() 可读取第一行的有用信息。
                             * 构造 new BufferReader(new InputStreamReader(finalAccept.accept()))
                             * 因为只有 InputStreamReader 才能接受 网络流的InputStream 变为为
                             * 可被BufferReader 构造的 Reader
                             */
                            //声明定义分离 2
                            InputStream inputStream = null;
                            BufferedReader bufferedReader = null;

                            try {
                                inputStream = finalAccept.getInputStream();
                                //提取有用信息
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                                String getUrl = bufferedReader.readLine().split(" ")[1];
                                String baseUrl ="D:/Program Files/JetBrains/test1/Lab";
                                String finalUrl = baseUrl +getUrl;
                                /**
                                 * 3. 使用获取的页面的路径，是用本地流读取，
                                 * 使用HTTP协议将：网络流写入输出到浏览器，返回给客户端页面
                                 * HTTP协议响应头固定写法：
                                 *
                                 */
                                FileInputStream fileInputStream = new FileInputStream(finalUrl);
                                OutputStream outputStream = finalAccept.getOutputStream();
                                /**
                                 * HTTP 响应头
                                 */
                                outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                                outputStream.write("Content-Type:text/html\r\n".getBytes());
                                //比如写入空行，不然浏览器不解析
                                outputStream.write("\r\n".getBytes());

                                byte[] bytes = new byte[1024 * 20];
                                int length = 0;
                                while ((length = fileInputStream.read(bytes))!= -1){
                                    outputStream.write(bytes,0,length);
                                }


                            } catch (IOException e) {

                            } finally {
                                //(2.1)
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                //(2.2)
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }).start();


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //(1.1)
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //(1.2)
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
