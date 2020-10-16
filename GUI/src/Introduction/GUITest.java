package Introduction;

import javax.swing.*;
import java.awt.*;

public class GUITest {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("My Title");
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setSize(300,100);

        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);

        JButton button = new JButton("My Button");
        button.setBackground(Color.orange);
        button.setForeground(Color.RED);

        panel.add(button);

        frame1.add(panel);

        frame1.setVisible(true);
    }
}
