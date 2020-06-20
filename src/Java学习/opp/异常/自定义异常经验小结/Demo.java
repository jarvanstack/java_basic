package Java学习.opp.异常.自定义异常经验小结;

public class Demo {

    public static void main(String[] args) {
        try {
            new Demo().toTest(11);
        } catch (Exception自制 exception自制) {
            //尽量处理异常，不要只是打印.printStackTrace();
            exception自制.printStackTrace();
        }finally {
            //尽量使用finally区释放一些占用的资源,
            System.out.println("finally 运行成功，释放占用资源，IO , Scanner");
        }
    }
    public static void toTest(int a) throws Exception自制 {
        System.out.println("传递的参数为"+a);
        if(a>10){
            throw new Exception自制(a);
        }
        else {
            System.out.println("没有异常");
        }

    }
}
