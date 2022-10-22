package List14_2;

import javax.swing.*;

public class MyIconLabel extends  JLabel {

    private  MyFrame frame;

    public MyIconLabel(MyFrame frame) {
        super();
        this.frame = frame;
        ImageIcon icn = new ImageIcon("res/rabbit.png");
        setIcon(icn);
        setBounds(5,15,frame.getWidth()/4-10, frame.getHeight()-10);
        frame.add(this);
    }
}
