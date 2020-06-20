package Java学习.Java高级.IO.File类.File类方法.File类获取功能的方法;

import java.io.File;

/**
 *一、4个获取功能的方法
 * 1. file.getAbsolutePath()
 * 返回不管file是相对路径还是绝对路径，都返回绝对路径
 * 2.getPath()
 * 就是普通的打印的toString()方法。
 * 3.getName()
 * 获取结尾部分，文件或者文件夹
 * 4.length()
 * 文件的大小，字节，文件夹没有大小(0)。
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--------1.getAbsolutePath(File file)-----");
        File file = new File("ExtendsTest2.java");
        System.out.println("获取绝对路径: "+file.getAbsolutePath());
        System.out.println("-----2.getPath()-----");
        System.out.println("获取file对象路径和toString相同： "+file.getPath());
        System.out.println("------3.getName()----");
        System.out.println("获取对象路径的结尾的名称(文件或者文件夹): "+file.getName());
        System.out.println("------4.length()-----");
        File file1 = new File(file.getAbsolutePath());
        System.out.println("获取文件的大小(字节)(文件夹和不存在的文件为0): "+file1.length());


    }
}
