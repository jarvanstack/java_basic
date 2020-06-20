package Java学习.Java高级.集合.Collections工具集合类.反转排序reverse和reverseOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * #### 11、Collections中reverse和reverseOrder的区别？（17-14）
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * 1.reverse
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ccc");
        arrayList.add("dddd");
        arrayList.add("a");
        arrayList.add("bb");
        //System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("正常排序后"+arrayList);
        Collections.reverse(arrayList);
        System.out.println("reverse()逆向排序后: "+arrayList);
        /**
         * 2.reverseOrder
         */
        System.out.println("------------");
        TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder());
        treeSet.add("ccc");
        treeSet.add("dddd");
        treeSet.add("a");
        treeSet.add("bb");
        System.out.println("在构造TreeSet（）里添加反转后的比较器的效果.");
        System.out.println(treeSet);
    }
}
