package Java学习.拓展GUI.AWT.事件监听;

import Java学习.拓展GUI.AWT.MyClass.MySystemExit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2两个按钮实现同一个监听 {
    public static void main(String[] args) {
        Frame frame = new Frame("Test2两个按钮实现同一个监听");
        frame.setVisible(true);
        Button north = new Button("north");
        Button south = new Button("south");
        //自定义触发会显示的ActionCommand 默认 为Button("...");中的值.
        //add listener for the south and north...
        north.addActionListener(new MyMonitor());
        south.addActionListener(new MyMonitor());


        //2个按钮add the same ActionListener
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);

        //l,s,c
        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        frame.setBackground(new Color(99, 255, 240));
        //System.exit(0);
        new MySystemExit(frame);


    }

    private static class MyMonitor implements ActionListener {
        //build the ActionLister for the north button and the south button ,named myActionListener

        @Override
        public void actionPerformed(ActionEvent e) {
            //输入 e. 查看源码.
            if (e.getActionCommand() == "north") {
                System.out.println("north Button been clicked ，and MyMonitor class run successfully.");
            } else if (e.getActionCommand() == "south") {
                System.out.println("south Button been clicked ，and MyMonitor class run successfully.");
            }
        }
    }


}
