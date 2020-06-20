package Java学习.Java高级.集合.Collection顶层集合接口.Set集合接口.HashSet集合类.HashSet储存自定义类型元素;

import java.util.Objects;

/**
 * 一、  用来测试 自定类的 添加到 hashSet
 * 二、要想正常打印 alt + insert 重写 toString() 方法,可以打印 类中的属性 而不是地址
 * 三、要想add() 不同的对象，alt + insert 重写 hashSet() ,equals() 方法
 */
public class Person {
    private String name;

    public Person(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }

    private int ages;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ages == person.ages &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }
}
