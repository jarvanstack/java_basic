package Java学习.Java高级.集合.Collection顶层集合接口.List结合接口.ArrayList集合类;

import java.util.ArrayList;

/**
 * 1.   解决对象数组的长度不可变的问题。
 * 2.   ArrayList<E> E 表示泛型，规范ArrayList只能储存的数据类型
 * 注意：泛型只能是引用类型不能是基本类型
 * 3.    直接 sout arrayList 对象得到的是一个数组[],
 *      因为ArrayList的父类AbstractList的父类AbstractCollection重写了toString 方法。
 * 4.    remove() 方法会返回 删除的对象。
 *
 * 一、数据结构：
 *      1，数组Array结构，查询快增删慢
 * 二、
 *      1.不是同步的（可多线程）
 */
public class ArrayList类 {
    public static void main(String[] args) {
        //从 jdk 1.7 开始，右侧可以不用指定类型
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        arrayList.add("第一个String元素");
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        arrayList.add("第二个元素");
        System.out.println("移除的元素是: "+arrayList.remove(0));

    }
}
