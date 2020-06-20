package NMID.week02.NMIDweek02二维数组面试题;

public class Demo {
    public static void main(String[] args) {
        /**
         * #### 1、定义 int[] x,y[]; 判断下面赋值操作是否正确。（毕4-14）
         *    a. x[0] = y;
         *    b. y[0] = x;
         *    c. y[0][0] = x;
         *    d. x[0][0] = y;
         *    e. y[0][0] = x[0];
         *    f. x = y;
         *    #### 解决要点：
         *    1.
         *       //int [] x,y[] ;
         *      //等价于
         *      int [] x ;
         *      int [] [] y;
         *    2.直接赋值二维数组的一个横行row 需要一个 以为数组
         */
        int[] x,y[];//哪个家伙如此声明，可能会被打死
        /*
        x[0] = y; //error
        y[0] = x; //ok
        y[0][0] = x; //error
        x[0][0] = y;//error
        y[0][0] = x[0]; //ok
        x = y; //error
         */
    }
}
