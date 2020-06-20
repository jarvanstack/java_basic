package Java学习.Java高级.集合.Collections工具集合类.sort排序ArrayList集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("王二麻子"));
        people.add(new Person("张三"));
        people.add(new Person("Lis"));
        people.add(new Person("李四"));
        System.out.println("-----------排序前：--------");
        System.out.println(people);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //名称长度排序,o1 - o2 升序。
                return o1.name.length() - o2.name.length();
            }
        });
        System.out.println("-----------排序后：--------");
        System.out.println(people);
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}