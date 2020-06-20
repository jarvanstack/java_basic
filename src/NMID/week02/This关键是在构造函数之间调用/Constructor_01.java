package NMID.week02.This关键是在构造函数之间调用;

/**
 * 1.this() 可以调用类的构造函数，用于构造函数的相互调用
 * 2.调用1参构造效果等价于this.name = name;
 * 3. 一般函数不能使用this（）调用构造函数
 * 4. this语句只能放到构造函数的第一行，不然编译不通过，
 * 5. 不推荐使用this反复调用防止出现死循环
 * （特别是在低参数比如0参 Person(){}中调用高参数比如1this(name)参时候）
 */
public class Constructor_01 {
    private String name;
    private int age;

    public Constructor_01() {
    }

    public Constructor_01(String name) {
        this.name = name;
    }
    public Constructor_01(String name, int age) {
        this(name);
        //调用1参构造效果等价于this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo_01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
