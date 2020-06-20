package Java学习.拓展GUI.Swing.滚动面板JscrollPane;

import javax.swing.*;
import java.awt.*;

public class JscrollPaneDemo extends JFrame {
    public JscrollPaneDemo() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(100, 100, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //new a TextArea
        JTextArea textArea = new JTextArea(20, 20);
        textArea.setText("hello textArea");
        //new JScrollPane and add textArea to jScrollPane
        JScrollPane jScrollPane = new JScrollPane(textArea);
        //add js to container
        Container contentPane = this.getContentPane();
        contentPane.setBackground(new Color(99, 255, 240));
        contentPane.add(jScrollPane);
    }

    public static void main(String[] args) {
        new JscrollPaneDemo();
    }
}
