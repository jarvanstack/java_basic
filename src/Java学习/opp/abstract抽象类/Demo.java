package Java学习.opp.abstract抽象类;

/**
 * 1.抽象类其实就是一种约束.用于框架的搭建，减少开发代码量.
 * 2.抽象abstract 修饰的类可以写抽象方法和非抽象方法
 * 3.抽象类不能new ，只能被子类继承然后 new subclass子类.
 * 4.抽象类可以有 construction 构造方法
 */
public class Demo {
    public static void main(String[] args) {
        new Student().run();
        new Student().eat();
        //new Person();
    }
}
