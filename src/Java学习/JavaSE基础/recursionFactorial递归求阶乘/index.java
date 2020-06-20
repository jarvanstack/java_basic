package Java学习.JavaSE基础.recursionFactorial递归求阶乘;

import java.util.Scanner;

/**
 * 递归求阶乘
 */
public class index {
    public static void main(String[] args) {
        System.out.println("please input a number(int),computing tha value of the recursion./n");
        Scanner sc = new Scanner(System.in );
        int number = 0;
        if(sc.hasNextInt()){
            number = sc.nextInt();
        }
        System.out.println("the value is :"+recursion(number));
        sc.close();
    }
    public static int recursion(int number){
        if (number == 1){
            return 1;
        }
        else if(number ==0){
            return  0;
        }
        else if(number > 0){
            return number*recursion(number - 1);
        }
        else {
            System.out.println("the number you input is wrong.");
            return 0;
        }
    }

}
