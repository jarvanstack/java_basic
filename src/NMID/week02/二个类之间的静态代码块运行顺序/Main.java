package NMID.week02.二个类之间的静态代码块运行顺序;

/**
 * Main类的static代码块：-------- 1.
 * StaticDemo_02的static代码块: -------- 2.
 * StaticDemo_02普通代码块：-------- 3.
 * StaticDemo_02构造函数 -------- 4.
 * <p>
 * 总结：
 * 1.先运行 Main的静态代码快，再运行 其他类的静态代码块，
 * 2.普通代码块（可初始化所有字段)优先构造函数的执行
 * 3.static 静态 在类加载时候执行，只执行一次，且
 * 优先于运行期 的 new Person（） 执行的非静态 普通代码块和构造函数
 */
public class Main {
    public static void main(String[] args) {
        new StaticDemo_02();
    }

    static {
        System.out.println("Main类的static代码块：-------- 1. ");
    }

    {
        System.out.println("Main类的普通代码块：--------5 Main由于没有构造普通不运行. ");
    }
}

class StaticDemo_02 {
    public StaticDemo_02() {
        System.out.println("StaticDemo_02构造函数 -------- 4.");
    }

    static {
        System.out.println("StaticDemo_02的static代码块: -------- 2.");
    }

    {
        System.out.println("StaticDemo_02普通代码块：-------- 3. ");
    }

}