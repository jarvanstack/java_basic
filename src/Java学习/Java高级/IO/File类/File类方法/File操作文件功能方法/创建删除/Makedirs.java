package Java学习.Java高级.IO.File类.File类方法.File操作文件功能方法.创建删除;

import java.io.File;

public class Makedirs  {
    public static void main(String[] args) {
        String url = "D:\\Enviroment\\maven\\localRepository\\";
        String dirs = "mysql\\mysql-connector-java\\5." +
                "7.30\\";
        File d1 = new File(url + dirs);
        if (d1.exists()) {
            d1.delete();
        }
        d1.mkdirs();
        System.out.println("d1.mkdirs(): " + d1.mkdirs());
    }
}
