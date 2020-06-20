package Java学习.拓展GUI.Swing.文本框密码框文本域;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo() {
        this.setVisible(true);
        this.setBounds(100, 100, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //文本框 JTextField text 默认文本，columns列
        JTextField hello = new JTextField("hello", 20);
        TextField textPassword = new TextField("password");
        textPassword.setEchoChar('#');
        //密码框
        JPasswordField password = new JPasswordField("password");
        //文本域
        TextArea textArea = new TextArea("文本域");
        //滚动面板
        JScrollPane jScrollPane = new JScrollPane(textArea);
        //添加组件
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridLayout(4, 1, 5, 5));
        contentPane.add(hello, new GridLayout(1, 1));
        contentPane.add(textPassword, new GridLayout(2, 1));
        contentPane.add(password, new GridLayout(3, 1));
        contentPane.add(jScrollPane, new GridLayout(4, 1));


    }

    public static void main(String[] args) {
        new Demo();
    }
}
