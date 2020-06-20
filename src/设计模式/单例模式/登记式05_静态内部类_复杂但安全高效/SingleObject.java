package 设计模式.单例模式.登记式05_静态内部类_复杂但安全高效;

/**
 * 作用： 定义单例模式
 * 5.定义静态内部类里成员变量初始化 实例
 * getInstance（）返回静态内部类的静态成员变常量
 */
public class SingleObject {
    //定义静态内部类里成员变量初始化 实例
    private static class StaticInnerClass {
        private static final SingleObject instance = new SingleObject();
    }

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        //返回静态内部类的静态成员变常量
        return StaticInnerClass.instance;
    }

    public void printSomeText() {
        System.out.println("单例模式: 调用方法printSomeText()成功 ");
    }
}
