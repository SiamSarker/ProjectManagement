package C;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoLayout {
    NoLayout(String n, int w, int h) {
        JFrame f = new JFrame(n); //default->BorderLayout
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(w, h);

        JPanel p = new JPanel();
        p.setLayout(null);

        JLabel l = new JLabel("Menu:");
        l.setBounds(10,10, 50, 40);

        JComboBox cb = new JComboBox();
        cb.setBounds(80, 10, 100, 40);
        cb.addItem("");
        cb.addItem("Pizza");
        cb.addItem("Pasta");
        cb.addItem("Burger");

        JTextField show = new JTextField();
        show.setBounds(50,100, 80, 40);
        JButton b = new JButton("select");
        b.setBounds(200,10, 80, 40);

        JButton b1 = new JButton("temporary");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Object x = cb.getSelectedItem();
                String s = x.toString();
                show.setText(s);
            }
        });
        p.add(l); p.add(cb); p.add(b); p.add(show); //p.add(b1);
        f.setContentPane(p);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new NoLayout("My Layout", 400, 200);
    }
}