package Java学习.算法.排序算法.插入排序;

public class Demo01降序 {
    int insertSort(int arrayOfStudentScore[], int numberOfStudent)
    {
        for (int i =  1; i < numberOfStudent; i++) {
            int needToSort;//储存需要排序的元素。
            /**
             * 1.如果后边的比前面大，就先储存后面的值，
             * 2.然后让大的值（needToSort)和前面的()依次比较。得到一个，比大的值更大的值或者 0 索引j。
             * 3.然后把比他小的前面的数都右移动1位。
             * 4，然后把这个数字插入到比比他大的位子就可以了，
             */
            int j;
            if(arrayOfStudentScore[i-1] < arrayOfStudentScore[i]){
                needToSort = arrayOfStudentScore[i];
                //2.然后让大的值（needToSort)和前面的()依次比较。得到一个，比大的值更大的值或者 0 索引j

                //比大的值更大的值或者 0 索引j,(!=0，或者比小于后面大的值就循环)
                for( j = i-1;j >= 0 && arrayOfStudentScore[j]<needToSort;j--){
                    //3.然后把比他小的前面的数都右移动1位。
                    arrayOfStudentScore[j+1] = arrayOfStudentScore[j];
                }
                arrayOfStudentScore[j+1] = needToSort;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] arrint = {1,21,34342,1234,54,12,3,0};
        new Demo01降序().insertSort(arrint,arrint.length);
    }
}
