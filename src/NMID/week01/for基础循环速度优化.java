package NMID.week01;

/**
 * 为什么感觉差不多？
 * 优化前1亿次用时：6496毫秒
 * 优化后1亿次用时：6209毫秒
 * 算上程序跑起来的时间其实差不多
 * 而且.length 似乎是和数组一起储存的基本属性，没有调用任何类功能
 * 但是如果是HashMap就不一样了，size()的查询因该是要花费更多的时间的。
 *
 */
public class for基础循环速度优化 {
    public static void main(String[] args) {
        String[] String = new String[1_0000_0000];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < String.length; i++) {
            int x = 0;
            System.out.print("");
        }
        System.out.println("优化前1亿次用时：" + (System.currentTimeMillis() - startTime) + "毫秒");
        int len = String.length;
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            int x = 0;
            System.out.print("");
        }
        System.out.println("优化后1亿次用时：" + (System.currentTimeMillis() - startTime2) + "毫秒");
    }
}
