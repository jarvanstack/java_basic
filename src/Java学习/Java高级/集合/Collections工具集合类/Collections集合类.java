package Java学习.Java高级.集合.Collections工具集合类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections 是一个几个工具类：给集合提供3个常用方法，
 *      1.添加多个元素  addAll(Collection collection ,e1,e2....)
 *      2.打乱顺序(洗牌算法): shuffle(List list)
 *      3.排序   ：排序的元素类型必须实现Comparable接口，重写compareTo()方法，
 *          3.1 默认升序排序： sort(List list)
 *          3.2.自定义排序：s        //自定义排序
 *         Collections.sort(arrayList, new Comparator<String>() {
 *             @Override
 *             public int compare(String o1, String o2) {
 *                 return (Integer.valueOf(o2)-Integer.valueOf(o1));//降序
 *             }
 *         });
 *          注意： o1 - o2 为升序，反之。
 *
 */
public class Collections集合类 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"1","2","3","4","5");
        System.out.println("shuffle前： "+arrayList);
        Collections.shuffle(arrayList);
        System.out.println("shuffle后： "+arrayList);
        System.out.println("=======排序===========");
        Collections.sort(arrayList);
        System.out.println("默认升序排序后："+arrayList);
        //自定义排序
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (Integer.valueOf(o2)-Integer.valueOf(o1));//降序
            }
        });
        System.out.println("自定义降序排序后: "+arrayList);

    }
}
