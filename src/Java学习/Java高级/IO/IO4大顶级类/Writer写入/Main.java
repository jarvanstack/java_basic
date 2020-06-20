package Java学习.Java高级.IO.IO4大顶级类.Writer写入;

import java.io.*;

/**
 * 一、注意：Reader 是把数据写入到内存中，要使用flush刷新内存中的数据到硬盘
 * 二、构造方法和Reader一样
 * 三、常用方法
 * 1.write(char[] chars, int off, int len) 写道内存
 *  write(String string,int off, int length) 可以直接写字符串 String 代替 char[]；所以上面的代码还可以写为(更简洁)
 * 2.flush() 刷到硬盘
 * 3.close() 关闭流.
 * 四、步骤
 * 1.构造，使用多态
 * 2.write(char[] chars, int off, int len)
 * 3.flush()
 * 4.close()
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String url = "D:\\Program Files\\JetBrains\\tes" +
                "t1\\Lab\\src\\Java学习\\Java高级\\IO\\IO\\Writer写入\\文件写入测试.txt";
        Writer writer = new FileWriter(url,true);
        for (int i = 0; i < 10; i++) {
            String string = "这是第 "+(i+1)+"个字符串\n";
            writer.write(string);//写入内存，必须写入硬盘才行。
            writer.flush();//写入硬盘
            System.out.println("写入的字符为："+string);
        }
        writer.close();
    }
}
