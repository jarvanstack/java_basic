package Java学习.Java高级.集合.Collection顶层集合接口.Set集合接口.LindedHashSet集合类有序的HashSet;

import java.util.LinkedHashSet;

/**
 * 一、 实现元素有序
 * java.util.LinkedHashSet集合， extends hashSet 集合
 * 二 、特点
 *      1，数据结构： 哈希表(Arrays + Linked + 红黑树) + 链表
 *      多了一条链表，用来记录储存顺序，保证元素有趣。
 *      2.
 */
public class LinkedHashSet集合类 {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        for (int i = 0; i < 5; i++) {
            strings.add("元素 "+ i);
        }
        System.out.println(strings);
        System.out.println("可以知道元素是有序的");
    }
}
