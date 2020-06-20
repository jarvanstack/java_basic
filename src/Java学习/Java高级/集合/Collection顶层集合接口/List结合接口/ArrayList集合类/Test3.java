package Java学习.Java高级.集合.Collection顶层集合接口.List结合接口.ArrayList集合类;

import java.util.ArrayList;

/**
 * 定义一个打印集合的方法，ArrayList 类型作为参数，打印格式为 {元素@元素@元素}
 */
public class Test3 {
    /**
     * 泛型的作用:
     * 1.规范ArrayList储存的数据类型
     * 2.使用泛型广泛代替传入ArrayList参数类型，实现重载功能，
     * 3.同理替代传入的数组类型
     *
     * @param arrayList
     * @param <E>
     */
    private <E> void formatPrint(ArrayList<E> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                System.out.print("{" + arrayList.get(i) + "@");
            } else if (i > 0 && i < arrayList.size() - 1) {
                System.out.print(arrayList.get(i) + "@");
            } else if (i == arrayList.size() - 1) {
                System.out.print(arrayList.get(i) + "}");
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        new Test3().formatPrint(arrayList);
    }
}
