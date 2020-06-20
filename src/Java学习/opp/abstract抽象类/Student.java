package Java学习.opp.abstract抽象类;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("Override the abstract method,继承抽象类需要重写方法.成功!");
    }
}
