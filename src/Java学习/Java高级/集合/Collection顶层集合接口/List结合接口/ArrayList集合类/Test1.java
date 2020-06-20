package Java学习.Java高级.集合.Collection顶层集合接口.List结合接口.ArrayList集合类;

import java.util.ArrayList;
import java.util.Random;

/**
 * 1. 生成6个1~33 的随机整数，添加到集合，遍历输出：
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arrayList.add(new Random().nextInt(32) + 1);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
