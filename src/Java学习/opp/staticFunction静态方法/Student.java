package Java学习.opp.staticFunction静态方法;

public class Student {
    public  String say (){
        //静态方法在堆空间的方法区的静态方法区，类加载就会加载不用New对象
        System.out.println("static :Student class function say()");
        return "static :Student class function say()";
    }
}
