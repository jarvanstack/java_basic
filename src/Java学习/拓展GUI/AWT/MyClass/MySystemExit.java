package Java学习.拓展GUI.AWT.MyClass;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MySystemExit {
    public MySystemExit(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("System.exit(0)");
                System.exit(0);

            }
        });
    }
}
