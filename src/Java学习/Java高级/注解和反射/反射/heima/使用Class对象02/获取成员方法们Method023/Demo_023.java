package Java学习.Java高级.注解和反射.反射.heima.使用Class对象02.获取成员方法们Method023;

import Java学习.Java高级.注解和反射.反射.heima.使用Class对象02.Person02;

import java.lang.reflect.Method;

/**
 *  * 一、获取成员方法Method
 *  * 1. getMethod("方法名eat",String.class) public权限的字段
 *  * String.class方法的参数的类型String
 *  * 2.3.4同上
 *  * 二、Method的使用
 *  * 1.invoke()：　调用方法　invoke("蛇皮怪")，蛇皮怪就是方法的参数。
 *
 * 1.使用class获取Method
 * 2.使用Method
 * （1）使用method调用方法
 * （2）使用method获取方法名称
 */
public class Demo_023 {
    public static void main(String[] args) throws Exception {
        //1.使用class获取Method
        Person02 person02 = new Person02();
        Class<? extends Person02> aClass = person02.getClass();
        Method eatMethod = aClass.getMethod("eat", String.class);
        //2.使用method调用方法invoke()
        eatMethod.invoke(person02, "个蛇皮");
        System.out.println(eatMethod.getName());
    }
}
