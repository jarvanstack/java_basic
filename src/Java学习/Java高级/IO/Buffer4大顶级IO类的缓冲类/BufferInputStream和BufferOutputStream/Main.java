package Java学习.Java高级.IO.Buffer4大顶级IO类的缓冲类.BufferInputStream和BufferOutputStream;

import java.io.*;

/**
 * 一、原理，读取单个字节太慢，5000毫秒
 * 我们用一个数组来代替很快 0毫秒就可以，Buffer就是一个默认长度的数组.
 * 二、BufferInputStream extends InputStream.继承所有方法使用方法一致
 * 三、构造
 * new BufferInputStream(InputStream inputStream,int size)
 * size 不写就是默认
 * 四、步骤
 * 1.new 读in和写Out的流
 * 2.new 读写的缓冲流
 * 3.再加字节数组双倍快乐
 * 4.如果不是-1读in出来，复制out出来.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\IO\\Buffer" +
                "4大顶级IO类的缓冲类\\BufferInputStream和BufferOutputStream\\";
        //1,
        FileInputStream fileInputStream = new FileInputStream(url + "img.png");
        FileOutputStream fileOutputStream = new FileOutputStream(url + "使用Buffer缓冲复制很快.png");
        //2.
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //3.
        byte[] bytes = new byte[1024*100];
        //4.
        long startTime = System.currentTimeMillis();
        while (bufferedInputStream.read(bytes,0,bytes.length)!= -1){//如果还有数据
            bufferedOutputStream.write(bytes,0,bytes.length);
        }
        bufferedOutputStream.flush();//刷新
        bufferedOutputStream.close();//关闭写，其实Buffer可以在关闭时候自动刷新了。
        bufferedInputStream.close();//关闭读
        System.out.println("复制800KB用时："+(System.currentTimeMillis()-startTime)+" 毫秒");
        System.out.println("多次测试得知缓冲默认size或者数组[1024]越大，复制越快");
    }
}
