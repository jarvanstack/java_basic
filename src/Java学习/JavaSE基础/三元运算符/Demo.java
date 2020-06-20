package Java学习.JavaSE基础.三元运算符;

/**
 *   String isPass = score>=60?"及格":"不及格";
 *   X ? Y : Z
 *   如果 X 为true 就返回 Y
 *   反之返回 Z 。
 *
 */
public class Demo {
    public static void main(String[] args) {
        int score = 80;
        String isPass = score>=60?"及格":"不及格";
        System.out.println(isPass);
    }
}
