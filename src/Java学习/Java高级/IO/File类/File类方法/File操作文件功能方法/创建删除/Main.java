package Java学习.Java高级.IO.File类.File类方法.File操作文件功能方法.创建删除;

import java.io.File;
import java.io.IOException;

/**
 * 一、 boolean file.createNewFile()
 * 1.文件目录不存在 抛出异常 IOException
 * 2.目录下的文件不存在返回false
 * 二、boolean delete() 没有走回收站非常危险
 * 1.删除该目录下的文件，或者文件目录，只有一层
 * 2.成功true
 * 三、boolean mkdir() :
 * 1.创建目录只能有一层
 * 四、mkdirs()
 * 1.可创建多层.
 */
public class Main {
    private static String url = "D://Program Files//JetBrains//test1//Lab//src//Java学习" +
            "//Java高级//IO//File类//File类方法//File操作文件功能方法//创建删除//";

    public static void main(String[] args) throws IOException {
        System.out.println("-------一a.createNewFile()----------");
        File a1 = new File(url + "新文件a1.txt");
        if(a1.exists()){
            a1.delete();
        }
        System.out.println("a1.createNewFile(): " + a1.createNewFile());

        System.out.println("-------二b.delete()----------");
        File b1 = new File(url + "新文件b1.txt");
        b1.createNewFile();
        System.out.println("b1.delete(): " + b1.delete());

        System.out.println("-------三c.mkdir()----------");
        File c1 = new File(url + "第一层dir");
        File c2 = new File(url + "2.1层//2.2层");
        if (c1.exists()) {
            c1.delete();
        }
        if (c2.exists()) {
            c2.delete();
        }
        System.out.println("一层c1: " + c1.mkdir());
        System.out.println("同时2层 c2： " + c2.mkdir());
        c1.delete();
        c2.delete();
        System.out.println("-------四d.----------");

        File d1 = new File(url + "同时3层第1层//同时3层第2层//同时3层第3层");
        if (d1.exists()) {
            d1.delete();
        }
        d1.mkdirs();
        System.out.println("d1.mkdirs(): " + d1.mkdirs());


    }
}
