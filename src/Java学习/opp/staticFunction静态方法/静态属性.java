package Java学习.opp.staticFunction静态方法;

public class 静态属性 {
    private static String name;
    private int age;
    public static void main(String[] args) {
        //static 修饰的属性的变量不用new 就能访问，推荐使用 静态属性.name(类名.变量名);来区分静态变量(类变量)
        System.out.println(静态属性.name);//null
        //System.out.println(静态属性.age);非静态变量，编译报错需要New 来访问.
        静态属性 obj = new 静态属性();
        System.out.println(obj.age);//0
        System.out.println(obj.name);//可以访问但是不推荐使用。使用类变量方法来区分.

    }
}
