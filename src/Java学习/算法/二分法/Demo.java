package Java学习.算法.二分法;

import java.util.Random;

/**
 * 使用2分法查找 10亿个 int 中的一个 target 并返回 索引
 * 二、实现步骤：
 * 1. 定义star和end的下标值
 * 2.一个当start<=end 的while循环
 * 3.middle = (start + end)/2
 * 4.if(target < middle) 就 end = middle-1;
 * 易错点：因为中间值已经测试过了，所以可以建议缩小范围
 * 5.同理处理其他的2种情况，
 * 6.如果while查找失败，抛出异常
 * 三、注意：
 * 1。先决条件：有序数组
 * 2. 注意数据类int 的是有范围的，middle = start + (end-start)/2更合适
 * 原来的为 middle = (start + end )/2
 * 3, 注意 start = middle +1;end = middle -1 ;防止死循环
 * 4.数据量不可过大
 */
public class Demo {
    private int dchotomy(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == array[middle]) {
                return middle;
            }
            //@易错点：因为中间值已经测试过了，所以可以建议缩小范围
            else if (target < array[middle]) {
                end = middle - 1;
            } else if (target > array[middle]) {
                start = middle + 1;
            }
        }
        //如果找不到，抛出异常
        throw new IllegalArgumentException("找不到数据,参数错误");
    }

    public static void main(String[] args) {
        int[] array = new int[10000_0000_0];
        for (int i = 0; i < 10000_0000_0; i++) {
            array[i] = i + 10;
        }
        int i = new Random().nextInt(1000000000);
        long startTime = System.currentTimeMillis();
        System.out.println("随机数的在10亿个元素数组中的下标为:" + new Demo().dchotomy(array, i + 10));
        System.out.println("运行的时间为" + (System.currentTimeMillis() - startTime) + "毫秒");

    }
}
