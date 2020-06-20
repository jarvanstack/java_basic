package Java学习.opp.methodRewrite方法重写;

public class Demo {
/*
重写要求
1.子类重写父类:   继承关系，子类可以重写父类。
2.名字形参一致:   方法名字和形参必须一致，方法体可以不同
3.权限放大:       权限修饰符号只能变大:private -- default -- protected -- public
4.异常缩小：      抛出的异常的范围缩小，比如 ClassNotFoundException 的异常小于 <--- Exception.
 */

    public static void main(String[] args) {
        //输出子类的print 方法
        B b = new B();
        b.print();
        //父类A的new引用,指向了子类B的类型.
        A a = new B();
        a.print();

    }
}
