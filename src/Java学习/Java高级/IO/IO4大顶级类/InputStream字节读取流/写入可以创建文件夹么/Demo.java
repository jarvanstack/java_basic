package Java学习.Java高级.IO.IO4大顶级类.InputStream字节读取流.写入可以创建文件夹么;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写入可以创建文件夹子么
 */
public class Demo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/Enviroment/demo.txt");
            fos.write('a');

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
