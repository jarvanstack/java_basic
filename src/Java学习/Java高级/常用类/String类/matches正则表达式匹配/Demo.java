package Java学习.Java高级.常用类.String类.matches正则表达式匹配;

import java.util.Scanner;

/**
 * 使用
 * matches(regex) 传入正则表达式匹配 QQ号码
 */
public class Demo {
    static void matchesQQNumber(String QQNumber){
        String regex = "[1-9]{1}[0-9]{4,14}";
        if (QQNumber.matches(regex)){
            System.out.println(QQNumber + " is ok");
        }
        else {
            System.out.println(QQNumber+" 不合法");
        }
    }
    public static void main(String[] args) {
        boolean isContinue = true;
        char inputContinue ;
        String QQNumber ;
        Scanner scanner = new Scanner(System.in);
        while (isContinue){
            System.out.println("-----请输入QQ号，5-15位(首位不为0)-----");
            QQNumber = scanner.nextLine();
            matchesQQNumber(QQNumber);
            System.out.println("继续？（y）");
            inputContinue = scanner.nextLine().toLowerCase().charAt(0);
            isContinue = inputContinue == 'y';
        }
    }
}
