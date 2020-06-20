package Java学习.拓展GUI.Swing.图片按钮_单选框_多选框;

import javax.swing.*;
import java.awt.*;

public class 单选框 extends JFrame {
    public 单选框() throws HeadlessException {
        this.setTitle("单选框");
        this.setVisible(true);
        this.setBounds(100,100,400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        /*
        单选框方法教程:
        new 3 个 JRadioButton 单选框，然后放到一个按钮组ButtonGroup里(按钮组只实现单选效果，不布局）
        在将3个单选按钮填加到容器并且布局
         */
        JRadioButton jarvan = new JRadioButton("jarvan");
        JRadioButton 半亩方糖 = new JRadioButton("半亩方糖");
        JRadioButton 时光 = new JRadioButton("时光");
        //add the JRadioButtons to the ButtonGroup
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jarvan);
        buttonGroup.add(半亩方糖);
        buttonGroup.add(时光);
        //add the JRadioButtons to the contentPane ,and set the Layout
        contentPane.add(jarvan,BorderLayout.NORTH);
        contentPane.add(半亩方糖,BorderLayout.CENTER);
        contentPane.add(时光,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new 单选框();
    }
}
