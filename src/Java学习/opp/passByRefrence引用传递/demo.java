package Java学习.opp.passByRefrence引用传递;

public class demo {
    //值传递
    public static void main(String[] args) {

        Change change = new Change();
        System.out.println("传递前:" + change.i);
        //引用传递
        change(change);
        System.out.println("传递后:" + change.i);
    }

    public static void change(Change change) {
        change.i = 2;
    }
}

class Change {
    int i;
}
