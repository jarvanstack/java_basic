package Java学习.网络编程.TCP_UDP.TCP通信代码实现.练习3上传文件_服务器一直开_文件不覆盖_多线程;

import java.io.*;
import java.net.Socket;

/**
 * 一、目的：做一个服务器，实现
 * 上传文件_服务器一直开_文件不覆盖_多线程
 * 二、步骤
 * 1.客户端Socket 连接 服务端
 * 2.客户端使用本地流，读取文件，使用网络流上传文件
 * 3. 服务端while(true)执行，并accept()到一个Socket连接，新建一个线程，
 * 4.服务端新建线程里,完成创建文件夹，文件的命名，网络流读取，本地流写入，并返回上传成功的提示
 * 5.客户端接受上传成功的提示.
 * 二、注意规范，
 * 1. 流先开后关，
 * 2. 变量的声明和定义分离. ServerSocket serverSocket = null;
 * 3.finally 用于关闭流，进行判断 if ( io != null) io.close()
 */
public class Client客户端3 {
    public static void main(String[] args) {

        //声明定义分离
        Socket socket = null;
        FileInputStream fileInputStream = null;
        OutputStream outputStream = null;
        try {
            //1.客户端Socket 连接 服务端
            socket = new Socket("127.0.0.1", 8887);
            //2.客户端使用本地流，读取文件，使用网络流上传文件
            String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\网络编程\\TCP_" +
                    "UDP\\TCP通信代码实现\\练习3上传文件_服务器一直开_文件不覆盖_多线程\\";
            fileInputStream = new FileInputStream(url + "img.png");
            outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024 * 10];
            while (fileInputStream.read(bytes) != -1) {
                outputStream.write(bytes);
            }
            //传输完成之后关闭网络输出流
            socket.shutdownOutput();
            //5.客户端接受上传成功的提示.
            InputStream inputStream = socket.getInputStream();
            //使用管道流防止字符乱码
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes1 = new byte[1024];
            int length;
            while ((length = inputStream.read(bytes1)) != -1) {
                byteArrayOutputStream.write(bytes1, 0, length);
            }
            System.out.println("收到回复：" + (new String(byteArrayOutputStream.toByteArray())));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //先开后关（1）
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //先开后关（2）
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //先开后关（3）
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
