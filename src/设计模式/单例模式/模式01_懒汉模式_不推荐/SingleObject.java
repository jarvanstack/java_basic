package 设计模式.单例模式.模式01_懒汉模式_不推荐;

/**
 * 作用： 定义单例模式的
 */
public class SingleObject {
    //1.单例模式唯一的实例.的声明.(使用private封装，public的get)
    private static SingleObject instance ;

    //2.构造函数 private 很关键，其他类无法实例化，只能单例模式。
    private SingleObject() {
    }

    //3. get 唯一给外面的接口，就是 getInstance 实例化定义 并 返回实例.
    public static SingleObject getInstance() {
        //定义实例
        if(instance == null){
            instance = new SingleObject();
        }
        //返回实例
        return instance;
    }

    //4. 可供实例调用的方法.
    public void printSomeText() {
        System.out.println("单例模式: 调用方法printSomeText()成功 ");
    }
}
