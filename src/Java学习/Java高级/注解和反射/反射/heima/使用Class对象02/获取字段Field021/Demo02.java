package Java学习.Java高级.注解和反射.反射.heima.使用Class对象02.获取字段Field021;

import Java学习.Java高级.注解和反射.反射.heima.使用Class对象02.Person02;

import java.lang.reflect.Field;

/**
 * 一、获取成员变量Field
 * 1. getField("publicField") （public权限）1个字段publicField
 * 2. getFields() （public权限）全部字段们
 * <p>
 * 3. getDeclaredField("privateField") （所有权限）的1个字段privateField
 * 4. getDeclaredFields() （所有权限）的字段们
 * 二、使用field
 * 1.get():    .get(person02)
 * 2.set():    .set(person02,"设置的值")
 * 3.暴力反射：获取非public字段后需要暴力反射才能使用privateField的方法(比如get())
 * privateField1.setAccessible(true);
 * <p>
 * --------------------------------------------------------------------------
 * 一、获取构造方法Constructor
 * 1. getConstructor(String.class) （public权限）1个String参数的Constructor
 * 2.3.4.同理
 * 二、使用constructor
 * 1.newInstance(): 新建Person的实例 ,newInstance(String "name",int age)
 * <p>
 * -----------------------------------------------
 * 一、获取成员方法Method
 * 1. getMethod("方法名eat",String.class) public权限的字段
 * String.class方法的参数的类型String
 * 2.3.4同上
 * 二、Method的使用
 * 1.invoke()：　调用方法　invoke("蛇皮怪")，蛇皮怪就是方法的参数。
 * <p>
 * -----------------------------------------------
 * 一、获取类名getName
 * 1. getName()
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        Person02 person02 = new Person02();
        Class<? extends Person02> class1 = person02.getClass();
        /**
         *  * 一、获取成员变量Field
         *  * 1. getField(String name) public权限的字段
         *  * 2. getFields() 全部public权限字段们
         *  *
         *  * 3. getDeclaredField(String name) 获取所有权限的（public --private）的字段
         *  * 4. getDeclaredFields() 获取所有权限的（public --private）的字段们
         *  拓展
         *  5.获取class1对象下字段privateField的值 privateField.get(class1)
         *  6.设置值： privateField.set(class1,"设置的值")
         *  7.暴力反射获取
         *  privateField1.setAccessible(true);
         */
        Field publicField = class1.getField("publicField");
        System.out.println("-----------一、.---------");
        System.out.println("1.getField(\"publicField\");-------");
        System.out.println(publicField);
        Object[] fields;
        fields = class1.getFields();
        System.out.println("2.getFields()-------");
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        System.out.println("结论：只能获取public类型的field");
        System.out.println("4.getDeclaredFields()--------");
        fields = class1.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        /**
         *          *  拓展
         *          *  5.获取class1对象下字段privateField的值 privateField.get(class1)
         *          *  6.设置值： privateField.set(class1,"设置的值")
         *          *  7.暴力反射获取
         *              privateField1.setAccessible(true);
         */
        System.out.println("5.获取class1对象下字段privateField的值 privateField.get(person02)-------\n" +
                "6.设置值： privateField.set(person02,\"设置的值\")-------");

        Field privateField = class1.getField("publicField");
        System.out.println("privateField.get(person02)： " + privateField.get(person02));
        privateField.set(person02, "set的值");
        System.out.println("privateField.set(person02,\"set的值\"): " + privateField.get(person02));

        System.out.println("暴力反射privateField1.setAccessible(true);----------");
        Field privateField1 = class1.getDeclaredField("privateField");
        //暴力反射前访问私有报错java.lang.IllegalAccessException
        //System.out.println(privateField1.get(person02));
        privateField1.setAccessible(true);
        System.out.println("暴力反射就能获取私有Field: " + privateField1.get(person02));
    }
}
