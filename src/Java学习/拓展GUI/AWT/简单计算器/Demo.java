package Java学习.拓展GUI.AWT.简单计算器;

import Java学习.拓展GUI.AWT.MyClass.MySystemExit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        new CalculatorFrame();
    }
}

class CalculatorFrame extends Frame {
    CalculatorFrame() {
        this.setName("简单计算器窗口");
        this.setLayout(new GridLayout(2, 1, 20, 20));
        //实现样式一、
        Panel north = new Panel();
        Panel south = new Panel();
        this.add(north, new GridLayout(1, 1));
        this.add(south, new GridLayout(2, 1));
        north.setBackground(new Color(99, 255, 240));
        //实现样式二、
        north.setLayout(new GridLayout(1, 5, 5, 5));

        TextField north1 = new TextField();
        Label north2 = new Label(" + ");
        TextField north3 = new TextField();
        Label north4 = new Label(" = ");
        TextField north5 = new TextField();
        north.add(north1, new GridLayout(1, 1));
        north.add(north2, new GridLayout(1, 2));
        north.add(north3, new GridLayout(1, 3));
        north.add(north4, new GridLayout(1, 4));
        north.add(north5, new GridLayout(1, 5));


        south.setLayout(new GridLayout(1, 3, 5, 5));
        Panel south1 = new Panel();
        Button south2 = new Button("confrim");
        Panel south3 = new Panel();
        south.add(south1, new GridLayout(1, 1));
        south.add(south2, new GridLayout(1, 2));
        south.add(south3, new GridLayout(1, 3));
        //实现功能
        south2.addActionListener(new MyCalculatorActionListener(north1, north3, north5));
        //location size color
        this.setLocation(100, 100);
        this.setSize(400, 400);

        this.setVisible(true);
        new MySystemExit(this);
    }
}

class MyCalculatorActionListener implements ActionListener {
    TextField x, y, z;

    MyCalculatorActionListener(TextField x, TextField y, TextField z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        z.setText(Double.valueOf(x.getText()) + Double.valueOf(y.getText()) + "");
        x.setText("");
        y.setText("");
    }
}