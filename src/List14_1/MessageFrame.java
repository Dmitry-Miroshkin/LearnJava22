package List14_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageFrame implements ActionListener {
    private JFrame frame;
    JLabel i1;
    JLabel message;
    JButton button;

    public MessageFrame(String msg) {
        int width = 350, heigh = 150;
        ImageIcon img = new ImageIcon("res/letter_result.jpg");
        frame = new JFrame("Сообщение...");
        frame.setBounds(400,300,width,heigh);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        Image icon = frame.getToolkit().getImage("res/red-shield-icon-access-denied-protection-and-vector-19164654.jpg");
        i1 = new JLabel(img);
        int w = img.getIconWidth();
        int h = img.getIconHeight();
        i1.setBounds(10,10,w,h);
        message = new JLabel("<html>"+ msg.replace("\n","<br>")+"<html>",JLabel.LEFT);
        message.setBounds(w+20,10,width-30-w,heigh/2-10);
        frame.add(i1);
        frame.add(message);
        button = new JButton("Прочитано!");
        button.setBounds(width/4,3*heigh/6,width/2,heigh/8);
        button.setFocusPainted(false);
        button.addActionListener(this);
        frame.add(button);
        frame.setResizable(false);
        frame.setIconImage(icon);
        frame.setVisible(true);
    }

    public static void show(String msg) {
    new MessageFrame(msg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

