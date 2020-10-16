package Layout;

import javax.swing.*;
import java.awt.*;

public class MyLayout {
    JFrame f;
    MyLayout(){
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setBounds(100,200,300,300);

        JButton[] b = {
                new JButton("1"),
                new JButton("2"),
                new JButton("Test 3"),
                new JButton("4"),
                new JButton("My name is Siam"),
                new JButton("6"),
                new JButton("Last 7"),
                new JButton("Hello There"),
                new JButton("This is ObiWan, The Jedi Knight")
        };
        for(JButton a : b){
            f.add(a);
        }

//        JPanel p = new JPanel();
//        p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//        p.setLayout(new FlowLayout(FlowLayout.LEADING));
//        p.setPreferredSize(new Dimension(150,50));
//
//        p.add(new JLabel("Label 1"));
//        p.add(new JLabel("Label 2"));
//        p.setBorder(BorderFactory.createLineBorder(Color.black));
//        f.add(p);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyLayout();
    }
}
