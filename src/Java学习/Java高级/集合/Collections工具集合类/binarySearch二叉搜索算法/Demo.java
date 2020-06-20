package Java学习.Java高级.集合.Collections工具集合类.binarySearch二叉搜索算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("cccc");
        list.add("bb");
        list.add("dddd");
        //二分法查找
        int binarySearch1 = Collections.binarySearch(list,"a");

        System.out.println("排序前：list "  + list);
        System.out.println("排序前：binarySearch1 = "  + binarySearch1);
        System.out.println("-----二分查不存在的值--------");
        int notExists1 = Collections.binarySearch(list,"zz");
        System.out.println("notExists: "+notExists1);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //长度升序
                return o1.length() - o2.length();
            }
        });
        //二分法查找
        int binarySearch2 = Collections.binarySearch(list,"bb");
        System.out.println("排序后：list"  + list);
        System.out.println("排序后：binarySearch2 = "  + binarySearch2);
        System.out.println("-----二分查不存在的值--------");
        int notExists = Collections.binarySearch(list,"zz");
        System.out.println("notExists: "+notExists);
    }
}
