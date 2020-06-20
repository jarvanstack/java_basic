package Java学习.Java高级.IO.File类.File类方法.File操作文件功能方法.遍历文件夹目录.练习3FileFilter文件过滤器实现练习2;

import java.io.File;
import java.io.FileFilter;

/**
 *  * 一、需求：打印src中的所有.java 文件，,使用FileFilter文件过滤器
 *  二、使用方法 : 带参数的listFiles()
 *  file.listFiles(new FileFilter{}),重写过滤的accept方法即可。
 *  三、原理 listFiles(new FileFilter{}),
 *  1.获取File的list数组，
 *  2.将数组放到accept一个个判断
 *  3.true就保存起来。
 *
 */
public class Demo {
    static void useFileFiltersearchJava(File file) {
        File[] listFiles = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".java") || pathname.isDirectory();
            }
        });
        for (File listFile : listFiles) {
            if (listFile.isDirectory()) {
                useFileFiltersearchJava(listFile);
            } else if (listFile.isFile()) {
                System.out.println(listFile.getName());
            }
        }

    }

    public static void main(String[] args) {
        String url = "D://Program Files//JetBrains//test1//Lab//src";
        useFileFiltersearchJava(new File(url));
    }
}
