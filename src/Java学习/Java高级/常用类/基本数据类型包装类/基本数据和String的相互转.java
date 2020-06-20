package Java学习.Java高级.常用类.基本数据类型包装类;

/**
 * 一、int - String
 *  1. i + "" 工作常用
 *  2. String s = Integer.toString(i);
 *  3. String s = String.valueOf(i);???
 * 二、 String -- int
 *  1. int i = Integer.parseInt(s);
 */
public class 基本数据和String的相互转 {
    public static void main(String[] args) {
    int i = 1;
    String s = Integer.toString(i);

    }
}
