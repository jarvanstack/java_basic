package Java学习.Java高级.IO.File类.File类方法.File操作文件功能方法.遍历文件夹目录.练习2文件搜索Java类型文件;

import java.io.File;

/**
 * 一、需求：打印src中的所有.java 文件，
 * 二、拓展：
 *  1. string.contains(".java") 判断是否包含。
 *  2.string.toLowerCase().endWith(".java");
 *  转为小写
 *  判断是否以.java结尾。
 */
public class Demo {
    static void searchJava(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File listFile : listFiles) {
                if (listFile.isFile() && listFile.getName().contains(".java")) {
                    System.out.println(listFile.getName());
                } else if (listFile.isDirectory()) {
                    searchJava(listFile);
                }
            }
        }
    }

    public static void main(String[] args) {
        String url = "D://Program Files//JetBrains//test1//Lab//src";
        searchJava(new File(url));
    }

}
