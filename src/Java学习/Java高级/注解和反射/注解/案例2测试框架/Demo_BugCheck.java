package Java学习.Java高级.注解和反射.注解.案例2测试框架;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

/**
 * 一、目的：做一个测试框架，包括，测试注解，标记测试的类，和执行测试的类
 * 二、步骤
 * 1. 定义测试注解类 Check_Annotation.java
 * 2. 定义标记测试类，并标记需要测试的方法 Test_Calculator.java
 * 3. 执行测试的类，通过反射执行测试方法，并将异常写入流到指定文件
 * <p>
 * 拓展：快捷键
 * iter 快捷键迭代器
 */
public class Demo_BugCheck {
    public static void main(String[] args) throws IOException {
        Test_Calculator test_calculator = new Test_Calculator();
        Class<? extends Test_Calculator> aClass = test_calculator.getClass();
        Method[] methods = aClass.getMethods();


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\注解和反射\\注解\\案例2测试框架\\Bug.txt", true));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        bufferedWriter.write("--------测试时间：" + simpleDateFormat.format(System.currentTimeMillis()) + "------------");
        int bugCount = 0;
        for (Method method : methods) {
            /**
             * 这个方法可以判断有注解@Check_Annotation的存在。
             */
            if (method.isAnnotationPresent(Check_Annotation.class)) {
                try {
                    method.invoke(test_calculator);
                } catch (IllegalAccessException e) {
                    System.out.println(e.toString());
                } catch (InvocationTargetException e) {
                    /**
                     * 在catch中将异常输出到指定文件里面.
                     */
                    bugCount++;
                    bufferedWriter.newLine();
                    bufferedWriter.write("Bug：" + bugCount);
                    bufferedWriter.newLine();
                    bufferedWriter.write("出现异常的方法的名称：" + method.getName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常的名称：" + e.getClass().getSimpleName());
                    bufferedWriter.newLine();
                    System.out.println("异常的原因：" + e.getCause().getMessage());
                    bufferedWriter.write("异常的原因：" + e.getCause().getMessage());
                    bufferedWriter.newLine();
                }

            }
        }
        bufferedWriter.write("------本次测试Bug个数：" + bugCount + "----------------");
        bufferedWriter.newLine();
        bufferedWriter.flush();//刷新到内存
        bufferedWriter.close();
    }
}
