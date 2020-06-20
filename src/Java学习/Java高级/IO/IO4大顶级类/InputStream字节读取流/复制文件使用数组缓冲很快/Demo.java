package Java学习.Java高级.IO.IO4大顶级类.InputStream字节读取流.复制文件使用数组缓冲很快;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 注意先关闭写的流，因为写完了，就一定读取完了，不然会数据丢失
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\IO\\IO4大" +
                "顶级类\\InputStream字节读取流\\复制文件使用数组缓冲很快\\";
        System.out.println("---------1.单个字节读写效率慢-----");
        FileInputStream fileInputStream1 = new FileInputStream(url + "img.png");
        FileOutputStream fileOutputStream1 = new FileOutputStream(url + "单字节慢复制.png");
        byte[] bytes1 = new byte[1];
        long startTime = System.currentTimeMillis();
        while (fileInputStream1.read(bytes1) != -1){//开始单个字节的读取
            fileOutputStream1.write(bytes1);//单个文件的写入
        }
        System.out.println("复制单个字节图片文件用时："+(System.currentTimeMillis()-startTime)+" 毫秒");
        fileOutputStream1.close();//先关闭写
        fileInputStream1.close();//再关闭读
        System.out.println("----------1024*n 的字节读取效率快-----");
        FileInputStream fileInputStream2 = new FileInputStream(url + "img.png");
        FileOutputStream fileOutputStream2 = new FileOutputStream(url + "多字节快复制.png");
        byte[] bytes2 = new byte[1024*100];
        long startTime2 = System.currentTimeMillis();
        while (fileInputStream2.read(bytes2) != -1){//开始1024*100字节的读取
            fileOutputStream2.write(bytes2);//1024*100字节的的写入
        }
        System.out.println("复制800KB,80_0000字节图片文件用时："+(System.currentTimeMillis()-startTime2)+" 毫秒");
        fileOutputStream2.close();//先关闭写
        fileInputStream2.close();//再关闭读
    }
}
