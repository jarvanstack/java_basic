package Java学习.Java高级.注解和反射.注解.案例反射解析注解;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 一、案例：反射解析注解
 * 1，要求：
 * 二、步骤
 * 1. 新建一个注解，参数给一个className和methodName
 * 2.添加注解到需要的地方Demo
 * 3.获得Demo的demoClass
 * 4.demoClass.getAnnotation 新建Annotation对象
 * （其实就是 生成注解子类的实现)
 * 5.使用子类实现调用方法获取className 和 methodName
 * 6.使用全类名className 和 methodName
 * （1）Class.forName(className) 新建Class类对象
 * （2）获取Constructor对象和方法 Method
 * （3）使用Constructor对象创建新实例对象 Constructor.newInstance()
 * （4）执行方法 eat.invoke(newInstance)
 */
// * 2.添加注解到需要的地方Demo
@Conf(className =  "Java学习.Java高级.注解和反射.注解.案例反射解析注解.Person",methodName = "eat")
public class Demo {
    public static void main(String[] args) throws Exception {
        // * 3.获得Demo的demoClass
        Class<Demo> demoClass = Demo.class;
        // * 4.demoClass.getAnnotation 新建Annotation对象
        Conf annotation = demoClass.getAnnotation(Conf.class);
        //5.使用子类实现调用方法获取className 和 methodName
        String className = annotation.className();
        String methodName = annotation.methodName();
        System.out.println(className);
        System.out.println(methodName);
        //6.
        Class<?> aClass = Class.forName(className);
        Constructor<?> constructor = aClass.getConstructor();
        Object newInstance = constructor.newInstance();
        Method eatMethod = aClass.getMethod("eat");
        eatMethod.invoke(newInstance);

    }
}
