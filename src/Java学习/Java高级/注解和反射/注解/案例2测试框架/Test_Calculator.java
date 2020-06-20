package Java学习.Java高级.注解和反射.注解.案例2测试框架;
// * 2. 定义标记测试类，并标记需要测试的方法 Test_Calculator.java
public class Test_Calculator {
    @Check_Annotation
    public void addition(){
        int x = 1;
        int y = 1;
        System.out.println(x+y);
    }
    @Check_Annotation
    public void subtraction(){
        int x = 1;
        int y = 1;
        System.out.println(x-y);
    }
    @Check_Annotation
    public void multiplication(){
        int x = 1;
        int y = 1;
        System.out.println(x*y);
    }
    @Check_Annotation
    public void division(){
        int x = 1;
        int y = 0;
        System.out.println(x/y);
    }
}
