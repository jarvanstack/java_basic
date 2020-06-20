package Java学习.Java高级.集合.Arrays数组操作的工具类.asList返回的List为啥长度不变;

import java.util.Arrays;
import java.util.List;

/**
 * 12、Arrays中asList方法将数组变成list集合后，为什么不能进行增删操作。（17-16）
 */
public class Demo {
    public static void main(String[] args) {
        String[] strings = {"a","bb","ccc","dddd"};
        List<String> stringList = Arrays.asList(strings);

    }
}
