package Java学习.拓展GUI.AWT.MyClass;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
    public MyFrame(String title){
        Frame frame = new Frame(title);
        //location size color
        frame.setLocation(100,100);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("System.exit(0) successfully");
                System.exit(0);
            }
        });
    }
}
