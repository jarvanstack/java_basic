package Java学习.JavaSE基础.数组.二维数组;

/**
 * 1. 二维数组定义必须确定横行数rows,列可不必管
 * 2. 直接赋值二维数组的一个横行row 需要一个 以为数组
 */
public class Demo {
    public static void main(String[] args) {
        //1. 二维数组定义必须确定横行数rows,列可不必管
        int[][] ints = new int[2][];
        //2. 直接赋值二维数组的一个横行row 需要一个 以为数组
        ints[1] = ints[2];
    }
}
