package Java学习.Java高级.集合.保证添加元素唯一性的底层源码;

import java.util.HashSet;

/**
 * #### 4、ArrayList，HashSet,TreeSet他们判断元素是否相同或者数保证元素唯一性的依据
 * （或者说底层会调用什么方法）是什么？（毕14-14，15-3）
 */
public class Demo {
    public static void main(String[] args) {
        HashSet<String> sets = new HashSet<>();
        String s = new String("1");
        System.out.println(sets.add(s));
        System.out.println(sets.add(s));
        System.out.println(sets);
    }
}
