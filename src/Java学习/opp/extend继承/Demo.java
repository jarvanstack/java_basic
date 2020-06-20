package Java学习.opp.extend继承;
// 1.Java 中所有的类都默认继承）Object类
// 2.Java只有单继承没，一个儿子只有一个爸爸

public class Demo {
    public static void main(String[] args) {
        //the own function (method)
        new Student().learn();
        //function (method) that extends from the Person class.
        new Student().eat();
    }
}
