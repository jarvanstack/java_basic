package Java学习.opp.contructionMethod构造方法;

public class Student {
    String name;
    int ages;

    public Student() {
        System.out.println("构造方法自动运行成功.将改变属性ages的值");
        this.ages = 18;
    }
}
