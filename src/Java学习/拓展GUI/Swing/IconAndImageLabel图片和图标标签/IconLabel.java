package Java学习.拓展GUI.Swing.IconAndImageLabel图片和图标标签;

import javax.swing.*;
import java.awt.*;

public class IconLabel extends JFrame implements Icon {
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillRect(x,y,20,20);
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
    //使用构造方法创建Frame

    public IconLabel() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(100,100,400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //add Icon to label,注意paintIcon()在new  的时候就会初始化
        IconLabel iconLabel = new IconLabel();
        JLabel label = new JLabel("图标label",iconLabel,SwingConstants.CENTER);
        //add label to contentPane
        Container contentPane = this.getContentPane();
        contentPane.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public static void main(String[] args) {
        new IconLabel();
    }
}
