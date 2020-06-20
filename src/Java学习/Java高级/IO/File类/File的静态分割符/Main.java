package Java学习.Java高级.IO.File类.File的静态分割符;

import java.io.File;

/**
 * 一、2个静态分割符号的字段field
 * 1. File.pathSeparator  路径分割符号 String 版(windows ; linux :)
 *    File.pathSeparatorChar 路径分割符 Char 类型
 * 2.File.separator 分割符 (windows / linux /)
 *   File.separatorChar 分割符Char类型
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("File.pathSeparator路径分割符号:windows:   "+ File.pathSeparator);
        System.out.println("File.Separator 分割符windows:   "+File.separator);
    }
}
