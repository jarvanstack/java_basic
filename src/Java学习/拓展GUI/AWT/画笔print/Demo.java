package Java学习.拓展GUI.AWT.画笔print;

import Java学习.拓展GUI.AWT.MyClass.MySystemExit;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo() throws HeadlessException {

        this.setLocation(100, 100);
        this.setSize(500, 400);
        this.setVisible(true);
        new MySystemExit(this);
        this.add(new 画笔PrintFrame());
    }

    public static void main(String[] args) {
        new Demo();
    }
}

class 画笔PrintFrame extends JPanel {
    //构造函数初始化Frame

    //重写Override print画笔的方法

    @Override
    public void paint(Graphics g) {
        super.paint(g);// 此处如果没有初始化的用处就可以删去
        //画一个圆
        g.drawOval(0, 0, 30, 30);
        //填充一个圆形
        g.fillOval(40, 0, 30, 30);
        //填充一个矩形
        g.fillRect(80, 0, 40, 30);
        //改变颜色
        g.setColor(new Color(99, 255, 240));
        //画一个arc 弧形
        g.drawArc(50, 0, 50, 20, 40, 60);


    }
}