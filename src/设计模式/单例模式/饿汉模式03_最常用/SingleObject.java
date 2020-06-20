package 设计模式.单例模式.饿汉模式03_最常用;

/**
 * 作用： 定义单例模式
 *
 * 3. 就是把
 * new SingleObject（） 写到成员变量里
 */
public class SingleObject {
    //1.在类装载的时候就定义好了实例内容
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }
    public static synchronized SingleObject getInstance() {
        return instance;
    }

    public void printSomeText() {
        System.out.println("单例模式: 调用方法printSomeText()成功 ");
    }
}
