package Java学习.算法.两数之和1;

/**
 * 一、题目
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 二、示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 三、思路：
 * 1.遍历 arrayInt.length i
 * 2.i后面的数j依次和i相加判断是否成功为target,
 *      for(int j = i +1;j <arrayInt.length;j++){
 *          if(arrayInt[i]+arrayInt[j] = target){
 *              return new int[]{i,j};
 *          }
 *      }
 * 如果没有就抛出参数异常:
 *  throw new IllegalArgumentException
 */
public class 解法1暴力强解 {
    private int[] sollution(int[] arrayInt, int target) {
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i+1; j < arrayInt.length ;j++) {
                if ((arrayInt[i] + arrayInt[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int [] arrayInt= new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrayInt[i]=i+1;
        }
        int target = arrayInt[99999]+arrayInt[99998];
        long startTime = System.currentTimeMillis();
        int[] result = new 解法1暴力强解().sollution(arrayInt, target);
        long endTime = System.currentTimeMillis();
        System.out.println("10万个数组元素用时："+(endTime - startTime)+"毫秒");
        for (int i : result) {
            System.out.println("index"+i+" : "+i);
        }
    }

}
