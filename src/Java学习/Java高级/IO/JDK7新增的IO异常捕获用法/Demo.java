package Java学习.Java高级.IO.JDK7新增的IO异常捕获用法;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 把异常的IO的声明写到try() 的小括号里，try执行完，生命周期结束,后会自动释放IO，
 */
public class Demo {
    public static void main(String[] args)  {
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Jav" +
                "a学习\\Java高级\\IO\\JDK7新增的IO异常捕获用法\\";
        System.out.println("---------1.单个字节读写效率慢-----");

        try (
            FileOutputStream fileOutputStream1 = new FileOutputStream(url + "多字节快复制.png");
            FileInputStream fileInputStream1 = new FileInputStream(url + "img.png");
            )
       {
            byte[] bytes = new byte[1024*100];
            while (fileInputStream1.read(bytes,0,bytes.length)!=-1){
                fileOutputStream1.write(bytes,0,bytes.length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
