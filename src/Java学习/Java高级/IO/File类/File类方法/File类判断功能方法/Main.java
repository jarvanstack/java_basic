package Java学习.Java高级.IO.File类.File类方法.File类判断功能方法;

import java.io.File;

/**
 * 一、三个判断功能的方法：可用于获取或者操作文件之前的判断
 * 1. file.exist() :
 * 文件或者目录是否存在,路径不存在false
 * 2. file.isDirectory()
 * 文件目录是否文件夹结尾 路径不存在false
 * 3. file.isFile()
 * 文件目录是否文件结尾 路径不存在false
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("ExtendsTest2.java");
        System.out.println("--1. file.exist() :-----");
        System.out.println(file.exists());
        System.out.println("----2. file.isDirectory()---");
        System.out.println(file.isDirectory());
        System.out.println("----3. file.isFile() ---");
        System.out.println(file.isFile());

    }
}
