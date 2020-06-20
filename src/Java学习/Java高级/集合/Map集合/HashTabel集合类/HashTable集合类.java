package Java学习.Java高级.集合.Map集合.HashTabel集合类;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 一、HashTable是早期的 HashMap
 *      1，HashTable 被 HashMap 取代
 *      2.Vector 被 ArrayList 取代
 *      3.HashTable的子类，**Properties** 依然可用，这是我们学习HashTable的原因。
 *      4.**Properties**集合是唯一一个和IO流相结合的集合。
 * 二、HashTable特点
 *      1.HashTable 不能储存null的key，或者null的value，其他的所有集合都可以。
 *      2.HashTable是单线程的，比较慢。
 */
public class HashTable集合类 {
    public static void main(String[] args) {
        System.out.println("=====HashMap可以储存null的key或value====");
        HashMap<String, String> map = new HashMap<>();
        map.put("a",null);
        map.put(null,"b");
        System.out.println(map);
        System.out.println("======HashTable不可以储存null========");
        Hashtable<String, String> tables = new Hashtable<>();
        tables.put("a",null);
        System.out.println(tables);
    }
}
