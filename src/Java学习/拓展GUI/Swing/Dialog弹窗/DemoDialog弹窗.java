package Java学习.拓展GUI.Swing.Dialog弹窗;

import javax.swing.*;
import java.awt.*;

public class DemoDialog弹窗 extends JDialog {
    //construct method 构造方法初始化弹窗样式
    DemoDialog弹窗(){
        this.setTitle("Dialog弹窗");
        this.setVisible(true);
        this.setLocation(200,200);
        this.setSize(200,250);
        //add one label
        Container contentPane = this.getContentPane();
        JLabel jLabel = new JLabel("再容器中添加标签");
        contentPane.add(jLabel);
        //center 居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);


    }
}
