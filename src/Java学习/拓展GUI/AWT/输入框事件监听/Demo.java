package Java学习.拓展GUI.AWT.输入框事件监听;

import Java学习.拓展GUI.AWT.MyClass.MySystemExit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        new My输入框事件监听Frame();
    }
}

class My输入框事件监听Frame extends Frame {
    My输入框事件监听Frame() {
        TextField textField = new TextField();//build a TextField ,difference of the TextArea
        this.add(textField);//add textField to MyFrame
        //Listener the text of the textField,use,监听输入的文字
        MyActionListener输入框事件监听 myActionListener = new MyActionListener输入框事件监听();
        //add the ActionListener to the TextField，按下回车就会触发事件
        textField.addActionListener(myActionListener);
        //设置替换编码,密码专用。 setting the replacement character.
        textField.setEchoChar('*');
        //setting the visibility
        this.setVisible(true);
        this.setLocation(100, 100);
        this.setSize(400, 400);
        textField.setBackground(new Color(99, 255, 240));


        new MySystemExit(this);


    }
}

class MyActionListener输入框事件监听 implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();//see the source code ,it will return a Object
        TextField textField = (TextField) e.getSource();//强制转换coercion
        textField.getText();//see the source code ,it will return a String
        System.out.println(textField.getText());
        textField.setText("");//see the source code,it need pass a String
    }
}