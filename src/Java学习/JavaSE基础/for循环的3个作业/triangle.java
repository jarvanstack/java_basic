package Java学习.JavaSE基础.for循环的3个作业;

public class triangle {
    //打印一个三角形triangle
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //1.部分
            for(int j = 5; j >= i;j--){
                System.out.print(" ");
            }
            //2.部分
            for(int j = 1 ; j <= i;j++){
                System.out.print("*");
            }
            //3.部分
            for(int j = 1;j < i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
