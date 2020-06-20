package Java学习.网络编程.TCP_UDP.URL类;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 一、步骤
 * 1. 构造URL
 * 2.
 */
public class URL下载网络资源 {
    private void downLoad(String addressUrl) {
        try {


            String urlString = addressUrl;
            String localPath = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\网络" +
                    "编程\\TCP_UDP\\URL类\\download\\";
            //1. 构造URL
            URL url = new URL(urlString);
            //2. 连接到资源 HTTP
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            //3. getInputStream() 获得inputStream 的资源，新建本地流写入到本地
            InputStream inputStream = httpURLConnection.getInputStream();
            String[] strings = urlString.split("/");
            FileOutputStream fileOutputStream = new FileOutputStream(localPath + strings[strings.length - 1]);
            byte[] bytes = new byte[1024 * 10];
            int length;
            while ((length = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, length);
            }
            System.out.println("写入完成");
        } catch (IOException e) {

        } finally {

        }
    }

    public static void main(String[] args) throws IOException {

        String urlString = "http://localhost:8080/bmft/index.html";
        String urlString2 = "https://csdnimg.cn/feed/20200509/d7ade7b43ca6cae0536a4d36780540d2.png";
        URL下载网络资源 urlDownload = new URL下载网络资源();
        urlDownload.downLoad(urlString);
        urlDownload.downLoad(urlString2);

    }
}
