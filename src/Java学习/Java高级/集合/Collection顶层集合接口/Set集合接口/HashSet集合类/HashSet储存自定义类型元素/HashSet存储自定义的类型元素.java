package Java学习.Java高级.集合.Collection顶层集合接口.Set集合接口.HashSet集合类.HashSet储存自定义类型元素;

import java.util.HashSet;

/**
 * 一、自定义元素：
 *      1.自所有权限public --private类必须重写 hashCode() 和 equals 方法(或者继承)，才能保证 添加的 对象唯一。
 * 二、要求：  同名，同年龄 的 Person ，只能储存一次
 *          1.重写Vehicle()可以打印元素而不是地址
 *          2.重写hashCode() equals() 可以防止添加相同field字段的元素，属性
 */
 class HashSet存储自所有权限public {
    public static void main(String[] args) {
        HashSet<Person> people=new HashSet<>();
        Person person1=new Person("person1",10);
        Person person2=new Person("person2",10);
        Person person3=new Person("person1",10);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        System.out.println(people);
        System.out.println("重写toString()可以打印元素而不是地址");
        System.out.println("重写hashCode() equals() 可以防止添加相同field字段的元素，属性");
    }
}
