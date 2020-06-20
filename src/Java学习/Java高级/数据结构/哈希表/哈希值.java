package Java学习.Java高级.数据结构.哈希表;

/**
 * 一、哈希表数据结构：
 * 1.什么是哈希表呢？  在jdk1.8之前，哈希表是由 数组+链表构成 ，同一个hash值的连表狗储存在一个链表里，
 * 但是当 hash值的元素较多时候，key值的查找效率 依次降低，
 * 2.在jdk1.8之后 ：   哈希表采用 数组 + 链表 + 红黑树 实现，当
 * 链表长度超过 8 时，将链表转为红黑树大大减少了查找的时间，
 * 二 、哈希值：
 * 1，什么是哈希值？  哈希值是一个10进制的int 类型的数(用来模拟地址，不是物理实际的地址）
 * 2.如何获得？     Object 有一个方法 ，hashCode()返回对象的哈希值
 * 二、地址值和哈希值的联系： 地址值就是的后面就是哈希值的十六进制形式，
 * 1.源码 toString（）
 * public String toString() {
 * return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * 三、字符串String类型重写了Object类的hashCode()方法，
 * 1.重地和通话的 hashCode()值 一致
 * 2，重写hashCode()想返回多少都可以
 */
public class 哈希值 {
    public static void main(String[] args) {
        Object object = new Object();
        Object object2 = new Object();
        System.out.println("object的哈希值: " + object.hashCode());
        System.out.println("object2的哈希值: " + object2.hashCode());

        System.out.println("object的对象地址: " + object);
        System.out.println("object2的对象地址: " + object2);
        //三、String类重写了hashCode()方法
        String s = new String("123");
        String s2 = new String("123");
        System.out.println("s的hashCode(): " + s.hashCode());
        System.out.println("s2的hashCode(): " + s2.hashCode());
        System.out.println("重地的hashCode(): " + "重地".hashCode());
        System.out.println("通话的hashCode(): " + "通话".hashCode());
        System.out.println("我们可以得出重地的hashCode() 和 通话的hashCode()一致这是一个特殊的情况");


    }
}
