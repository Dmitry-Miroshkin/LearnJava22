package List14_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandlerYes implements ActionListener {

    private  MyFrame frame;
    public HandlerYes(MyFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.handler();
    }
}
