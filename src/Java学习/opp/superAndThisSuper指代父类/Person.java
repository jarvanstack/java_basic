package Java学习.opp.superAndThisSuper指代父类;

public class Person {
    //权限的大小级别是 private  default  protected   public
    //可以被本类访问 ： Yes       Yes      Yes        Yes
    //被本包(package):           Yes      Yes        Yes
    //被继承的子类访问:                    Yes        Yes
    //可被外包类访问:                                 Yes
    //此处想要子类能访问父类的属性 至少需要protected的权限修饰
    protected String name = "super";
}
