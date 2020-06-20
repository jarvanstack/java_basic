package Java学习.Java高级.注解和反射.注解.自定义注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 一、自定义注解：@interface自动继承 java.lang.annotation.Annotation 接口.
 * 1. 添加几乎固定的元注解
 * @Target(value = {ElementType.TYPE,ElementType.METHOD})//最常用类和方法可用
 * @Retention(value = RetentionPolicy.RUNTIME)//最常用的最大生命周期
 * 2.添加使用你所有权限public --private注解时候的参数
 *  (1)添加方法. 类型 名称() default 默认值;
 *  String name() default "";
 *  (2)没有默认值就使用必须添加参数比如 @Target @Retention
 *  (3)如果参数只有一个建议命名参数名为 value 这样使用时候可以省略参数名
 */
public class Demo03 {
    @MyAnnotation(name = "王二麻子")
    public static void main(String[] args) {

    }
}
@Target(value = {ElementType.TYPE,ElementType.METHOD})//最常用类和方法可用
@Retention(value = RetentionPolicy.RUNTIME)//最常用的最大生命周期
@interface MyAnnotation{
    String name() ;
    int id() default 0;
    String[] friends() default {"张三","李四"};
}