package Java学习.拓展GUI.AWT.事件监听;

import Java学习.拓展GUI.AWT.MyClass.MyActionListener;
import Java学习.拓展GUI.AWT.MyClass.MySystemExit;

import java.awt.*;

/**
 * 自制一个事件监听类，添加到按钮里。
 */
public class Demo {
    public static void main(String[] args) {
        Frame frame = new Frame("事件监听");
        Button north = new Button("north");
        Button south = new Button("south");
        //因为addActionListener(...) 需要一个 ActionListener 所以我门自己建造一个 MyActionListener
        //查看源码得知，public synchronized void addActionListener(ActionListener l)
        MyActionListener myActionListener = new MyActionListener();
        north.addActionListener(myActionListener);
        south.addActionListener(myActionListener);

        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.pack();//打包.pack()

        //color location size
        frame.setLocation(100, 100);
        frame.setSize(400, 400);
        frame.setBackground(new Color(99, 255, 240));
        //可见性.
        frame.setVisible(true);
        //add ActionListener.
        new MySystemExit(frame);


    }
}
