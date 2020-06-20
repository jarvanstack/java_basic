package Java学习.网络编程.TCP_UDP.TCP通信代码实现.练习2新增规范异常处理和管道流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 主要的作用是ByteArrayOutputStream 用来读取防止字节不全导致的乱码问题
 * 步骤
 * 1.构造管道输出new  ByteArrayOutputStream();默认字节32
 * 2.write() 读取该内到ByteArrayOutputStream可以先不用输出
 * 3.toByteArray() 转化为储存了的长度的 字节数组
 *
 */
public class ByteArrayOutputStream教程 {

    public static void main(String args[]) throws IOException {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
        while (bOutput.size() != 10) {
            // 获取用户输入
            bOutput.write(System.in.read());
        }
        byte b[] = bOutput.toByteArray();
        System.out.println("Print the content");
        for (int x = 0; x < b.length; x++) {
            // 打印字符
            System.out.print((char) b[x] + "   ");
        }
        System.out.println("   ");
        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("转为大写 ");
        for (int y = 0; y < 1; y++) {
            while ((c = bInput.read()) != -1) {
                System.out.println(Character.toUpperCase((char) c));
            }
            //reset() 将缓冲区重置到标记位置。
            bInput.reset();
        }
    }

}
