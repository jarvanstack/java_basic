package Java学习.拓展GUI.AWT.画图模拟;

import javax.swing.*;
import java.awt.*;

public class 画图Frame extends JFrame {

    public 画图Frame() throws HeadlessException {
        this.setTitle("画图Frame");
        this.setVisible(true);
        this.setBounds(100,100,400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.add(new PaintPanle());
        //鼠标点击事件增加数组数量


    }
}
