package Java学习.opp.Polymorphism多态;
/*
一、多态存在条件:

二、多态注意事项:
1.多态是方法的多态，属性没有多态.
2.必须是子类和父类parent.不然会出现异常，ClassCastException.类的类型转化异常.
3.存在条件：父类引用指向子类对象, 父左子右 ---  Person person = new Student();

 */
public class Demo {
    public static void main(String[] args) {
        //父类的引用指向了子类.能用类型的方法只和左边引用类型有关.
        Person student = new Student();
        //student.learn();此时Student有learn() 方法却不能用，因为能用方法和属性只和左边的 引用传递类型有关》

    }
}
