package Java学习.Java高级.IO.编码格式转换流InputStreamReader.指定编码的读写;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 一、.写 OutputStreamWriter 继承 Writer（只是构造不同)----------
 * 1.构造 1.
 * OutputStreamWriter(OutputStream out)
 * 创建一个使用默认字符编码的OutputStreamWriter。
 * 2，构造2 .指定
 * OutputStreamWriter(OutputStream out, String charsetName)
 * 创建一个使用命名字符集的OutputStreamWriter。
 * 二、读取： 和一、一致
 *1.构造第一个参数为 InputStreamReader ,第二个参数为 String类型的字符编码名称.
 * ---------------------------------
 * 三、本类目的
 * @创建一个指定UTF-8的txt,然后用GBK和UTF-8依次读取测试：
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //创建一个utf-8 的文件
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java" +
                "学习\\Java高级\\IO\\编码格式转" +
                "换流InputStreamReader\\指定编码的读写\\";
        FileOutputStream fileOutputStream = new FileOutputStream(url + "嫌疑人.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
        outputStreamWriter.write("张三 李四 王五");
        outputStreamWriter.flush();
        outputStreamWriter.close();
        fileOutputStream.close();
        System.out.println("-------1.utf-8类型的txt定义成功-----");
        //使用指定的utf-8 来读取
        System.out.println("---------2.使用指定的utf-8 来读取——--------");
        FileInputStream fileInputStream = new FileInputStream(url + "嫌疑人.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"GBK");
        char[] chars = new char[1024*100];
        int length;
        while ((length = inputStreamReader.read(chars,0,chars.length))!=-1){
            System.out.println("GBK读取的嫌疑人："+ new String(chars,0,length));
        }
        inputStreamReader.close();
        System.out.println("--------3.使用utf-8来读取-----------");
        FileInputStream fileInputStream1 = new FileInputStream(url + "嫌疑人.txt");
        InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream1, StandardCharsets.UTF_8);
        int length2;
        while ((length2 = inputStreamReader1.read(chars,0,chars.length)) != -1){
            System.out.println("utf-8读取的嫌疑人："+new String(chars,0,length2));
        }


    }
}
