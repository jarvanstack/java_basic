package Java学习.Java高级.注解和反射.注解.元注解;

import java.lang.annotation.*;

/**
 * 自定义元注解详解
 * 1.@Target : 描述注解的使用范围
 * (1)自定义元注解，
 * (2)自所有权限public --private元注解添加到（比如方法里）
 * (3)调用该方法
 * 2.@Retention，保留期，生命周期，描述注解的生命周期
 * （source<Class<**Runtime**)一般使用Runtime最大生命周期，
 *
 * 3.Document ： 文档，说明该注解包含在Javadoc 中
 *
 * 4.Inherited ： 继承，说明子类可以继承父类的该注解。
 */

public class Demo02 {
    @MyAnnotation
    int field1;

    @MyAnnotation
    public static void main(String[] args) {

    }
}
// 1.(1)定义一个注解的使用范围
@Target(value = {ElementType.METHOD,ElementType.FIELD})
//2.（1）定义一个注解的有效时间
@Retention (value = RetentionPolicy.RUNTIME)
//3.是否将注解生成在Javadoc
@Documented
//子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
