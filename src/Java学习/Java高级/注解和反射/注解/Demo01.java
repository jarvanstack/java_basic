package Java学习.Java高级.注解和反射.注解;

import java.util.HashMap;

public class Demo01 {
    @Override
    public String toString() {
        return "Demo01{}";
    }
    @Deprecated
    public void test01(){

    }
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
    }

}
