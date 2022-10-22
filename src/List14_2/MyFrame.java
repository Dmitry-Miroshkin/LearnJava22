package List14_2;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public  MyPanel move;
    private final int[] step;
    public void setH(int i){
        step[0] = i;
    }
    public void setV(int i) {
        step[1] = i;
    }
    MyFrame(String text, int x, int y ){
        super();
        step = new int[] {0,0};
        setTitle(text);
        setBounds(400,300,x,y);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        new MyButton(this,true);
        new MyButton(this, false);
        new  MyMenuBar(this);
        new MyIconLabel(this);
        JLabel msg = new JLabel("Хотите переместить окно?");
        msg.setBounds(getWidth()/4,15,3*getWidth()/4-10,getHeight()/4-5);
        Font fnt = new Font("Arial",Font.BOLD,18);
        msg.setFont(fnt);
        add(msg);
        move = new MyPanel();
        move.setBounds(msg.getX(), msg.getY()+ msg.getHeight()+1,
                msg.getWidth(), msg.getHeight());
        add(move);
        setResizable(false);
        setVisible(true);
        }
        void handler() {
            setLocation(getX() + step[0], getY() + step[1]);
        }
}
