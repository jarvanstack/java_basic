package Java学习.网络编程.TCP_UDP.URL类;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 一、用处： URL 可以通过地址访问网络上的资源
 * 二、构造方法
 * 1. 最常用： URL(String url)
 * 三、常用发方法
 * 1.
 */
public class URL类基本用法 {
    public static void main(String[] args) {
        String urlString = "http://localhost:8080/bmft/index.html?username=bmft&password=123";
        try {
            URL url = new URL(urlString);
            System.out.println("获取协议Protocol："+url.getProtocol());
            System.out.println("获取主机Host："+url.getHost());
            System.out.println("端口port: "+url.getPort());
            System.out.println("文件路径Path: "+url.getPath());
            System.out.println("文件File: "+url.getFile());
            System.out.println("问题Query："+url.getQuery());
            System.out.println("权限Authority: "+url.getAuthority());
            System.out.println("用户信息："+url.getUserInfo());
            /*
            获取协议Protocol：http
            获取主机Host：localhost
            端口port: 8080
            文件路径Path: /bmft/index.html
            文件File: /bmft/index.html?username=bmft&password=123
            问题Query：username=bmft&password=123
            权限Authority: localhost:8080
            用户信息：null
             */

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
