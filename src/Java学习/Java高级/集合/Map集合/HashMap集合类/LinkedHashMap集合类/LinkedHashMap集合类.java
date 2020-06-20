package Java学习.Java高级.集合.Map集合.HashMap集合类.LinkedHashMap集合类;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * 一、特点：
 *      1.比HashMap多了1个Linked ，多一个链表，双链表保证有序
 *      2.其他参考 HashMap
 *          1.键key唯一，值可以重复
 *          所以key值要重写hashCode（）和equals（）保证key值唯一
 */
public class LinkedHashMap集合类 {
    private void  hashMapPrint(){
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("键"+i,"值"+i);
        }
        Set<String> sets = map.keySet();
        for (String set : sets) {
            System.out.println("key: "+set+"-->"+"value: "+map.get(set));
        }
    }
    private void  linkedHashMapPrint(){
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("键"+i,"值"+i);
        }
        Set<String> sets = map.keySet();
        for (String set : sets) {
            System.out.println("key: "+set+"-->"+"value: "+map.get(set));
        }
    }

    public static void main(String[] args) {
        System.out.println("=========HashMap========");
        new LinkedHashMap集合类().hashMapPrint();
        System.out.println("顺序不一致，无序");
        System.out.println("=====LinkedHashMap========");
        new LinkedHashMap集合类().linkedHashMapPrint();
        System.out.println("有序");

    }
}
