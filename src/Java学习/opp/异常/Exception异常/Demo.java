package Java学习.opp.异常.Exception异常;

public class Demo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("a/b 出现异常ArithmeticException捕获成功!");
            e.printStackTrace();
        }finally {
            System.out.println("finally run successfully.经常用于一些异常的处理和流的关闭.");
        }
    }
}
