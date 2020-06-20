package Java学习.opp.staticFunction静态方法;

/**
 * 用于测试 静态代码块  代码块  构造函数 在 new 时候的执行顺序.
 */
public class StaticCodeBlock {
    {
        System.out.println("代码块执行成功！");
    }
    static {
        System.out.println("静态代码块执行成功!");
    }
    StaticCodeBlock(){
        System.out.println("structure method run successfully.构造方法运行成功");
    }

    public static void main(String[] args) {
        new StaticCodeBlock();
        System.out.println("=========  2次 new =============");
        new StaticCodeBlock();
    }
}
