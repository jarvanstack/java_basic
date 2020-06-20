package Java学习.JavaSE基础.for循环的3个作业;

public class shortcutForArray {
    public static void main(String[] args) {
        //计算所有的0-10的奇数的和
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println("the sum is : "+sum);
    }
}
