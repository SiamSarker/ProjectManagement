package C;

import java.awt.*;
import javax.swing.*;

public class GirdExample {
    GirdExample(String n, int w, int h) {
        JFrame f = new JFrame(n); //default->BorderLayout
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(w, h);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,3));

        for(int i =0; i<4;i++){
            for(int j=0;j<3;j++){
                p.add(new JButton("count"+(i+j+1)));
            }
        }

        p.add(new JTextField(3));

        f.setContentPane(p);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GirdExample("My Grid", 400,200);
    }
}