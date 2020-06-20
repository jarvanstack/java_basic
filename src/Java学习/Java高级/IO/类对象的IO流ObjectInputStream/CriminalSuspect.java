package Java学习.Java高级.IO.类对象的IO流ObjectInputStream;

import java.io.Serializable;
//Serializable可序列化
public class CriminalSuspect implements Serializable {
    private String name;
    private int age;

    public CriminalSuspect(String name, int age) {
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
        return "CriminalSuspect{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
