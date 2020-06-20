package Java学习.Java高级.集合.Map集合.HashMap集合类.HashMap储存自定义键值;

import java.util.HashMap;
import java.util.Set;

/**
 * 一、HashMap储存自定义键值：
 *      1. map的key是唯一的，所以必须重写hashCode（）和equal方法保证哈希值唯一
 *      2，
 */
public class HashMap储存自定义键值 {
    /**
     * key,String 类型
     * value Person2类型
     *
     * @param hashMap
     */
    private void print1(HashMap<String ,Person2> hashMap){
        Set set = hashMap.keySet();
        for (Object key : set) {
            System.out.println("key: "+key+","+"value: "+hashMap.get(key));
        }
    }

    public static void main(String[] args) {
        HashMap<String, Person2> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hashMap.put("key "+i,new Person2("name "+i,i+10));
        }
        new HashMap储存自定义键值().print1(hashMap);
    }
}
