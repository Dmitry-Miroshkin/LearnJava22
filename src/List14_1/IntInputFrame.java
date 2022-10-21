package List14_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class IntInputFrame implements KeyListener, ActionListener {

    private final JFrame frame;

    private final JButton btYes;
    private final JTextField tf;
    private final String name;
    private int age;

    public IntInputFrame(String msg, String name) {
        this.name = new String(name);
        int width = 300, height = 150;
        frame = new JFrame(" Окно для ввода числа (возраста)...");
        frame.setBounds(400, 300, width, height);
        frame.setLayout(null);
        JLabel enter = new JLabel(msg, JLabel.LEFT);
        enter.setBounds(10, 10, width - 20, height / 6);
        tf = new JTextField(frame.getWidth() - 20);
        tf.setBounds(10, enter.getHeight() + 5, enter.getWidth(), height / 6);
        tf.addKeyListener(this);
        btYes = new JButton("Подтверждаю");
        btYes.setBounds(10, height / 2 + 10, (width - 30) / 2, height / 6);
        btYes.setEnabled(false);
        btYes.setFocusPainted(false);
        JButton btNo = new JButton("Завершить");
        btNo.setBounds((width - 30) / 2 + 18, height / 2 + 10, (width - 30) / 2, height / 6);
        btNo.setFocusPainted(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(enter);
        frame.add(tf);
        frame.add(btYes);
        frame.add(btNo);
        frame.setResizable(false);
        btYes.addActionListener(this);
        btNo.addActionListener(this);
        frame.setVisible(true);

    }

    public static void show(String txt, String name) {
        new IntInputFrame(txt, name);
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        try {
            Integer.parseInt(tf.getText());
            btYes.setEnabled(true);
        } catch (Exception e) {
            btYes.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String btName = ae.getActionCommand();
        if (btName.equalsIgnoreCase(btYes.getText())) {
            age = Integer.parseInt(tf.getText());
            frame.setVisible(false);
            String msg = "Добрый день, " + name + "!\n";
            msg += "Ваш возраст - " + age + " лет!";
            MessageFrame.show(msg);
        } else System.exit(0);
    }
}
