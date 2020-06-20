package Java学习.opp.encapsulation封装;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name is :"+student.getName()+"/n"+
                "age is:"+student.getAge());
        //使用set改变属性的值
        student.setAge(18);
        student.setName("半亩方糖");
        //输出改变后的值
        System.out.println("after setName,name is:"+student.getName()+"/n"+
                "after setAge,age is:"+student.getAge());

    }
}
class Student{
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //封装的用法之一，可以用方法规避不合法的数据.
        if(age >0 && age<120){
            this.age = age;
        }
        else{
            this.age = 3;
        }
    }
}
