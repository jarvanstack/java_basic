package Java学习.Java高级.Lambda表达式.lambda表达式实现多线程;

/**
 * 这个案例展示使用Lambda表达式的使用对比匿名内部类实现多线程的区别
 * 更简洁。
 * 二、lambda 表达式的标准格式：
 * 1.参数
 * 2.箭头
 * 3.方法体的代码
 * 三、格式： （参数） -> {一些重写方法的代码;};
 * 四、格式说明：
 * 1. () ：接口中的抽象方法的参数列表，没有参数就空着，有就写
 * 2. -> :传递的意思，吧参数传递给方法体{}
 * 3. {}:重写接口的抽象方法的方法体。
 */
public class Demo {
    public static void main(String[] args) {
        //1.匿名内部类实现多线程的
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"  启动成功");
            }
        }).start();
        //2.lambda表达式实现多线程
        new Thread(()-> {
                System.out.println(Thread.currentThread().getName()+"  启动成功");
            }).start();

    }
}
