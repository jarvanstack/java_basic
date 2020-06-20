package Java学习.Java高级.常用类.StringBuilder常用类_容器容器;

/**
 * 线程安全我们应该用锁来保证，而不是StringBuffer牺牲性能
 * #### `请使用StringBuilder`
 *
 * StringBuilder 可以被多次修改而不产生新的对象。建议会改变的字符串使用。
 * String 是常量修饰，不能被修改，而且修改了也十分浪费内存。
 * 建议使用 StringBuilder
 * ### 一、添加
 * 1. append() 后添加
 * 2. inset() 插入某个位置
 * ### 二、删除
 *
 */
public class StringBuilder常用类 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = stringBuilder.append("Hello StringBuilder");
        System.out.println("stringBuilder: " + stringBuilder);
        System.out.println("stringBuilder2: " + stringBuilder2);
        System.out.println("stringBuilder==stringBuilder2: " + (stringBuilder == stringBuilder2));//比较地址true
        // stringBuilder.append() 返回的是自己
        System.out.println("========insert()==========");
        stringBuilder.insert(6,"I am ");
        System.out.println("插入 I am 后： "+stringBuilder);
    }
}
