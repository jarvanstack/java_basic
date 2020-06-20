package Java学习.opp.instanceof父子关系和类型转化;

public class Demo {
    public static void main(String[] args) {
        /**
         * Object -- String
         * Object -- Person -- Teacher
         * Object -- Person -- Student.
         */
        Object object = new Student();
        System.out.println("Object object = new Student();");
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof  String);//false
        System.out.println("===============");
        Person person = new Student();
        System.out.println("Person person = new Student();");
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof  String);//编译报错
        System.out.println("==========================");
        Student student = new Student();
        System.out.println("Student student = new Student();");
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//false编译器报错.

    }

}
