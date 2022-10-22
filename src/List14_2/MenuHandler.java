package List14_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuHandler implements ActionListener {
    private boolean dir;
    private MyFrame frame;
    public MenuHandler(MyFrame frame, boolean dir) {
        this.frame = frame;
        this.dir = dir;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd= e.getActionCommand();
        if (dir){
            frame.move.HLab.setText(cmd.toLowerCase());
            if (cmd.equalsIgnoreCase("Вправо")) frame.setH(50);
            else if (cmd.equalsIgnoreCase("Влево")) frame.setH(-50);
            else frame.setH(0);
        } else {
            frame.move.VLab.setText(cmd.toLowerCase());
            if (cmd.equalsIgnoreCase("Вверх")) frame.setV(-50);
            else if (cmd.equalsIgnoreCase("Вниз")) frame.setV(50);
            else  frame.setV(0);
        }
    }
}
