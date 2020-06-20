package Java学习.Java高级.IO.Properties唯一可IO的集合.Properties储存数据和遍历;

import java.util.Properties;

/**
 *  * 一、顶级父类Map的常用方法：
 *  *      1. 增： V map.put( K keu,V value)
 *  *          1.1 K 不存在：返回空
 *  *          1.2 K存在： 返回 被替换的 V value
 *  *      2. 删： V map.remove(K key)
 *  *      3. 查：V map.get(K key)
 *  *      4. 是否包含指定键: map.containsKey( K key)
 *  *      5.获取键到Set集合： map.keySet()
 *  *      6.获取键值对象到Set： map.entrySet()
 *  二、Properties 类的常用方法
 *  1.setProperty(String key,String value) 类似于 put(Key key,Value value)
 *  2.getProperty(String key)       类似于 get(Key key)
 *  3.Set<String>  stringPropertyNames() 返回 key集合相当于 keySet
 *
 */
public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("张三","13");
        properties.setProperty("李四","14");
        properties.setProperty("王五","15");
        properties.setProperty("张三","23");//和Map一致，同Key会覆盖.
        for (String key : properties.stringPropertyNames()) {
            System.out.println("key: "+key+"----- value:"+properties.getProperty(key));
        }
        System.out.println("同Map 和 MapTable类似，无序.");

    }
}
