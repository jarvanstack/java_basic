package Java学习.JavaSE基础.数组.arithmeticOfReversal反转数组算法;

public class demo {
    public static void main(String[] args) {
        //反转算法
        //动态数组定义
        int [] arrayInt = new int[5];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;
        int [] reversal = arithmeticOfReversal(arrayInt);
        for(int x :reversal){
            System.out.println(x);
        }
    }
    public static  int [] arithmeticOfReversal(int [] arrayInt){
        int [] result = new int[arrayInt.length];
        //两极反转！
        for (int i = 0,j = arrayInt.length -1; i < arrayInt.length;i++,j--){
            result[i] = arrayInt[j];
        }
        return  result;
    }
}
