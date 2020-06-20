package Java学习.Java高级.注解和反射.反射.kuangsheng.所有类型的Class对象;

import java.lang.annotation.ElementType;

/**
 * 一、哪些类型可以有Class？几乎所有类型
 * 比如：
 * 1. 类
 * 2.接口
 * 3.数组
 * 4.注解
 * 5.枚举 ElementType.class
 * 6.void类型
 * 7.Class自己
 * 二、
 * 只要元素类型和维度一样就是同一个Class.
 * 三、操作技巧!!!
 * 1. alt + 可以竖向选择!!!
 * 2. ctrl + d 可以复制一行并直接粘贴到下一行.!!!效率
 */
public class Demo02 {
    public static void main(String[] args) {
        Class c1 = Object.class;//1. 类
        Class c2 = Comparable.class;//2.接口 Comparable
        Class c3 = int[].class;//3.数组
        Class c4 = Override.class;//4.注解
        Class c5 = ElementType.class;//5.枚举 ElementType.class
        Class c6 = void.class;//6.void类型
        Class c7 = Class.class;//7.Class自己
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println("------只要元素类型和维度一样就是同一个Class--------");
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        System.out.println("a的类: "+a.getClass()+"   和hashcode:   "+a.getClass().hashCode());
        System.out.println("b的类: "+b.getClass()+"   和hashcode:   "+b.getClass().hashCode());

    }
}
