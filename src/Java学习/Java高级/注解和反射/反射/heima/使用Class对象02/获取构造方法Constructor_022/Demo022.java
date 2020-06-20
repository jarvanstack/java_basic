package Java学习.Java高级.注解和反射.反射.heima.使用Class对象02.获取构造方法Constructor_022;


import Java学习.Java高级.注解和反射.反射.heima.使用Class对象02.Person02;

import java.lang.reflect.Constructor;

public class Demo022 {
    public static void main(String[] args) throws Exception {
        /**
         * 一、获取构造方法Constructor
         * 1. getConstructor(String.class) （public权限）1个String参数的Constructor
         * 2.3.4.同理
         * 二、使用constructor
         * 1.newInstance(): 新建Person的实例 ,newInstance(String "name",int age)
         */
        Person02 person02 = new Person02();
        Class<? extends Person02> aClass = person02.getClass();
        Constructor<? extends Person02> constructor = aClass.getConstructor();//获取无参构造
        Constructor<? extends Person02> constructor1 = aClass.getConstructor(String.class);//获取一个参数的构造
        System.out.println("无参构造： " + constructor);
        System.out.println("1参构造： " + constructor1);
        System.out.println("-------二、获取构造的作用，newInstance()新建person对象实例------------");
        Person02 person021 = constructor1.newInstance("参数1");
        System.out.println(person021);

    }
}
