package Java学习.Java高级.集合.Collection顶层集合接口.List结合接口.LinkedList集合类;

import java.util.LinkedList;

/**
 * 一、数据结构：
 * 1.是一个双向的链表Linked结构，查询慢 增删快
 * <p>
 * 二、特性
 * 1.实现不是同步的(多线程)
 * 2.Linked数据结构提供一些操作第一个和最后一个元素的方法，因为链表让 他操作第一个元素很快。
 * 2.1 增：addFirst(e)   等效于：*** push(E e)***
 * addLast(e)等效于add()
 * 2.2 删: removeFirst()  等效于 ***pop()***
 * removeLast()
 * 2.3 查: getFirst()
 * getLast()
 */
public class LinkedList类 {
    public static void main(String[] args) {
        System.out.println("======增======");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1.第一个add()");
        linkedList.addFirst("2.第一个addFirst()");
        System.out.println(linkedList);//父类AbstractList的父类AbstractCollection重写了toString 方法。
        linkedList.push("3.第一个push()");
        System.out.println(linkedList);
        System.out.println("=========删============");
        LinkedList<String> linkedList2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList2.add("元素 " + (i + 1));
        }
        System.out.println("removeFirst()前：" + linkedList2);
        linkedList2.removeFirst();
        System.out.println("removeFirst()后：" + linkedList2);
        linkedList2.pop();
        System.out.println("pop()后：" + linkedList2);
        linkedList2.removeLast();
        System.out.println("removeLast()后：" + linkedList2);
        System.out.println("=========查===========");
        LinkedList<String> linkedList3 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList3.add("元素 " + (i + 1));
        }
        System.out.println("linkedList3: " + linkedList3);
        System.out.println("getFirst(): " + linkedList3.getFirst());
        System.out.println("getLast(): " + linkedList3.getLast());

    }
}
