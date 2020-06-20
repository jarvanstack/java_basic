package Java学习.JavaSE基础.StringBuilder非常量的String;

/**
 * StringBuilder 可以被多次修改而不产生新的对象。建议会改变的字符串使用。
 * String 是常量修饰，不能被修改，而且修改了也十分浪费内存。
 */
public class Demo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        System.out.println("append(1): "+stringBuilder);
        stringBuilder.append('f');
        System.out.println("append('f'):"+stringBuilder);

    }
}
