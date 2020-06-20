package Java学习.Java高级.注解和反射.反射.heima.获取Class对象的方法01;

/**
 * 1. Class.forName("全类名") : 阶段1可以使用，**将class文件，加载进内存并返回Class对象**
 * 多用于**配置文件，读取文件，加载类**
 *
 *
 * 2. Student.class : 阶段2 可用，**类的的属性class **
 * 多用于**传参**
 *
 * 3. student.getClass() : 阶段3可用，**对象实例的方法**
 * 多用于**对象**获取字节码文件
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.
        System.out.println("----1. Class.forName(\"全类名\")------");
        System.out.println(Class.forName("Java学习.Java高级.注解和反射.反射.heima.获取Class对象的方法01.Student01"));
        //2.
        System.out.println("--------2. Student.class---------");
        System.out.println(Student01.class);
        //3.
        System.out.println("-----3. student.getClass()-----");
        System.out.println(new Student01().getClass());
        System.out.println("-------123是否相等----------");
        System.out.println(new Student01().getClass().hashCode());
        System.out.println(Student01.class.hashCode());
        System.out.println(Class.forName("Java学习.Java高级.注解和反射.反射.heima.获取Class对象的方法01.Student01").hashCode());
        System.out.println("HashCode的值相等，地址值相等，");
        System.out.println("结论： 同一个class字节码文件的在程序的运行中，只会被加载一次" +
                "\n无论通过哪一种方式获取的class对象都是同一个.");

    }
}
class Student01{

}