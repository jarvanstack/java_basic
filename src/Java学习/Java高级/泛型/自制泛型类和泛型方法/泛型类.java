package Java学习.Java高级.泛型.自制泛型类和泛型方法;

/**
 * 一、创建方法：
 * 1.在类名后面加上 E （尖括号打不出来)如：
 * ```java
 *          public class GenericClass自制泛型类<E> {
 * ```
 * 2.在需要的数据（属性）使用 E 代替即可：
 * ```java
 *          public E element;
 * ```
 */
public class 泛型类 {
    public static void main(String[] args) {
        //不定义泛型默认 Object 类型
        GenericClass自制泛型类 objectGenericClass = new GenericClass自制泛型类<>();
        objectGenericClass.setElement("设置Object类型的数据");
        System.out.println("Object类型的数据: "+objectGenericClass.getElement());
        //定义Integer类型的泛型
        GenericClass自制泛型类<Integer> integerGenericClass = new GenericClass自制泛型类<>();
        integerGenericClass.setElement(1);
        System.out.println("Integer类型的数据；"+integerGenericClass.getElement());
        GenericClass自制泛型类<String> stringGenericClass = new GenericClass自制泛型类<>();
        stringGenericClass.setElement("设置String类型的数据");
        System.out.println("String 类型的数据： "+stringGenericClass.getElement());
    }
}
