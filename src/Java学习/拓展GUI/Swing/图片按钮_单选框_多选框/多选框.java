package Java学习.拓展GUI.Swing.图片按钮_单选框_多选框;

import javax.swing.*;
import java.awt.*;

public class 多选框 extends JFrame {
    public 多选框() throws HeadlessException {
        this.setTitle("多选框");
        this.setBounds(100, 100, 400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        /*
        复选框教程：
        1.新建 Checkbox()
        2.将复选框添加到容器
         */
        Checkbox jarvan = new Checkbox("jarvan");
        Checkbox shiGuang = new Checkbox("shiGuang");
        Checkbox 半亩方糖 = new Checkbox("半亩方糖");
        //add checkBox to the contentPane
        Container contentPane = this.getContentPane();
        contentPane.add(jarvan, BorderLayout.NORTH);
        contentPane.add(shiGuang, BorderLayout.CENTER);
        contentPane.add(半亩方糖, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new 多选框();

    }
}
