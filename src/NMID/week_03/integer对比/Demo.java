package NMID.week_03.integer对比;

/**
 * 输出结果
 */
public class Demo {
    public static void main(String[] args) {
        Integer x1 = 127;
        Integer x2 = 127;
        Integer x3 = 128;
        Integer x4 = new Integer(127);
        System.out.println(x1==x2);  //true 都是一个值.方法中的基本数据类型都在栈中
        System.out.println(x1==x3);//false都是栈中但是数据不一致
        System.out.println(x1==x4);//false x4的地址指向堆区
        System.out.println(x1.equals(x4));//true 因为 equals 是取值运算.
    }
}
