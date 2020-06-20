package Java学习.opp.superAndThisSuper指代父类;

public class Student extends Person {
    private String name = "Student";

    public String getName(String name) {
        System.out.println("传入参数的name:"+name);
        System.out.println("子类的this.name:"+this.name);
        System.out.println("父类的super.name: "+super.name);
        return name;
    }


}
