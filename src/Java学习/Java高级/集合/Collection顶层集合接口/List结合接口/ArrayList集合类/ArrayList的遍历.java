package Java学习.Java高级.集合.Collection顶层集合接口.List结合接口.ArrayList集合类;

import java.util.ArrayList;

public class ArrayList的遍历 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
