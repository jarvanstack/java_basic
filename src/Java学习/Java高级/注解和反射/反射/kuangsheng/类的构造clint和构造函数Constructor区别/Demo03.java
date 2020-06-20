package Java学习.Java高级.注解和反射.反射.kuangsheng.类的构造clint和构造函数Constructor区别;

/**
 * 1.子类和父类的类的构造<clinit>()的初始化
 * 子类的初始化发先父类没有初始化，就会先初始化父类，只有一次
 * 回答：1次
 *
 * 2.子类和父类的构造函数初始化constructor
 * 如果子类有多个实例，每个实例都初始化子类的构造函数，
 * 构造函数constructor 的初始化只有一次么？
 * 回答 ：多次
 * 不是，实例化子类 new Student的时候，是在堆空间中储存，
 * 父类构造函数的时候 堆空间会调用方法区的 class 父类，再次执行构造方法
 */
public class Demo03 {
    public static void main(String[] args) {
        new Student();
        new Student();
    }
}
class Person{
    public Person() {
        System.out.println("父类：Person构造函数加载");
    }
}
class Student extends Person{
    public Student() {
        System.out.println("子类：Student构造函数加载");
    }
}