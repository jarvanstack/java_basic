package Java学习.Java高级.注解和反射.反射.kuangsheng.获取Class类的方法;

/**
 * 一、目的：获取Class类的方法。
 * 1. person.getClass()
 * 通过对象获得
 * 2. Class.forName("Java学习.Java高级.注解和反射.反射.获取Class类的方法.Student")
 * 通过包名和类名获得
 * 3. Student.class;
 * 通过类名获得(类名不得重复)
 *
 * 4. Integer.TYPE，可用来查看数据类型
 * 基本数据类型使用TYPE属性
 * 5. student.getClass().getSuperclass()
 * 获得父类的Class
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Student();
        System.out.println("这个人是："+person.name);
        System.out.println("------------1.---------");
        // * 1. person.getClass()
        // * 通过对象获得
        Class<? extends Person> class1 = person.getClass();
        System.out.println("class1的hashcode："+class1.hashCode());
        System.out.println("----------2.----------");
        // * 2. Class.forName("Java学习.Java高级.注解和反射.反射.获取Class类的方法.Demo01")
        // * 通过包名和类名获得
        Class<?> class2 = Class.forName("Java学习.Java高级.注解和反射.反射.kuangsheng.获取Class类的方法.Student");
        System.out.println("class2的hashcode: "+ class2.hashCode());
        System.out.println("---------3.-----------");
        // * 3. Student.class;
        // * 通过类名获得(类名不得重复)
        Class<Student> class3 = Student.class;
        System.out.println("class3 hashcode: "+class3.hashCode());
        System.out.println("-----------4.----------");
        // * 4. Integer.TYPE，可用来查看数据类型
        // * 基本数据类型使用TYPE属性
        System.out.println("Integer.type: "+ Integer.TYPE);
        System.out.println("-----------5.----------");
        // * 5. student.getClass().getSuperclass()
        // * 获得父类的Class
        System.out.println("student的父类的class为： ");
        System.out.println(new Student().getClass().getSuperclass());


    }
}
class Person{
    public String name;
    public int age;
}
class Student extends Person{
    public Student() {
        this.name = "Student";
    }
}
class Teacher extends Person{
    public Teacher() {
        this.name = "Teacher";
    }
}
