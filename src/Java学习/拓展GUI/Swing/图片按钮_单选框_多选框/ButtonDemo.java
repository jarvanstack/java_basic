    package Java学习.拓展GUI.Swing.图片按钮_单选框_多选框;

    import javax.swing.*;
    import java.awt.*;

    public class ButtonDemo extends JFrame {
        public ButtonDemo() {
            //
            this.setVisible(true);
            this.setBounds(100,100,400,300);
            this.setTitle("ImageIcon按钮");
            Container contentPane = this.getContentPane();
            JButton button = new JButton("label");
            //add the picture to the button
            //use the relative path
            String resource = "D:/Program Files/JetBrains/test1/Lab/src/GUI/Swing/IconAndImageLabel图片和图标标签/img.png";
            ImageIcon imageIcon = new ImageIcon(resource);
            button.setIcon(imageIcon);
            contentPane.add(button);



        }

        public static void main(String[] args) {
            new ButtonDemo();
        }
    }
