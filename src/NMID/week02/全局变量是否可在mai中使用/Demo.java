package NMID.week02.全局变量是否可在mai中使用;

/**
 * 不是static的全局变量不能再static的main中使用，
 */
public class Demo {
    private static String name = "张三";

    public static void main(String[] args) {
        System.out.println(name);
    }
}
