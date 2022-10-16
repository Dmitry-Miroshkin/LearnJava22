package List13_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame implements ActionListener {
    MyFrame(String text, int x, int y) {
        JFrame frame = new JFrame("Окно с меткой и кнопкой");
        frame.setBounds(x, y, 360, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("res/java.jpg");
        JLabel label = new JLabel(text, icon, JLabel.CENTER);
        label.setBounds(50, 10, 330, 700);
        JButton button = new JButton(" OK!");
        button.setBounds(90, 160, 180, 30);
        button.addActionListener(this);
        frame.setLayout(null);
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent AEobj) {
        System.exit(0);
    }
}
