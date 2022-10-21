package List14_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextInputFrame implements ActionListener {

    private final JFrame frame;
    JLabel enter;
    JTextField tf;
    JButton btYes, btNo;

    public TextInputFrame(String msg) {
        int width = 300, height = 150;
        frame = new JFrame(" Окно ввода текста...");
        frame.setBounds(400, 300, width, height);
        frame.setLayout(null);
        enter = new JLabel(msg, JLabel.LEFT);
        enter.setBounds(10, 10, width - 20, height / 6);
        tf = new JTextField(frame.getWidth() - 20);
        tf.setBounds(10, enter.getHeight() + 5, enter.getWidth(), height / 6);

        btYes = new JButton("Подтверждаю");
        btYes.setBounds(10, height / 2 + 10, (width - 30) / 2, height / 6);
        btYes.setFocusPainted(false);

        btNo = new JButton("Завершить");
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

    @Override
    public void actionPerformed(ActionEvent ae) {
          String btName =ae.getActionCommand();
          if (btName.equalsIgnoreCase(btYes.getText())){
              String name = tf.getText();
          frame.setVisible(false);
          IntInputFrame.show("Сколько Вам лет? Укажите возраст (лет):", name);}
          else  System.exit(0);
    }
    static void show(){
        new TextInputFrame("Как Вас зовут? Введите имя:");
    }
}
