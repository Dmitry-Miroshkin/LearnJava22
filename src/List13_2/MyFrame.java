package List13_2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame {
    public MyFrame(String text, int x, int y) throws IOException {
        JFrame frame = new JFrame("окно с меткой и пиктограммой");
        frame.setBounds(x, y, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BufferedImage image = ImageIO.read(new File("res/red-shield-icon-access-denied-protection-and-vector-19164654.jpg"));
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        img.getGraphics().drawImage(image, 0, 0, 100, 100, null);

        ImageIcon icon = new ImageIcon(img);

        JLabel label = new JLabel(text, icon, JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
