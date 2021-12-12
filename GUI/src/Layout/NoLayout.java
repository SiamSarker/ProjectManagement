package Layout;

import javax.swing.*;

public class NoLayout {
    NoLayout(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 200, 300, 300);
        JPanel p = new JPanel();
        p.setLayout(null);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("Test 2");
        JButton b3 = new JButton("3");
        b1.setBounds(10,10,80,40);
        b2.setBounds(85,45,130,40);
        b3.setBounds(212,80,80,40);
        p.add(b1);
        p.add(b2);
        p.add(b3);

        f.add(p);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new NoLayout();
    }
}
