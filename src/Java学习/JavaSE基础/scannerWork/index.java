package Java学习.JavaSE基础.scannerWork;
import java.util.Scanner;

/**
 * 目的：作业要求：
 * Java scanner输入多个数字其  总和和平均数  ,每输入一个canner输入多个数字其总和和平均数,
 * 每输入一个数字用回车确认，通过输入非数字来结束输入并输出结果
 *
 * 注意笔记事项：
 * Scanner 会有一个缓存 连续读取数据时候 使用 scanner.nextLine(); 清除缓存
 */
public class index {
    public static void main(String[] args) {
        double summer = 0;
        double times = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()){
            System.out.println("plese input a number to continue: /n");
            summer += sc.nextDouble();
            times ++;
        }
        System.out.println("the summer is :"+summer);
        System.out.println("the average of input is: "+summer/times);


    }

}
