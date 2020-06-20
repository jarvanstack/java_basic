package Java学习.Java高级.集合.Map集合.HashMap集合类;

import java.util.HashMap;

/**
 * 具体看我的博客，这里只是测试使用
 */
public class HashMap集合类 {
    public static void main(String[] args) {
        //构造
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        //属性字段  == 无
        //### 四、常用方法put（）
        integerStringHashMap.put(1,"1号张三");
        integerStringHashMap.get(1);
        integerStringHashMap.remove(1);
        // #### 1.带参数的构造对阈值初始化
        HashMap<Integer, String> hashMap2 = new HashMap(16,1);

    }
}
