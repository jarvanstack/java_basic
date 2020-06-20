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
 * 1.在方法2赋值的就查看有无complement成立，
 * 2.成立就返回
 * 3.不成立就抛出异常。
 */
public class 解法3一遍哈希表 {
    private int[] sollution3(int[] arrayInt, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayInt.length; i++) {
            map.put(arrayInt[i],i);//储值
            int complement = target - arrayInt[i];
            //如果包含差值，而且差值不和arrayInt[i]重复。
            if(map.containsKey(complement) && complement != arrayInt[i]){
                return new int[]{map.get(complement),i};
            }
        }
        throw new IllegalArgumentException("没有此数据");
    }

    public static void main(String[] args) {
        int[] arrayInt = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrayInt[i] = i + 10;
        }
        int target = arrayInt[99999] + arrayInt[99998];
        long startTime = System.currentTimeMillis();
        int[] result = new 解法3一遍哈希表().sollution3(arrayInt,target);
        long endTime = System.currentTimeMillis();
        System.out.println("10万个数组元素用时：" + (endTime - startTime) + "毫秒");
        for (int i : result) {
            System.out.println("index" + i + " : " + i);
        }
    }
}
