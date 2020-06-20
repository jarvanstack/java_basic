package Java学习.opp.readWriteTxt读写文件;

import java.io.*;
import java.text.DecimalFormat;

/**
 * 文件的基本读取：
 * 1，
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        String url = "D:/Program Files/JetBrains/test1/Lab/src/Java学习/opp/readWriteTxt读写文件/Numbers.txt";
        read(url);
        String writeUrl = "D:/Program Files/JetBrains/test1/Lab/src/Java学习/opp/readWriteTxt读写文件/Write20_04_24.txt";
        write(writeUrl);
        System.out.println("===============");

    }
    private static void read(String url){
        try {
            FileReader fileReader = new FileReader(url);
            //建立一个对象，把文件转换为计算机能读懂的语言.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            //保留3位小数的模板
            DecimalFormat decimalFormat = new DecimalFormat("0.000");
            //new Double.parse

            while ((line = bufferedReader.readLine()) != null){
                //将字符串Double.valueOf(str)转换为double类型的数据并保留3位小数.
                //将字符串转化为0.000类型
                //line = decimalFormat.format(line);
                //将格式化后的line字符串转化为double再输出
                System.out.println(Double.valueOf(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件写入
     *
     * @param url
     * @throws IOException
     */
    private static void write(String url) throws IOException {
        File writeName = new File(url);//使用相对路径创建文件
        writeName.createNewFile();
        FileWriter fileWriter = new FileWriter(writeName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("this is "+i+" line /n");
        }
        bufferedWriter.flush();//把缓存区的内容压入文件.


    }
}
