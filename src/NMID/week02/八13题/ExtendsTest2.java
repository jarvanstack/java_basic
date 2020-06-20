package NMID.week02.八13题;

public class ExtendsTest2{
    public static void main(String[] args){
        Zi z = new Zi();
    }
}
class Fu {
    public Fu() {

    }
    Fu(int x){
        System.out.println("父类构造函数x = "+x);
    }

}
class Zi extends Fu{
    Zi(){
        this(3);
    }
    Zi(int x){
        System.out.println("子类构造函数 "+x);
    }

}