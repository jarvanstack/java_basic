package Java学习.Java高级.IO.IO4大顶级类.OutputStream字节写入流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 写入数据  内存---------硬盘
 * 一、步骤
 * 1.创建FileOutputStream对象，抽象类，用多态
 *
 * 2.写入数据 fileOutputStream.write(): 3 种方法。
 *      1.abstract void write(int b)
 *      将指定的字节写入此输出流
 *      2.void write(byte[] b)
 *      将 b.length字节从指定的字节数组写入此输出流。
 *      3.void write(byte[] b, int off, int len)
 *      从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
 *
 * 3.刷新缓存：fileOutputStream.flush();
 *
 * 4.关闭流，节省内存： fileOutputStream.close()
 */
public class Main {
    public static void main(String[] args)  {
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java" +
                "高级\\IO\\IO4大顶级类\\OutputStream字节写入流\\";
        FileOutputStream fileOutputStream = null;
        try {
            System.out.println("-----------单个字符测试----------");
            fileOutputStream = new FileOutputStream(url+"单个字符测试.txt");
            fileOutputStream.write('a');
            fileOutputStream.flush();
            System.out.println("-------字符数组---------");
            System.out.println("如果字节是正数(0-127)显示的查询ASCII表");
            System.out.println("如果是负数，就会第一个字节和第二个字节组成中文显示，查询默认码表（GBK）表");
            FileOutputStream fileOutputStream1 = new FileOutputStream(url + "字符数组.txt");
            byte[] bytes1 = {65,66,67,68,69,'\n'};
            byte[] bytes2 = {-65,-66,-67,-68,-69};
            fileOutputStream1.write(bytes1);//ABCDE
            fileOutputStream1.flush();
            fileOutputStream1.write(bytes2);
            fileOutputStream1.flush();
            fileOutputStream1.close();
            System.out.println("------3.写入指定部分的字节----");
            FileOutputStream fileOutputStream2 = new FileOutputStream(url + "写入指定部分的字节.txt");
            fileOutputStream2.write(bytes1,1,2);//索引为1，长度为2 BC
            fileOutputStream2.flush();
            fileOutputStream2.close();
            System.out.println("-----4.字符串getByte()转字节实现写入字符串---------");
            FileOutputStream fileOutputStream3 = new FileOutputStream(url + "字符串getByte()转字节实现写入字符串.txt");
            String string = "半亩方糖";
            byte[] bytes4 = string.getBytes();
            System.out.println(Arrays.toString(bytes4));//数组转为字符串，再打印.UTF-8是3个字节一个中文
            //[-27, -115, -118, -28, -70, -87, -26, -106, -71, -25, -77, -106]会变成数字字符.
            fileOutputStream3.write(bytes4);
            fileOutputStream3.flush();
            fileOutputStream3.close();
            System.out.println("=======5.append往后添加而不覆盖写入============");
            FileOutputStream fileOutputStream4 = new FileOutputStream(url + "往后添加而不覆盖写入", true);
            fileOutputStream4.write(("hello OutputStream").getBytes());
            for (int i = 0; i < 5; i++) {
                fileOutputStream4.write("Hi OutputStream\n".getBytes());
            }
            System.out.println("要执行2次文件看效果");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
