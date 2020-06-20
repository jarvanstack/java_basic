package Java学习.Java高级.常用类.System常用类;

/**
 * System 3个字段 in out err
 * System 2 个常用方法
 *  currentTimeMillis  标准时间到当当前时间的 毫秒
 *  System.arraycopy(src, 0, dest, 0, 3); 复制数组
 *
 * 这个demo为一个 数组复制的练习：
 *         int[] src = {1, 2, 3, 4, 5};
 *         int[] dest = {6, 7, 8, 9, 10};
 *         复制 src 的前3个到 dest 前3个，覆盖dest为 {1，2，3，9，10}
 *
 */
public class System类 {
    public static void main(String[] args) {
        System.out.println("System.currentTimeMillis():"+System.currentTimeMillis());
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("转化后的dest:");
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }
}
