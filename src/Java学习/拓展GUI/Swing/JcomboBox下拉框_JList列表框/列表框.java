package Java学习.拓展GUI.Swing.JcomboBox下拉框_JList列表框;

import javax.swing.*;
import java.awt.*;

public class 列表框 extends JFrame {
    public 列表框() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 400);
        this.setTitle("列表框");
        /*
        列表框教程:
        1.新建列表，数组，或者集合之类的 比如 String[] arrString = {"1","2"};
        2.新建JList 并且传去参数 new JList(arrString);(此方法可以吗动态的添加Lis内容)
        3.将JList 添加到容器.
         */
        String[] arrString = {"1", "2", "3"};
        JList<String> stringJList = new JList<>(arrString);
        Container contentPane = this.getContentPane();
        contentPane.add(stringJList);
    }

    public static void main(String[] args) {
        new 列表框();

    }
}
