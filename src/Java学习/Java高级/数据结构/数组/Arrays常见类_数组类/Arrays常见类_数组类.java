package Java学习.Java高级.数据结构.数组.Arrays常见类_数组类;

import java.util.Arrays;

/**
 * Arrays 数组类型数组，
 * 1.Arrays.toString(arr)     打印数组
 * 2,Arrays.sort(arr)         升序排序数组
 * 3.Arrays.copyOf(arrayInt,int i)  复制数组
 *              int[] ints = Arrays.copyOf(arrayInt, arrayInt.length);
 *              for (int anInt : ints) {
 *                  System.out.println(anInt);
 *              }
 *4.Arrays.copyOfRange(arrayInt, 0, 4);  指定复制数组：
 * 注意：
 * 如果是数值： 从小到大
 * 字符串：     字母顺序
 * 如果自所有权限public --private类型 ： 需要实现 接口 Comparable 或者 Comparator
 */
public class Arrays常见类_数组类 {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 2};
        Arrays.sort(arrayInt);//排序
        Arrays.toString(arrayInt);//打印数组


    }
}
