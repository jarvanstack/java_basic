package Java学习.Java高级.IO.编码格式转换流InputStreamReader.练习吧GBK的文件转化为UTF8的文件;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 练习：
 * 新创建GBK字符文件，转化练习吧GBK的文件转化为UTF8的文件
 * 一、转换；
 * new GBK 的读取
 * new utf-8写入
 * 读取后写入.
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //新创建GBK字符文件
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\IO\\编码" +
                "格式转换流InputStreamReader\\练习吧GBK的文件" +
                "转化为UTF8的文件\\";
        FileOutputStream fileOutputStream = new FileOutputStream(url + "GBK嫌疑人.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
        outputStreamWriter.write("张三 李四 王五");
        outputStreamWriter.flush();
        outputStreamWriter.close();
        fileOutputStream.close();
       // * 一、转换；
        // * new GBK 的读取
        // * new utf-8写入
        // * 读取后写入.
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(url + "GBK嫌疑人.txt"), "GBK");
        OutputStreamWriter outputStreamWriter1 = new OutputStreamWriter(new FileOutputStream(url + "转换后utf-8的嫌疑人.txt"), StandardCharsets.UTF_8);
        char[] chars = new char[1024*10];
        int length ;
        while ((length = inputStreamReader.read(chars,0,chars.length))!=-1){
            String string = new String(chars,0,length);
        outputStreamWriter1.write(string);
    }
        outputStreamWriter1.flush();
        outputStreamWriter1.close();
        inputStreamReader.close();



}
}
