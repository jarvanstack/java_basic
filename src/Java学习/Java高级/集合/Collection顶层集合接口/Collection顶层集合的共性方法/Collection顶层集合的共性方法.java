package Java学习.Java高级.集合.Collection顶层集合接口.Collection顶层集合的共性方法;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 一、共性方法：
 *      1.add():    添加对象到集合
 *      2.remove(E e):  移除对象
 *      3.size():       返回集合个数
 *      4.toArray():    放回集合转化的数组
 *      5.isEmpty():    返回true，集合为空
 *      6.contains(E e):   返回true ，集合包含该对象
 * 二、打印Collection时候和ArrayList一致，打印为数组，因此重写了toString方法
 */
public class Collection顶层集合的共性方法 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("第一个元素");

    }
}
