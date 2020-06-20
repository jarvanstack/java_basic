package Java学习.Java高级.泛型.自制泛型类和泛型方法;

/**
 * 创建方法：
 *      1.  private  <E>void print1(E e){
 * 二、注意：
 *      1，静态方法可以直接用类名.方法名访问不用对象
 */
public class 泛型方法 {
    /**
     * new 对象的 普通方法，
     * @param e
     * @param <E>
     */
    private  <E>void print1(E e){
        System.out.println(e);
    }

    /**
     * 通过类名直接访问的静态方法
     * @param e
     * @param <E>
     */
    private static <E> void print2(E e){
        System.out.println(e);
    }
    public static void main(String[] args) {
        new 泛型方法().print1("普通方法");
        泛型方法.print2("static 方法 ");
    }
}
