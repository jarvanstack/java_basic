package Java学习.Java高级.常用类.Arrays常见类_数组类;

import java.util.Arrays;

/**
 * 随机一个字符串，吧把它转化为字符数组，然后升序排列，最后倒叙打印
 * 注意：
 *          1.字符串转化为字符数组使用 string.toCharArray() 方法
 */
public class Arrays练习倒序打印 {
    public static void main(String[] args) {
        String string = "412554367654318764";
        //字符串转化为数组 使用 string.toCharArray()
        char[] charArrays = string.toCharArray();
        //肾虚排列 使用 Arrays.sort(charArrays) 方法
        Arrays.sort(charArrays);
        //倒叙打印
        for (int i = charArrays.length-1; i >=0 ; i--) {
            System.out.print(charArrays[i]+" ");
        }
    }
}
