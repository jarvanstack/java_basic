package Java学习.Java高级.IO.类对象的IO流ObjectInputStream;

import java.io.*;

/**
 * 要求：储存一个实例化的CriminalSuspect 嫌疑人对象 到txt文件，然后读取出来.
 *
 * 一、作用 ： 对象IO流可以储存和取出对象的序列,
 * 要求 对象必须实现接口 序列化接口》
 * @Serializable
 * @transient 瞬态关键字体，被 transient 或者 static 修饰的成员变量Attributes 不能被序列化.
 * 二、使用方法
 * 1.构造
 * new ObjectOutputStream(FileOutputStream )
 * 2.写入方法
 * writeObject(new Object),当然你也可以自定义类。
 * -------------
 * 3.新建 new ObjectInputStream(FileOutputStream )
 * 4.读取数据readObject() 返回为一个Object对象
 * 三、步骤
 * 1.new ObjectOutputStream(FileOutputStream )
 * 2.写入数据.writeObject(new Object)
 * 3.刷新关闭
 * 4.新建 new ObjectInputStream(FileOutputStream )
 * 5.读取数据readObject() 返回为一个Object对象
 * 6.关闭
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\IO\\类对象" +
                "的IO流ObjectInputStream\\";
        //1..new ObjectOutputStream(FileOutputStream )
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(url + "新建的CriminalSuspect嫌疑人实例的序列化.txt"));
        // * 2.写入数据.writeObject(new Object)
        CriminalSuspect criminalSuspect = new CriminalSuspect("张三", 13);
        objectOutputStream.writeObject(criminalSuspect);
        objectOutputStream.write(1);
        objectOutputStream.writeInt(1);
        //3刷新关闭
        objectOutputStream.flush();
        objectOutputStream.close();
        //4.新建 new ObjectInputStream(FileOutputStream )
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(url + "新建的CriminalSuspect嫌疑人实例的序列化.txt"));
        //读取数据readObject() 返回为一个Object对象
        Object object = objectInputStream.readObject();
        System.out.println(object);
        objectInputStream.close();
    }

}
