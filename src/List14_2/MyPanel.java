package List14_2;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public JLabel HLab;
    public JLabel VLab;

    MyPanel() {
        super();

        JLabel L1 = new JLabel("По горизонтали: ");
        JLabel L2 = new JLabel("По вертикали: ");
        HLab = new JLabel("На месте");
        VLab = new JLabel("На месте");

        setLayout(new GridLayout(2, 2, 3, 3));

        add(L1);
        add(HLab);
        add(L2);
        add(VLab);
    }
}
