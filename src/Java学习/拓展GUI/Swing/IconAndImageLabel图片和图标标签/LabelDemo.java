package Java学习.拓展GUI.Swing.IconAndImageLabel图片和图标标签;

import javax.swing.*;
import java.awt.*;

public class LabelDemo extends JFrame {
    public LabelDemo() {
        //use the constructor to unit a Frame
        this.setVisible(true);
        this.setBounds(100, 100, 400, 200);
        Container contentPane = this.getContentPane();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //get url 使用 当前类名.class.getResource("");传入相对地址得到绝对地址.//无法使用，此处使用绝对路径
        String url = "D:/Program Files/JetBrains/test1/Lab/src/GUI/Swing/IconAndImageLabel图片和图标标签/img.png";
        //使用url得到一个 Image 的对象
        ImageIcon imageIcon = new ImageIcon(url);
        //创建一个label 并将url参数传递给label,并居中显示，查看源码可以得出有3个参数，String Icon 和对齐方式
        JLabel label = new JLabel("img.png", imageIcon, SwingConstants.CENTER);
        //add label to contentPane
        contentPane.add(label);
    }

    public static void main(String[] args) {
        new LabelDemo();
    }
}
