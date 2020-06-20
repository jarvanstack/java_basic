package Java学习.Java高级.注解和反射.注解.案例2测试框架;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// * 1. 定义测试注解类 Check_Annotation.java
@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Check_Annotation {
}
