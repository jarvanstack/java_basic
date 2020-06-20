package Java学习.Java高级.集合.Collections工具集合类.自定义类重写排序方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 这个Main主要用来：
 * ，自定义类继承 Comparable 接口，重写CompareTo() 方法，
 *  来实现自定义默认的Collections.sort(arrays)排序
 *  二、定义排序必须
 *          1.新建排序器Comparator:  sort(arrays,new Comparator<?> ())
 *          2.return o1 - o2 即为升序.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person1> arrayList = new ArrayList<>();
        Person1 张三 = new Person1("张三", 18);
        Person1 李四 = new Person1("李四", 18);
        Person1 王五 = new Person1("王五", 19);
        Collections.addAll(arrayList,张三,李四,王五);
        System.out.println("排序前："+arrayList);
        //自定义排序--倒序
        Collections.sort(arrayList, new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                if(o1.getAge() == o2.getAge()){
                    return o2.getName().charAt(0) - o1.getName().charAt(0);
                }
                else {
                    return o2.getAge() - o1.getAge();
                }
            }
        });
        System.out.println("排序后："+arrayList);
    }
}