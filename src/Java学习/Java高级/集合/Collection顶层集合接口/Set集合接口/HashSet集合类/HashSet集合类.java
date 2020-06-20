package Java学习.Java高级.集合.Collection顶层集合接口.Set集合接口.HashSet集合类;

import java.util.HashSet;

/**
 * 一：继承Set的共性：
 *      1.不允许重复，
 *      2.没有索引 ，不能普通 for遍历
 *      3.无序的集合，存入和去除的顺序可能不一样，
 *      4.底层是一个 hash表结构 ，查询的速度十分快，（hash 表结构是一种特殊的数组结构）
 * 二、哈希表结构：
 *      1.采用数组 + 链表 + 红黑树 很快，具体查询相关数据结构。
 *
 */
public class HashSet集合类 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("元素 1");
        for (int i = 0; i < 5; i++) {
            hashSet.add("元素 "+i);
        }
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("可见输出是无序的，而且只有一个 元素 1(不可重复)");
    }
}
