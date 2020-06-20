package Java学习.Java高级.Lambda表达式.Lambda表达式排序案例;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 一、需求：使用数组储存多个对象，
 * 对数组中的对象使用Array中的sort()方法进行自定义(升序)排序
 * 二、案例目的，用2中方法来实现只定义排序，
 * 1.匿名内部类
 * 2.lambda表达式。
 */
public class Main {
    public static void main(String[] args) {
        //创建数组储存多个数据元素.
        Person[] personArray = {
                new Person(3,"张三"),
                new Person(4,"李四"),
                new Person(5,"王五"),
        };
        //1.使用匿名内部类自定义排序。
        Arrays.sort(personArray, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAges()-o2.getAges();
                //o1 - o2 为升序
            }
        });
        System.out.println("--1.使用匿名内部类自定义排序。升序--");
        for (Person person : personArray) {
            System.out.println(person);
        }
        //2.使用lambda表达式排序，倒序
        Arrays.sort(personArray,(Person o1,Person o2)->{
            return o2.getAges()-o1.getAges();
        });
        System.out.println("----2.使用lambda表达式排序，倒序---");
        for (Person person : personArray) {
            System.out.println(person);
        }
    }
}
