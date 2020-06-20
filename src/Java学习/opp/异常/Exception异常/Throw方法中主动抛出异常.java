package Java学习.opp.异常.Exception异常;

public class Throw方法中主动抛出异常 {
    public static void main(String[] args) {
        new Throw方法中主动抛出异常().devide(1,0);
    }
    private void devide(int a ,int b){
        if(b == 0){
            System.out.println("抛出异常成功!");
            throw new ArithmeticException();//抛出数据数据异常.
        }
    }

}
