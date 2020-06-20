package Java学习.Java高级.IO.File类.File的3个构造方法;

import java.io.File;

/**
 * 一、
 * 1.File(String pathname)
 * 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 * 2.File(String parent, String child)
 * 从父路径名字符串和子路径名字符串创建新的 File实例。
 * 3.File(File parent, String child)
 * 从父抽象路径名和子路径名字符串创建新的 File实例
 * 4. 不常用：File(URI uri)
 * 二、File 重写了toString（）方法打印路径
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-----1.File(String pathname)------");
        File file = new File("D://Program Files//JetBrains//test1//Lab//src//Java学习" +
                "//Java高级//IO//File类//File的3个构造方法");
        System.out.println(file);//
        System.out.println("----------2.File(String parent, String child)------");
        File file1 = new File("D://Program Files//JetBrains//test1//Lab//src//Java学习",
                "//Java高级//IO//File类//File的3个构造方法");
        System.out.println(file1);
        System.out.println("--------3.File(File parent, String child)--------");
        File parantFile = new File("D://Program Files//JetBrains//test1//Lab//src//Java学习");
        File file2 = new File(parantFile, "//Java高级//IO//File类//File的3个构造方法");
        System.out.println(file2);
        System.out.println("父路径parentFile 用对象可以调用File的方法，诸多好处");
        System.out.println("最常用的是方法1 简单直接。");
    }
}
