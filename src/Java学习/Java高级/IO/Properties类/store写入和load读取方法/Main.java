package Java学习.Java高级.IO.Properties唯一可IO的集合.store写入和load读取方法;

import java.io.*;
import java.util.Properties;

/**
 * ---------------------1.store()----------
 * 一、2种不同的数据，Writer和InputStream,
 * comment 为注释,通常为 "" 空字符串
 * 1.void store(Writer writer ,String comment)
 *      写入字节，不可中文，中文必然乱码中文必然乱码
 * 2.void store(InputStream inputStream ,String comment)
 *      写入字符，可中文，推荐使用
 * 二、步骤
 * 1.创建对象
 * 2.添加数据 张三，李四，王五
 * 3.创建Writer对象
 * 4.使用 properties.store(writer,"");储存数据
 * 5.关闭writer.close()
 * ---------------------------2.load()--------------------------------
 * 一、 load(Reader reader)
 * 2种不同的数据，和 store使用一致，建议使用 Reader
 * 二、使用步骤：
 * 1.对象
 * 2.Reader
 * 3.load读取，键值文件。储值到对象里，不用返回
 * 4.Reader
 * 5.遍历properties输出
 * 三、注意：
 *   1.储值的文件中，键值的链接符号默认为，= 、空格
 *   2， # 井号为注释
 *   3.键值默认字符串，不用加 "" 引号
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("----------properties.store()写入----------");
        //1.
        Properties properties = new Properties();
        //2.
        properties.setProperty("张三","13");
        properties.setProperty("李四","14");
        properties.setProperty("王五","15");
        //3.Writer
        String url ="D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\IO\\Properti" +
                "es类\\store写入和load读取方法\\嫌疑人.txt";
        Writer writer = new FileWriter(url);
        //4.store
        properties.store(writer,"Criminal Suspect List");
        //5.writer.close()
        writer.close();
        System.out.println("---------2.properties.load()读取--------");
        //properties 对象
        Properties properties1 = new Properties();
        //2.writer 对象
        Reader reader  = new FileReader(url);
        //3.硬盘取值load(Reader)到内存中
        properties1.load(reader);
        //4.关闭输出流读文件流
        reader.close();
        //5.遍历输出
        for (String key : properties1.stringPropertyNames()) {
            System.out.println("key: "+key+"------value: "+properties1.getProperty(key));
        }
    }
}
