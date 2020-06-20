package Java学习.JavaSE基础.数组.sparseArray数组的压缩和数组的还原;

public class sparseArray {
    //数据结构 稀疏数组的压缩和稀疏数组的还原.
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][3] = 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("==========================");
        int[][] sparseArray = toSparseArray(array, 0);
        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                System.out.print(sparseArray[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] toSparseArray(int[][] array, int reptition) {
        //获取有效值的总个数 summer
        int summer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != reptition) {
                    summer++;
                }
            }

        }
        //创建一个新的数组，压缩数组的雏形。
        int[][] sparseArray = new int[3][summer + 1];
        //获取压缩数组的有效值
        sparseArray[0][0] = array.length;
        sparseArray[0][1] = array[0].length;
        sparseArray[0][2] = summer;
        summer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != reptition) {
                    summer++;
                    sparseArray[summer][0] = i;
                    sparseArray[summer][1] = j;
                    sparseArray[summer][2] = array[i][j];
                }
            }

        }
        return sparseArray;
    }

}
