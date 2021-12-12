package Hello;

import javax.swing.*;
import java.awt.*;

public class Hello {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,300,300);
        Container p = f.getContentPane();
        p.setBackground(Color.cyan);
        JButton b = new JButton("Click Here");
        b.setBackground(Color.red);
        b.setForeground(Color.BLUE);
        b.setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC, 14));
        p.add(b);

        f.setVisible(true);

    }
}
