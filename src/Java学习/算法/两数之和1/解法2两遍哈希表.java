package Java学习.算法.两数之和1;

import java.util.HashMap;

/**
 * 一、题目
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * * <p>
 * 二、示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 三、思路：
 * 1.将数组变为哈希表结构HashMap，储存
 * 2.遍历1遍看看是否能找到差值complement的索引,而且不能重复原值,
 * 3.返回答案
 * 4.查找不到抛出异常 throw new IllegalArgumentException;非法参数异常.
 * 四、问题，complement差值，获取key的值比较麻烦，解决1.储值的时候调换key和value的位置
 */
public class 解法2两遍哈希表 {
    private int[] sollution2(int[] arrayInt, int target) {
        //1.HashMap 然后储值
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayInt.length; i++) {
            map.put(arrayInt[i], i);
        }
        // 2.遍历1遍看看是否能找到差值complement的索引,而且不能重复原值,
        for (int i = 0; i < map.size(); i++) {
            int complement = target - arrayInt[i];
            //差值在map 的key值中存在，并且差值 和map 此时的原值不能重复.
            if (map.containsKey(complement) && map.get(i) != complement) {
                //3.返回i，索引和 ，key值complement 的value 索引。
                return new int[]{i, map.get(complement)};
            }
        }
        //4.没有抛出异常
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int[] arrayInt = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrayInt[i] = i + 10;
        }
        int target = arrayInt[99999] + arrayInt[99998];
        long startTime = System.currentTimeMillis();
        int[] result = new 解法2两遍哈希表().sollution2(arrayInt, target);
        long endTime = System.currentTimeMillis();
        System.out.println("10万个数组元素用时：" + (endTime - startTime) + "毫秒");
        for (int i : result) {
            System.out.println("index" + i + " : " + i);
        }
    }
}
