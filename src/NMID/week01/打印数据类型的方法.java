package NMID.week01;

public class 打印数据类型的方法 {
    private  static String getType(Object object){
        return object.getClass().toString();
    }
    public static void main(String[] args) {
        short a = 5;
        a += 3;
        System.out.println("a的类型为："+getType(a));
    }
}
