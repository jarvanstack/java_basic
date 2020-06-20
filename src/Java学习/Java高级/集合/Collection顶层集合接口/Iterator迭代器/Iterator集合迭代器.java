package Java学习.Java高级.集合.Collection顶层集合接口.Iterator迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 一、集合有很多种，但是都可以用迭代器Iterator 来遍历，
 * 二、使用方法：
 *      1，迭代器是一个接口，不能直接new ，所有 Collection集合中都有一个iterator()方法用来返回迭代器.
 *          Iterator<String> iterator = arrayList.iterator();
 */
public class Iterator集合迭代器 {
    public static void main(String[] args) {
        //多态 左接口 右对象
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        //多态  左接口 右对象
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
