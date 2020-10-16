package C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Border {
    Border(String n, int w, int h) {
        JFrame f = new JFrame(n); //default->BorderLayout
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(w, h);

        BorderLayout x = new BorderLayout();
        JPanel p = new JPanel(); //default->flowlayout
        p.setLayout(x);
        JLabel l = new JLabel("Menu:");

        JComboBox cb = new JComboBox();
        cb.addItem("");
        cb.addItem("Pizza");
        cb.addItem("Pasta");
        cb.addItem("Burger");

        JTextField show = new JTextField(7);
        show.setBounds(50, 140, 50, 50);
        JButton b = new JButton("select");

        JPanel p1 = new JPanel();
        p1.add(b);

        JButton b1 = new JButton("temporary");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Object x = cb.getSelectedItem();
                String s = x.toString();
                show.setText(s);
            }
        });
        p.add(l,BorderLayout.NORTH);
        p.add(cb, BorderLayout.CENTER);
        p.add(p1, BorderLayout.EAST);
        p.add(show, BorderLayout.SOUTH);
        p.add(b1, BorderLayout.WEST);
        JButton b2 = new JButton("click");
        p1.add(b2);
        f.setContentPane(p);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Border("BorderLayout", 400,200);
    }
}