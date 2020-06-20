package Java学习.Java高级.集合.Collection顶层集合接口.Iterator迭代器.增强for循环;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 目的：使用增强for循环遍历Collection集合和数组。
 * 一、增强for循环的的底层还是Iterator迭代器
 *      1.jdk1.5的新特性。
 * 二、使用方法：
 *      1.  collection.for 自动生成。下面语句：
 *      for (String s : collection) {
 *             System.out.println(s);
 *         }
 *
 */
public class 增强for循环 {
    public static void main(String[] args) {
        /**
         * 使用增强for循环遍历集合
         */
        //多态
        Collection <String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        for (String s : collection) {
            System.out.println(s);
        }
        /**
         * 使用增强for循环遍历数组：
         */
        System.out.println("======遍历数组=========");
        int[] arrayInt = {1,2,3,4,5,6};
        for (int i : arrayInt) {
            System.out.println(i);
        }
    }
}
