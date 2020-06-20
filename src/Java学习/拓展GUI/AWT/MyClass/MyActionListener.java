package Java学习.拓展GUI.AWT.MyClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//事件监听
public class MyActionListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("the ActionCommand of the component is : "+e.getActionCommand());
    }
}
