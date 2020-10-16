package C;

import javax.swing.*;

public class Main1 extends JFrame{
    Main1(String n, int x, int y){
        //JFrame f = new JFrame(n);
        super(n);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x,y);

        JPanel p = new JPanel();
        JLabel l = new JLabel("Input:");
        JTextField tx = new JTextField(10);
        JButton b = new JButton("Click here");
        p.add(l); p.add(tx); p.add(b);

        setContentPane(p);
        setVisible(true);
    }
}