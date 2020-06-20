package Java学习.拓展GUI.AWT.Layout布局管理器;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayout表格布局 {
    public static void main(String[] args) {
        Frame frame = new Frame("表格布局");
        //set the layout
        frame.setLayout(new GridLayout(3,3,20,20));
        //create buttons
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");
        Button button8 = new Button("button8");
        Button button9 = new Button("button9");
        //add buttons
        frame.add(button1,new GridLayout(1,1));
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        //set the location size and background color
        frame.setLocation(100,100);
        frame.setSize(400,400);
        frame.setBackground(new Color(62, 213, 226));
        //set the visibility.
        frame.setVisible(true);
        //add the listener of closing the windows.
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("close successfully.");
                System.exit(0);
            }
        });

    }
}
