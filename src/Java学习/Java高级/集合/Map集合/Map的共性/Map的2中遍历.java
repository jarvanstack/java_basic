package Java学习.Java高级.集合.Map集合.Map的共性;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 一、keySet(map)  返回Set集合
 *      1.然后迭代Set结合和map.get(s) 获取value的值实现遍历.
 * 二、entrySet()
 *      1.获取entry 键值的集合到 Set集合中，
 *      2.entry是一种键值数据类型Map.Entry<String,String>，对象
 *      3.entry 有2个常用方法,getKey(),getValue()
 *
 *
 */
public class Map的2中遍历 {
    /**
     * 1.map.keySet()返回，key的Set对象，
     * 2.然后遍历，set 和 map.get(set)
     * @param map
     */
    private void keySet遍历(Map map){
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println("key: "+s+","+"Value: "+map.get(s));
        }

    }

    /**
     * 1.entrySet() 返回 Map.Entry<String,String></String,String>类型的键值对象 Set集合
     * 2.遍历Set集合，输出 entry.getKey() 和 entry.getValue()
     * @param map
     */
    private void entrySet(Map map){
        Set<Map.Entry<String,String>> entrys = map.entrySet();
        for (Map.Entry<String,String> entry : entrys) {
            System.out.println("key: "+entry.getKey()+","+"value: "+entry.getValue());
        }
    }


    public static void main(String[] args) {
        Map <String,String >map = new HashMap();
        for (int i = 0; i < 5; i++) {
            map.put("key:"+i,"value: "+i);
        }
        System.out.println("==========keySet()遍历=====");
        new Map的2中遍历().keySet遍历(map);
        System.out.println("========entrySet()遍历==========");
        new Map的2中遍历().entrySet(map);

    }
}
