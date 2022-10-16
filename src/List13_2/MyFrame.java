package List13_2;

import javax.swing.*;

public class MyFrame {
    public MyFrame() {
        JFrame frame = new JFrame("окно с меткой");
        frame.setBounds(400,300,180,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        frame.add(label);
        frame.setVisible(true);
    }
}
