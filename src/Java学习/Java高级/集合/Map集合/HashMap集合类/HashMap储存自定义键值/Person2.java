package Java学习.Java高级.集合.Map集合.HashMap集合类.HashMap储存自定义键值;

import java.util.Objects;

/**
 * person2 类用来储存 HashMap的键，因为不唯一，所以必须保证哈希值的不唯一，因此
 * 重写hashCode（）和 equals（）方法
 * 还有toString（）用来打印
 */
public class Person2 {
    private String name;
    private int ages;

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return ages == person2.ages &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ages);
    }

    public Person2() {
    }

    public Person2(String name, int ages) {
        this.name = name;
        this.ages = ages;
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
