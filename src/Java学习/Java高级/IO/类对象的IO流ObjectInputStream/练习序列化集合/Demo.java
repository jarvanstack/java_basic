package Java学习.Java高级.IO.类对象的IO流ObjectInputStream.练习序列化集合;

import java.io.*;
import java.util.ArrayList;

/**
 * 一、要求：在文件中保存多个对象
 * 二、步骤；
 * 1.new ArrayList<Person>()新建结合
 * 2.在集合中添加对象
 * 3.序列化集合ArrayList
 * 4.反序列化集合并遍历输出
 */
public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.
        ArrayList<Person> personArrayList = new ArrayList<>();
        //2
        personArrayList.add(new Person("张三",13));
        personArrayList.add(new Person("李四",14));
        personArrayList.add(new Person("王五",15));
        //3序列化集合
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\IO\\类对象" +
                "的IO流ObjectInputStream\\练习序列化集合\\集合的序列化.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(url));
        objectOutputStream.writeObject(personArrayList);
        objectOutputStream.flush();
        objectOutputStream.close();
        //4.反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(url));
        Object object = objectInputStream.readObject();
        System.out.println("反序列化的对象object： "+object);
        System.out.println("强转然后遍历输出结果:");
        personArrayList = (ArrayList<Person>)object;
        for (Person person : personArrayList) {
            System.out.println(person);
        }
    }
}
