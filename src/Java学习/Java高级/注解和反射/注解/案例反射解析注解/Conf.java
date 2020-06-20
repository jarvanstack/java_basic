package Java学习.Java高级.注解和反射.注解.案例反射解析注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// * 1. 新建一个注解，参数给一个className和methodName
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Conf {
    String className();
    String methodName();
}
