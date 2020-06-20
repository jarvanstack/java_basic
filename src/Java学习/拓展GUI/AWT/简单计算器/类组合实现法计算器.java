package Java学习.拓展GUI.AWT.简单计算器;

import Java学习.拓展GUI.AWT.MyClass.MySystemExit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 类组合实现法计算器 extends Frame {
    Panel north;
    Panel south;
    //二、north
    TextField north1;
    Label north2;
    TextField north3;
    Label north4;
    TextField north5;
    //south
    Panel south1;
    Button south2;
    Panel south3;

    void loadFrame() {
        this.setName("简单计算器窗口");
        this.setLayout(new GridLayout(2, 1, 20, 20));
        //实现样式一、
        north = new Panel();
        south = new Panel();
        this.add(north, new GridLayout(1, 1));
        this.add(south, new GridLayout(2, 1));
        north.setBackground(new Color(255, 255, 255));
        //实现样式二、
        north.setLayout(new GridLayout(1, 5, 5, 5));

        north1 = new TextField();
        north2 = new Label(" + ");
        north3 = new TextField();
        north4 = new Label(" = ");
        north5 = new TextField();
        north.add(north1, new GridLayout(1, 1));
        north.add(north2, new GridLayout(1, 2));
        north.add(north3, new GridLayout(1, 3));
        north.add(north4, new GridLayout(1, 4));
        north.add(north5, new GridLayout(1, 5));


        south.setLayout(new GridLayout(1, 3, 5, 5));
        south1 = new Panel();
        south2 = new Button("confrim");
        south3 = new Panel();
        south.add(south1, new GridLayout(1, 1));
        south.add(south2, new GridLayout(1, 2));
        south.add(south3, new GridLayout(1, 3));
        //实现功能
        south2.addActionListener(new My类组合实现法计算器ActionListener(this));
        //location size color
        this.setLocation(100, 100);
        this.setSize(400, 100);
        this.setVisible(true);
        new MySystemExit(this);
    }

    public static void main(String[] args) {
        new 类组合实现法计算器().loadFrame();
    }
}

class My类组合实现法计算器ActionListener implements ActionListener {
    //获取窗体对象
    类组合实现法计算器 frameObj = null;

    My类组合实现法计算器ActionListener(类组合实现法计算器 frameObj) {
        this.frameObj = frameObj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frameObj.north5.setText(Double.valueOf(frameObj.north1.getText()) +
                Double.valueOf(frameObj.north3.getText()) + "");
        frameObj.north1.setText("");
        frameObj.north3.setText("");

    }
}
