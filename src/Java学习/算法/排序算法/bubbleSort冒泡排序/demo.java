package Java学习.算法.排序算法.bubbleSort冒泡排序;

import java.util.Arrays;

public class demo {
    //冒泡排序算法
    public static void main(String[] args) {

        int [] arrayInt = {5,4,3,2,1};
        int []  sortArray = bubbleSort(arrayInt);
        System.out.println(Arrays.toString(sortArray));
    }
    public  static  int [] bubbleSort(int [] array){
        //冒泡排序
        for (int i = 0;i < array.length -1;i ++){
            for (int j = 0;j <= array.length - 2-i;j++){
                if(array[j] > array[j+1]){
                    int middle = array[j+1];
                    array[j+1] = array[j];
                    array[j] = middle;
                }
            }
        }
        return array;
    }
}
