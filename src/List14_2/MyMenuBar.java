package List14_2;

import javax.swing.*;

public class MyMenuBar extends JMenuBar {

    private MyFrame frame;

    public MyMenuBar(MyFrame frame) {
        super();
        this.frame = frame;
        JMenu wind = new JMenu("Окно");
        JMenuItem apply = new JMenuItem("Подтверждаю");
        JMenuItem exit = new JMenuItem("Выход");
        apply.addActionListener(new HandlerYes(frame));
        exit.addActionListener(new HandlerNo());
        wind.add(apply);
        wind.add(exit);
        add(wind);
        JMenu horiz = new JMenu("По горизонтали");
        JMenuItem left = new JMenuItem("влево");
        JMenuItem right = new JMenuItem("вправо");
        JMenuItem hnone = new JMenuItem("На месте");
        left.addActionListener(new MenuHandler(frame,true));
        right.addActionListener(new MenuHandler(frame, true));
        hnone.addActionListener(new MenuHandler(frame,true));
        horiz.add(left);
        horiz.add(right);
        horiz.add(hnone);
        add(horiz);

        JMenu vert = new JMenu("По вертикали");
        JMenuItem up = new JMenuItem("вверх");
        JMenuItem down = new JMenuItem("вниз");
        JMenuItem vnone = new JMenuItem("На месте");

        up.addActionListener(new MenuHandler(frame,false));
        down.addActionListener(new MenuHandler(frame,false));
        vnone.addActionListener(new MenuHandler(frame,false));
        vert.add(up);
        vert.add(down);
        vert.add(vnone);
        add(vert);

        setBounds(1,1, frame.getWidth()-1, frame.getHeight()/10 );
        frame.add(this);
    }
}
