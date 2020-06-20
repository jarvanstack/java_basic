package 设计模式.单例模式.枚举06;

/**
 * 作用： 定义单例模式
 *
 * 4. 就是把
 * 双检锁就是判断是否存在再进入线程锁再判断是否存在，
 * 保证不会多创建实例
 * 而且比较高效
 */
public class SingleObject {
    private static SingleObject instance ;

    private SingleObject() {
    }
    public static SingleObject getInstance() {
        /**
         *  * 双检锁就是判断是否存在再进入线程锁再判断是否存在，
         *  * 保证不会多创建实例
         *  * 而且比较高效
         */
        if (instance == null) {
            synchronized (SingleObject.class){
                if (instance == null){
                    instance = new SingleObject();
                }
            }
        }
        return  instance;
    }

    public void printSomeText() {
        System.out.println("单例模式: 调用方法printSomeText()成功 ");
    }
}
