package Java学习.拓展GUI.Swing.JcomboBox下拉框_JList列表框;

import javax.swing.*;
import java.awt.*;

public class 下拉框 extends JFrame {
    public 下拉框() {
        this.setBounds(100, 100, 400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        /*
        下拉框教程：
        1.新建 new JComboBox ()下拉框
        2.给新的添加元素 addItem()
        3.将下拉框添加到容器，然后布局

         */
        JComboBox<Object> comboBox = new JComboBox<>();
        comboBox.addItem(null);
        comboBox.addItem("hello");
        comboBox.addItem("Hi");
        comboBox.addItem("how");
        //and the comboBox to the contentPane
        Container contentPane = this.getContentPane();
        contentPane.add(comboBox, BorderLayout.CENTER);
        contentPane.add(new JPanel(), BorderLayout.SOUTH);


    }

    public static void main(String[] args) {
        new 下拉框();

    }
}
