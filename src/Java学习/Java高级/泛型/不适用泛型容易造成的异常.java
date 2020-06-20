package Java学习.Java高级.泛型;

import java.util.ArrayList;

/**
 *         1.创建ArrayList不使用<>具体泛型就默认Object类型。
 *                  ArrayList arrayList = new ArrayList();
 *         2.Object类型的好处是可以添加任意数据类型的数据，比如String 和 Integer
 *         3.但是你要使用String的length() 方法获取每一个元素的长度，就必须强制转型，
 *                   String s = (String)o;
 *         4.此时Integer 类型转型String就会出现异常
 */
public class 不适用泛型容易造成的异常 {
    public static void main(String[] args) {
        //创建ArrayList不使用<>具体泛型就默认Object类型。
        ArrayList arrayList = new ArrayList();
        //Object类型的好处是可以添加任意数据类型的数据，比如String 和 Integer
        arrayList.add("字符串1");
        arrayList.add("字符串2");
        arrayList.add(1);//integer (int)类型
        for (Object o : arrayList) {
            System.out.println(o);
        }
        //但是你要使用String的length() 方法获取每一个元素的长度，就必须强制转型，
        // 此时Integer 类型转型String就会出现异常
        for (Object o : arrayList) {
            String s = (String)o;
            System.out.println(s+" 的length()为："+s.length());
        }
    }
}
