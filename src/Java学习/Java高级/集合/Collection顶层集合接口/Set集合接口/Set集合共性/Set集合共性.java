package Java学习.Java高级.集合.Collection顶层集合接口.Set集合接口.Set集合共性;

import java.util.HashSet;
import java.util.Set;

/**
 * 一、继承 Collection：拥有 6 个常用 方法，
 * 二、特用：
 *      1.不允许重复：  元素，
 *      2.没有索引：   类似 Collection ，不能用普通for遍历
 *      3.元素限制： 一些实现禁止空元素，有些实现对类型要使用<E>泛型支持
 *      4.无序
 *
 */
public class Set集合共性 {
    public static void main(String[] args) {
        Set <String> set = new HashSet();
        set.add("元素 1");
        for (int i = 0; i < 5; i++) {
            set.add("元素 "+i);
        }
        System.out.println(set);
        System.out.println("1.无序，2.不允许重复");
    }
}
