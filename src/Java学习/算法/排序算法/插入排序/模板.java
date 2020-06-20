package Java学习.算法.排序算法.插入排序;

/**
 * 一、目的：插入排序演示，
 */
public class 模板 {
    private void insertSort(int[] arr) {
        int j; // 已排序列表下标
        int t; // 待排序元素
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                t = arr[i]; // 赋值给待排序元素
                for (j = i - 1; j >= 0 && arr[j] > t; j--) {
                    arr[j + 1] = arr[j]; // 从后往前遍历已排序列表，逐个和待排序元素比较，如果已排序元素较大，则将它后移
                }
                arr[j + 1] = t; // 将待排序元素插入到正确的位置
            }
        }
    }

    public static void main(String[] args) {

    }

}
