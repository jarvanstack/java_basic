package Java学习.opp.abstract抽象类;

public abstract class Person {
    Person(){
        System.out.println("Person class construction method run successfully.构造器运行成功.");
    }
    public abstract void run();
    public void eat(){
        System.out.println("the Person can eat something.");
    }
}
