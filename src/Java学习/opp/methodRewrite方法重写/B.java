package Java学习.opp.methodRewrite方法重写;

public class B extends A{
    //Override 重写，只有非static 静态才能重写.
    @Override
    public void print() {
        System.out.println("parent class A has been Overridden By subclass B -- function(method) print");
    }
}
