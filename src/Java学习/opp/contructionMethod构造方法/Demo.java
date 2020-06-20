package Java学习.opp.contructionMethod构造方法;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        if(student.name == null){
            System.out.println("类的属性初始化成功,name 的值为: "+student.name);
            System.out.println("类的属性初始化成功,ages的值为: "+student.ages);
        }
    }
}
