package Java学习.拓展GUI.AWT.第一个GUI;

import java.awt.*;

public class MyFrames2 extends Frame {
    static int count = 0;
    MyFrames2(int x, int y, int w, int h, Color color){
        super("MyFrame "+(++count));//此时super 指代Frame() 里面写title
        setSize(w,h);
        setLocation(x,y);
        setBackground(color);
        setVisible(true);
    }
}
