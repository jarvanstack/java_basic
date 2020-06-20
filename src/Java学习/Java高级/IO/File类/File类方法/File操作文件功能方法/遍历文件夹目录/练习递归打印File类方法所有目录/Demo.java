package Java学习.Java高级.IO.File类.File类方法.File操作文件功能方法.遍历文件夹目录.练习递归打印File类方法所有目录;

import java.io.File;

/**
 * 目的：定义一个方法，传入File类型的目录，然后逐级打印，要有见隔和标识,--代表文件++代表文件夹
 * 比如：
 * ++文件夹
 * --文件1.txt
 * --文件2.txt
 * ++文件夹3
 * --文件31.txt
 * 二、步骤
 * 1.if 不是 null 开始遍历文件夹 如果是文件夹，再遍历
 * 三、注意
 * 1.问题如何得到有层次的文件夹，逐层打印。？？？？
 */
public class Demo {
    static void printFileDirector(File file) {
        System.out.println("++" + file.getName());
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File listFile : listFiles) {
                if (listFile.isFile()) {
                    System.out.println("  --" + listFile.getName());
                } else if (listFile.isDirectory()) {
                    printFileDirector(listFile);
                }
            }
        }
    }

    public static void main(String[] args) {
        String url = "D://Program Files//JetBrains//test1//Lab//src//J" +
                "ava学习//Java高级//IO//File类";

        printFileDirector(new File(url));
    }
}
