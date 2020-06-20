package Java学习.算法.排序算法.插入排序;

/**
 * 一、插入排序：升序.
 * 二、步骤
 * 1.遍历 i 1 - n
 * 2.array[i]和array[0，1，2，i-1]比较，
 */
public class Demo {
    private static int[] insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {//遍历一遍，
            int t ;//储存需要排序的元素，
            //已经排号元素的下标，这个非常重要，
            //1.依次比较的过程中，比t大的元素都后移动一个下标--array[j+1] = array[j];
            //2.出循环：值到0下标(此时 j=-1)，或者前面出现小元素了，--array[j+1] = t（需要调换的值)
            int j;
            if(array[i]<array[i-1]){//如果后面比前面小，就移动到前面的某个位置
                t = array[i];//储存需要排队的元素，
                //需要排序的元素和前面的元素依次比较，值到0下标，或者前面出现小元素了
                for (j = i-1;j>=0 && array[j]>t;j--){
                    //依次比较的过程中，比t大的元素都后移动一个下标
                    array[j+1] = array[j];
                }
                //出循环：值到0下标(此时 j=-1)，或者前面出现小元素了，
                array[j+1] = t;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,35,5,77,9,90,3,2};
        insertSort(array);
        for (int i : array) {
            System.out.print(i+" , ");
        }
    }
}
