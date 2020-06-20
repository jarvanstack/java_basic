package Java学习.Java高级.IO.IO4大顶级类.Reader字符读取;

import java.io.FileReader;
import java.io.IOException;

/**
 * 一、构造：
 *  Reader reader = new FileReader(url);
 * 二、步骤
 * 1.构造
 * 2.read(char[],int index,int length)
 * 或者 read(char[])
 * 3.close()
 * 三：read()和
 * InputStream: read(byte[])
 * Reader: read(char[])
 * 会把字节或者字符 储存到 数组里，
 */
public class Mian {
    public static void main(String[] args) throws IOException {
        String url =  "D:\\Program Files\\JetBrains\\test1\\Lab" +
                "\\src\\Java学习\\Java高级\\IO\\IO\\Reader字符读取\\";
        FileReader fileReader = new FileReader(url + "test.txt");
        char[] chars = new char[1024];
        while (fileReader.read(chars,0,chars.length) != -1){
            System.out.println(new String(chars));
        }
    }
}
