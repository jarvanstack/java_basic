package Java学习.Java高级.IO.File类.File类方法.File操作文件功能方法.遍历文件夹目录;

import java.io.File;

/**
 * 一、2种方法。给出目录数组
 * 1.String[] list()
 *
 * 2.File[] listFiles()
 *
 * 二、注意：
 * 1.url不存在，file.list()返回空，再遍历就会 空指针异常
 * 2.url不是指定 目录 ，空指针异常 nullPointerException
 * 3.隐藏文件和文件夹也能识别
 */
public class Main {
    static String url = "D://Program Files//JetBrains//test1//Lab//src//J" +
            "ava学习//Java高级//IO//File类//File类方法//File操作文件功能方法";
    public static void main(String[] args) {
        System.out.println("----1.String[] list()------");
        File file1 = new File(url);
        String[] list = file1.list();
        if (list!=null){
            for (String s : list) {
                System.out.println(s);
            }
        }

        System.out.println("-----2.File[] listFiles()----");
        File file2 = new File(url);
        File[] listFiles = file2.listFiles();
        if(listFiles!=null){
            for (File listFile : listFiles) {
                System.out.println(listFile);
            }
        }
    }
}
