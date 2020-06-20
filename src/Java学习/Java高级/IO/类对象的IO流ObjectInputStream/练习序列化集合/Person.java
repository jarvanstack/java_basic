package Java学习.Java高级.IO.类对象的IO流ObjectInputStream.练习序列化集合;

import java.io.Serializable;

/**
 * 设置类的序列号的ID未定制可以避免，类的序列号改变的异常。
 */
public class Person implements Serializable {
    private static long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
