package Java学习.Java高级.Lambda表达式.Lambda表达式有参数返回指的练习;

/**
 * 一、需求：给定一个Calculator接口，抽象方法addCalc(int a ,int b)
 *      计算 a b 的和，并且返回.
 * 二、2种方法
 * 1.抽象内部类
 * 2.lambda表达式
 * 三、实现步骤：
 * 1，自制MyCalculator接口，
 * 定义抽象方法 public int addCalc(int a ,int b);
 * 2.定义一个方法myMethod(MyCalculator
 * 参数传入 2 个 int
 * 参数传入 MyCalculator 接口
 * 内部调用 MyCalculator 方法，addCalc(int int)计算和值，
 * 3.main 用抽象内部类实现
 * 4.main中用 lambda表达式实现.
 *
 */
public class Main {
    private static void myMethod(int a,int b,MyCalculator myCalculator){
        int sum= myCalculator.addCalc(a,b);
        System.out.println("sum: "+sum);
    }
    public static void main(String[] args) {
        //1.抽象内部类
        System.out.println("-----1.抽象内部类------");
        myMethod(1, 1, new MyCalculator() {
            @Override
            public int addCalc(int a, int b) {
                return a+b;
            }
        });
        //2.lambda 表达式
        System.out.println("----2.lambda 表达式-----");
        myMethod(1,1,(int a,int b)->{
            return a+b;
        });
    }
}
