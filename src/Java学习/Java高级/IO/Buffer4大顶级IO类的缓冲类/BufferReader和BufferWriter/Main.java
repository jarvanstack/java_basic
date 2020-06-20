package Java学习.Java高级.IO.Buffer4大顶级IO类的缓冲类.BufferReader和BufferWriter;

import java.io.*;

/**
 * @BufferWriter有一个新的方法newLine换行
 * 类似BufferInputStream 详情看之前BufferInputStream的代码
 *  * 一、步骤
 *  1.new FileWriter 写
 *  2.new Buffer 写
 *  3.用 buffer的write("faff")写入文件
 *  4.刷新
 *  5.关闭
 *  二、读取
 *  1.new Reader
 *  2.new Buffer读取
 *  3.如果读取不为空，循环连续读取
 *  4.关闭
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\IO\\Buffer4大顶" +
                "级IO类的缓冲类\\BufferReader和BufferWriter\\";
        System.out.println("--------1.buffer写-----------------");
        //1.
        FileWriter fileWriter = new FileWriter(url + "嫌疑人.txt");
        //2.
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //3.
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("第"+i+"个字符串");
            bufferedWriter.newLine();//新的newLine()方法换行
        }
        //4.刷新
        bufferedWriter.flush();
        //5.close()
        bufferedWriter.close();
        System.out.println("----------------2.Buffer读取---------");
        //1
        FileReader fileReader = new FileReader(url + "嫌疑人.txt");
        //2.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //3,输出
        char[] chars = new char[1024];
        while (bufferedReader.read(chars,0,chars.length)!=- 1){
            System.out.println(chars);
        }
        //close
        bufferedReader.close();
        System.out.println("----------readLine()方法读一行-----------.");
        fileReader = new FileReader(url + "嫌疑人.txt");//Buffer
        BufferedReader bufferedReader1 = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader1.readLine()) != null){
            System.out.println(line);
        }

    }
}
