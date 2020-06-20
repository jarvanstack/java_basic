package Java学习.Java高级.注解和反射.反射.kuangsheng.类的初始化的内存分析;

/**
 * 1.加载生成 .class,并检查报错
 * 2.加载static池，赋值默认初始值
 * 3.加载常量池
 * 4.构造方法
 */
public class Demo04 {
    public static void main(String[] args) {
        new Person04();
    }
}
class  Person04{
    public Person04() {
        System.out.println("无参构造方法初始化");
    }
    static {
        System.out.println("静态代码块初始化");
        int value = 1;
    }

}