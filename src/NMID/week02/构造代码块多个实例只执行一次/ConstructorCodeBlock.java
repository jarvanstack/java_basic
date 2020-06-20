package NMID.week02.构造代码块多个实例只执行一次;

public class ConstructorCodeBlock {
    static {
        System.out.println("static修饰的构造代码块： 运行成功");
    }

    public ConstructorCodeBlock() {
        System.out.println("构造实例的构造函数： 运行成功");
    }
}
