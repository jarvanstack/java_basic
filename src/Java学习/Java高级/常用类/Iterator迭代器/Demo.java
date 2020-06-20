package Java学习.Java高级.常用类.Iterator迭代器;

import java.util.ArrayList;
import java.util.List;

/**
 * iteration高级for循环
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.iterator();
        list.add("java01");
        list.add("java02");
        list.add("java03");
        for(String s : list){
            s = "kk";
        }
        System.out.println(list);
        show("a","b","c");

    }
    public static void show(String ss,String... s){
        for(int x =0;x < s.length;x++){
            System.out.println(s[x]);
        }
    }
}
