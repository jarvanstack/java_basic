package Java学习.网络编程.TCP_UDP.TCP通信代码实现.练习3上传文件_服务器一直开_文件不覆盖_多线程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

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
public class Server服务端3 {
    public static void main(String[] args) {
        //声明定义分离1
        ServerSocket serverSocket = null;
        Socket socket = null;
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\网络编程\\TCP_UDP\\TCP" +
                "通信代码实现\\练习3上传文件_服务器一直开_文件不覆盖_多线程\\imgs";
        try {
            //3. 服务端while(true)执行，如果accept()到一个Socket连接，新建一个线程，
            serverSocket = new ServerSocket(8887);
            System.out.println("服务端： 服务端启动成功");
            while (true) {
                socket = serverSocket.accept();
                if (socket != null) {
                    Socket socketExist = socket;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            //新建一个线程
                            //声明定义分离 2
                            InputStream inputStream = null;
                            String fileName = null;
                            BufferedOutputStream bufferedOutputStream = null;
                            OutputStream outputStream = null;
                            try {
                                //4.服务端新建线程里,完成创建文件夹，文件的命名，网络流读取，本地流写入，并返回上传成功的提示
                                File file = new File(url);
                                if (!file.exists()) {//如果文件夹不存在.
                                    file.mkdirs();//创建文件夹
                                }
                                inputStream = socketExist.getInputStream();
                                fileName = "\\" + socketExist.getInetAddress() + socketExist.getPort() + System.currentTimeMillis() + (new Random().nextInt(99999)) + ".png";
                                //网络流的读取，读取本地使用BufferOutputStream
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(url + fileName));
                                byte[] bytes = new byte[1024 * 100];
                                int length;
                                while ((length = inputStream.read(bytes)) != -1) {
                                    bufferedOutputStream.write(bytes, 0, length);
                                }
                                System.out.println("服务端： 接受成功 " + fileName);
                                //并返回上传成功的提示
                                outputStream = socketExist.getOutputStream();
                                outputStream.write("服务端：您已经上传成功！".getBytes());

                            } catch (IOException e) {
                                e.printStackTrace();
                            } finally {
                                //先进后出（2.1）
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                //先进后出（2.2）
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                //先进后出（2.3）
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
            //先进后出（1.1）
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //先进后出（1.2）
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
