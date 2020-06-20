package Java学习.Java高级.数据结构.数组.可变参数;

/**
 * 一、使用格式：定义方法时候使用
 * 1.  方法名( 数据类型...变量名){  }
 * 2.特殊(终极)写法： addUp(Object...obj){  }
 * Object 可以任意数据类型，
 * 二、使用条件：
 * 1. 定义方法
 * 2.参数数据类型确定，个数不确定
 * 三、原理：
 * 1. 可变参数的底层是一个数组，根据传递的参数的不同，会创建不同的长度的数组，
 * 2.元素的个数 可以为 0 ，1，2...n
 * 四：代码目的：定义一个累加多个int数的方法，传入参数不确定，不能用集合。
 */
public class 可变参数 {
    private int addUp(int... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        可变参数 obj = new 可变参数();
        System.out.println("obj.addUp(1, 2): " + obj.addUp(1, 2));
        System.out.println("obg.addUp(1,2,3): " + obj.addUp(1, 2, 3));
    }
}
