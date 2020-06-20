package Java学习.拓展GUI.Swing.JFrame窗体;

import javax.swing.*;
import java.awt.*;

public class 第一个JFrame {
    public void init() {
        JFrame frame = new JFrame();
        //这里使用setTitle 代替 setName()
        frame.setTitle("第一个JFrame");
        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        //
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(new Color(255, 255, 255));
        //add JLabel
        JLabel label = new JLabel("JLabelTxt");
        contentPane.add(label);
        //设置水平居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.setVisible(true);
        //这里有内置的退出方法可以用.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new 第一个JFrame().init();
    }
}
