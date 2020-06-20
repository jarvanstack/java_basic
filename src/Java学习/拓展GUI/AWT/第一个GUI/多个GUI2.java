package Java学习.拓展GUI.AWT.第一个GUI;

import java.awt.*;

public class 多个GUI2 {
    public static void main(String[] args) {
        MyFrames2 frame1 = new MyFrames2(300,300,200,200, Color.yellow);
        MyFrames2 frame2 = new MyFrames2(500,300,200,200, Color.green);
        MyFrames2 frame3 = new MyFrames2(300,500,200,200, Color.red);
        MyFrames2 frame4 = new MyFrames2(500,500,200,200, Color.blue);

    }
}
