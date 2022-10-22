package List14_2;

import javax.swing.*;

public class MyButton extends JButton {

    private MyFrame frame;

    public MyButton(MyFrame frame, boolean state) {
        super();
        this.frame = frame;
        String fileName = "";
        String bName;

        if (state) {
            fileName = "Yes.png";
            bName = "Да";
            addActionListener(new HandlerYes(frame));
        } else {
            fileName = "No.png";
            bName = "Нет";
            addActionListener(new HandlerNo());
        }
        fileName = "res/" + fileName;
        ImageIcon icn = new ImageIcon(fileName);
        setIcon(icn);
        setText(bName);
        setFocusPainted(false);
        int w = frame.getWidth() / 4;
        int h = frame.getHeight() / 8;
        setSize(w, h);
        int x = frame.getWidth() / 4, y = frame.getHeight() - h - 50;
        if (!state) x += w + 50;
        setLocation(x,y);
        frame.add(this);
    }
}