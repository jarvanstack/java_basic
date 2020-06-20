package NMID.week01;

/**
 * 一、原理
 * 1. ^是异或运算符，异或的规则是转换成二进制比较，相同为0，不同为1.
 * 2. a^b^a = a
 * 3.
 *
 */
public class 异或交换2个变量的值 {
    public static void main(String[] args) {
        System.out.println("-------1.普通开发使用的第三方替换法----------");
        int a1 = 1;
        int b1 = 2;
        int x ;
        x = a1;
        a1 = b1;
        b1 = x;
        System.out.println("交换后: a1 = "+a1);
        System.out.println("交换后: b1 = "+b1);

        System.out.println("--------2.面试问到的异或计算法---------");
        System.out.println("原理：a^b^a = a ");
        int a2 = 1;
        int b2 = 2;
        a2 = a2^b2;
        b2 = a2^b2;//b2 = a2^b2^b2 = a2
        a2 = a2^b2;//a2 = a2^b2^b2 = b2
        System.out.println("交换后: a2 = "+a2);
        System.out.println("交换后: b2 = "+b2);

    }
}
