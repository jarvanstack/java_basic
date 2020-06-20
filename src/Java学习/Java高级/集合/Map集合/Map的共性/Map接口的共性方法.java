package Java学习.Java高级.集合.Map集合.Map的共性;

import java.util.HashMap;
import java.util.Map;

/**
 * 一、常用方法：
 *      1. 增： V map.put( K keu,V value)
 *          1.1 K 不存在：返回空
 *          1.2 K存在： 返回 被替换的 V value
 *      2. 删： V map.remove(K key)
 *      3. 查：V map.get(K key)
 *      4. 是否包含指定键: map.containsKey( K key)
 *      5.获取键到Set集合： map.keySet()  -- map的2种遍历
 *      6.获取键值entry对象到Set： map.entrySet()---map的2种遍历
 */
public class Map接口的共性方法 {
    /**
     * map.keySet()返回key值的Set对象，然后使用get()方法获取值.
     * @param map
     */

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        for (int i = 0; i < 5; i++) {
            map.put("键"+i,"值"+i);
        }
        System.out.println("=======V put()，存在替换，不存在增加=========");
        System.out.println(map+"(无序,重写toString方法)");
        System.out.println("map.put(“键7”，“新的值7”)："+map.put("键7", "新的值7"));
        System.out.println("map.put(“键1”，“新的值1”）："+map.put("键1","新的值1"));
        System.out.println("重复的key会替换value");
        System.out.println("map.put('键1','新的值')后："+map);
        System.out.println("==========V remove()==========");
        System.out.println("remove键为 键2："+map.remove("键2"));
        System.out.println("remove键为 键10："+map.remove("键10"));
        System.out.println("remove() 后："+map);
        System.out.println("=======get(k)========");
        System.out.println("键3 的值："+map.get("键3"));
        System.out.println("键10 的值："+map.get("键10"));
        System.out.println("======containsKey()是否包含key=====");
        System.out.println("map.containsKey(“键2”)： "+map.containsKey("键2"));
        System.out.println("map.containsKey(“键3”)： "+map.containsKey("键3"));
        System.out.println("=======keySet()和entrySet（）遍历见隔壁类=============");

    }
}
