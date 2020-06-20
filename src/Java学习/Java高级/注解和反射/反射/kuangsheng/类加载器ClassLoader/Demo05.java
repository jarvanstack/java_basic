package Java学习.Java高级.注解和反射.反射.kuangsheng.类加载器ClassLoader;

/**
 * 一、定义
 * 类加载器ClassLoader的作用是把类(class)装载到内存，JVM规定了如下的类加载器
 * 二、３种类加载器
 * １.　引导类加载器：负责Java的核心自带类库，无法使用方法直接获取
 * ２.　拓展类加载器：jre/lib/ext 目录下的jar包
 * 3.  系统加载器，加载自所有权限public --private类，最常用。
 * 三、查看加载器的方法，
 * 1. class.getClassLoader()
 */
public class Demo05 {
    public static void main(String[] args) {
        System.out.println("----------1.获取当前类的加载器--------");
        System.out.println(new Demo05().getClass().getClassLoader());
        System.out.println("---------2.获取");

    }
}
