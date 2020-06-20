package Java学习.opp.staticFunction静态方法;
public class Demo {
    private static String name;
    private static int age;
    public static void main(String[] args) {
        Student student = new Student();
        student.say();
        //==========================
        //static OPP总结笔记: 静态static在堆区的的静态区，在类加载的时候就会加载 不用 new .
        /*
        1.类中的 Static 可以直接用类调用 staticFunction静态方法.name;//建议这样写来区分非静态.
        2.

         */

    }
}
