package Java学习.拓展GUI.AWT.Layout布局管理器;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {
    public static void main(String[] args) {
        Frame frame = new Frame("习题Frame");
        //一、gird(2，1)
        frame.setLayout(new GridLayout(2,1,20,10));
        Panel north = new Panel();
        Panel south = new Panel();
        frame.add(north,new GridLayout(1,1));
        frame.add(south,new GridLayout(2,1));
        //二、border
        north.setLayout(new BorderLayout());
        south.setLayout(new BorderLayout());
        north.add(new Button("northWest"),BorderLayout.WEST);
        north.add(new Button("northEast"),BorderLayout.EAST);
        Panel northCenter = new Panel();
        north.add(northCenter,BorderLayout.CENTER);

        south.add(new Button("southWest"),BorderLayout.WEST);
        south.add(new Button("southEast"), BorderLayout.EAST);
        Panel southCenter = new Panel();
        south.add(southCenter,BorderLayout.CENTER);
        //三、gird
        northCenter.setLayout(new GridLayout(2,1,20,20));
        southCenter.setLayout(new GridLayout(2,2,20,20));
        northCenter.add(new Button("northCenterr1c1"),new GridLayout(1,1));
        northCenter.add(new Button("northCenterr2c1"),new GridLayout(2,1));

        southCenter.add(new Button("southCenterr1c1"),new GridLayout(1,1));
        southCenter.add(new Button("southCenterr1c2"),new GridLayout(1,2));
        southCenter.add(new Button("southCenterr2c1"),new GridLayout(2,1));
        southCenter.add(new Button("southCenterr2c2"),new GridLayout(2,2));




        //set location size background
        frame.setLocation(100,100);
        frame.setSize(400,400);
        frame.setBackground(new Color(255, 255, 255));
        north.setBackground(new Color(99, 255, 240));




        //set visibility.
        frame.setVisible(true);

        //add closing listener.
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("exit successfully");
                System.exit(0);
            }
        });
    }
}
