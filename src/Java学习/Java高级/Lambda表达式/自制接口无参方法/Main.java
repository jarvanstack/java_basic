package Java学习.Java高级.Lambda表达式.自制接口无参方法;

/**
 * 一、案例作用：对比使用内部类实现自制的无参抽象方法
 * 和使用lambda表达式实现.
 */
public class Main {
    //定义一个方法传递MyInterface接口对象，调用里面的PrintSomething()方法.
    private static void invockMyInterface(MyInterface myInterface){
        myInterface.printSomething();
    }
    public static void main(String[] args) {
        //1.内部类实现自制的无参抽象方法
        new MyInterface() {
            @Override
            public void printSomething() {
                System.out.println("1。 使用内部类实现无参的抽象方法.");
            }
        }.printSomething();
        //2.调用invokeMyInterface方法，参数是接口的对象，使用内部类实现该对象。
        invockMyInterface(new MyInterface() {
            @Override
            public void printSomething() {
                System.out.println("2.调用invokeMyInterface方法，参数是接口的对象，使用内部类实现该对象。");
            }
        });
        //3.使用lambda表达式代替2中的新建对象和重写方法。
        invockMyInterface(()->{
            System.out.println("3.使用lambda表达式代替2中的新建对象和重写方法。");
        });


    }
}
