package Java学习.Java高级.常用类.基本数据类型包装类;

import java.util.ArrayList;

/**
 * 包装类可以自动拆箱和装箱。jdk 1.5 后的新特性
 */
public class 包装类的自动拆箱和装箱 {
    public static void main(String[] args) {
        /**
         * 自动装箱： int 类型 --  Integer类型
         * Integer integer = 1;  == Integer integer = new Integer(1)
         */
        Integer integer = 1;
        System.out.println("integer： " + integer);
        /**
         * 自动拆箱： Integer 类型 --  int 类型
         *integer = integer + 1;  ==    integer = integer.inValue() + 1
         */
        integer = integer + 1;
        System.out.println("integer + 1 后： " + integer);

        /**
         *ArrayList<Integer> arrayList 只能存储 Integer 类型的数据
         *
         *1.    arrayList.add(1);//自动装箱         1 -- new Integer(1)
         *2.    自动拆箱    arrayList.get(0)--arrayList.get(0).intValue()
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);//自动装箱         1 -- new Integer(1)
        System.out.println("arrayList:" + arrayList);
        int b = arrayList.get(0); //自动拆箱    arrayList.get(0)--arrayList.get(0).intValue()

    }
}
