package Java学习.Java高级.IO.IO4大顶级类.InputStream字节读取流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 一、构造方法
 *       InputStream inputStream = new FileInputStream(url+"test1.txt");
 * 二、常用方法
 *  1.read();读取一个字节
 *  2.int read(Byte[]);一次缓存多个字节，依次读取多个，建议1024*n
 *  3.close()  关闭读流。
 *  返回读取的字节数量.int
 * 三、拓展把 字节数组变为字符串--
 * 1. new String(byte[])
 * 2.new String(byte[],index,length )重索引index 开始，转换长度 Length
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Jav" +
                "a高级\\IO\\IO\\InputStream字节读取流\\";
        System.out.println("-------1.read()单个字节读取.----------");
        InputStream inputStream = new FileInputStream(url+"test1.txt");
        int indexByte;//文件接受
        while ((indexByte = inputStream.read())!=-1){
            System.out.println("单个字节为： "+indexByte);
        }
        System.out.println("---------2.read(byte[])多个字节读取--------");
        inputStream = new FileInputStream(url+"test1.txt");
        byte[] bytes = new byte[2];
        int length;
        length = inputStream.read(bytes);//记录读取的字节数量
        System.out.println("读取的字节数: "+length);
        System.out.println("读取的字节数组："+ Arrays.toString(bytes));
        System.out.println("字节数组转化为字符串： "+new String(bytes));
        System.out.println("=====2次读取,指针后移====");
        length = inputStream.read(bytes);//记录读取的字节数量
        System.out.println("读取的字节数: "+length);
        System.out.println("读取的字节数组："+ Arrays.toString(bytes));
        System.out.println("字节数组转化为字符串： "+new String(bytes));
        System.out.println("-----3.循环连续读取字符数组------");
        inputStream = new FileInputStream(url+"test1.txt");
        bytes = new byte[1024];
        length = 0;
        while ((length = inputStream.read(bytes))!=-1){
            System.out.println("读取的字节数组转化为拥有长度的字符串： "+new String(bytes,0,length));
        }
    }
}
