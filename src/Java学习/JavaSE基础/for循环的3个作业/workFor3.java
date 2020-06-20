package Java学习.JavaSE基础.for循环的3个作业;

public class workFor3 {
    public static void main(String[] args) {
        // 0到100奇数和 oddSum 偶数 evenSum 的和
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                evenSum += i;
            }
            else{
                oddSum +=i;
            }

        }
        System.out.println("The summer of odd number of 0 to 100 is : "+ oddSum);
        System.out.println("the summer of even number of 0 to 100 is : "+evenSum);
        /*输出1000能被 5整除的数字，每行输出3个
            int rows = 0;
            for (int i = 0; i < 1000; i++) {
                if(rows%3 == 0 && rows != 0){
                    System.out.println();
                }
                if(i%5 == 0){
                    System.out.print(i+"/t");
                    rows ++;
                }

         */
        //打印99乘法表
        for (int i = 0;i < 9 ;i++){
            for (int j = 0 ;j <= 9;j++){
                if(j >= (9-i)){
                    System.out.print((9-i)+"*"+j+"  ");
                }
            }
            System.out.println();
        }
    }
}
