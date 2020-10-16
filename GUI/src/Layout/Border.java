package Layout;

import javax.swing.*;
import java.awt.*;

public class Border {
    JFrame f;
    Border(){
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,200,300,300);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p1.add(new JButton("NORTH"));
        p2.add(new JButton("SOUTH"));
        p3.add(new JButton("EAST"));
        p4.add(new JButton("WEST"));
        p5.add(new JButton("CENTER"));

        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        p3.setBorder(BorderFactory.createLineBorder(Color.black));
        p4.setBorder(BorderFactory.createLineBorder(Color.black));
        p5.setBorder(BorderFactory.createLineBorder(Color.black));

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);
        f.add(p3, BorderLayout.EAST);
        f.add(p4, BorderLayout.WEST);
        f.add(p5, BorderLayout.CENTER);


        f.setVisible(true);

    }


    public static void main(String[] args) {
        new Border();
    }
}
