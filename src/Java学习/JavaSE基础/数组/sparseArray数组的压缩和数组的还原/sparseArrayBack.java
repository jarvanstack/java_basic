package Java学习.JavaSE基础.数组.sparseArray数组的压缩和数组的还原;

public class sparseArrayBack {
    public static void main(String[] args) {
        int [][] sparseArray = new int [3][3];

        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = 2;
        sparseArray[1][0] = 1;
        sparseArray[1][1] = 2;
        sparseArray[1][2] = 1;
        sparseArray[2][0] = 2;
        sparseArray[2][1] = 3;
        sparseArray[2][2] = 2;
        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length ; j++) {
                System.out.print(sparseArray[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("====================");
        int [][] sparseArrayBack = sparseArrayBack(sparseArray,0);
        for (int i = 0; i < sparseArrayBack.length; i++) {
            for (int j = 0; j < sparseArrayBack[i].length; j++) {
                System.out.print(sparseArrayBack[i][j]+"  ");
            }
            System.out.println();
        }

    }
    public static int [][] sparseArrayBack(int[][] sparseArray, int reptition){
        int [][] result = new int[sparseArray[0][0]][sparseArray[0][1]];
        // 反转
        for (int i = 1; i < sparseArray.length; i++) {
            result[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        return result;
    }



}
