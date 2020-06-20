package Java学习.Java高级.注解和反射.了解类加载器ClassLoader;

import Java学习.Java高级.注解和反射.反射.kuangsheng.类加载器ClassLoader.Demo05;

/**
 * 一、ClassLoader类加载器的作用：
 * 1. 将编译器生成的.class文件加载到内存中，
 * 将硬盘中的静态数据转化为内存中方法区的动态数据
 * 二、类的缓存机制：
 * 1. 标准的JavaSE类加载器可以按要求查找类，但一旦某个类被加载到类加载器中，
 * 它将维持一段时间，（缓存）不过就JVM的垃圾回收机制可以回收这些Class对象。
 * 三、ClassLoader分类
 * １.　引导类加载器null：--------- 核心内裤
 * 负责Java的核心自带类库，无法使用方法直接获取 rt.jar
 *
 * ２.　(平台)加载器Platform：-----------ext/拓展内裤
 * jre/lib/ext 目录下的jar包
 *
 * 3.  (应用)加载器App，------自己写的类
 * 加载自所有权限public --private类，最常用。
 *
 * 四、获取系统加载总共可以加载哪些路径
 * 1.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("----------1.获取当前类的加载器--------");
        System.out.println("(应用)加载器App");
        ClassLoader classLoader = new Demo05().getClass().getClassLoader();
        System.out.println(classLoader);
        System.out.println("---------2.获取获取当前类的加载器的父类加载器------");
        System.out.println("(平台)加载器Platform");
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        System.out.println("---------3.获取获取当前类的加载器的父类的父类加载器------");
        System.out.println("引导类加载器null");
        ClassLoader parentParent = parent.getParent();
        System.out.println(parentParent);
        /**
         * 四、获取系统加载总共可以加载哪些路径??
         */
        String property = System.getProperty("java.class.path");
        System.out.println(property);
        String[] properties = property.split(";");
        for (String s : properties) {
            System.out.println(s);
        }


    }
}
