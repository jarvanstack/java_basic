package Java学习.opp.instanceof父子关系和类型转化;

public class typeConversion类型转换 {
    public static void main(String[] args) {


        //由低到高自动转换如同 int --> double
        //父类高于子类,低到高自动转，高到低强转.
        //高          --        低
        Person person = new Student();
        //person.goToShool();编译错误，需要将Person强制转换为Student
        //
        Student student = (Student) person;
        student.goToSchool();
        //subclass to parent class 会丢失方法.
        Person person1 = student;//这里会丢失Student特有的方法.

    }
}
