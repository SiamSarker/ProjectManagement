package C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboExample {
    ComboExample(String n, int w, int h){
        JFrame f = new JFrame(n);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(w,h);


        FlowLayout x = new FlowLayout(FlowLayout.TRAILING);
        JPanel p = new JPanel(); //default->flowlayout
        p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        p.setLayout(x);
        JLabel l = new JLabel("Menu:");

        JComboBox cb = new JComboBox();
        cb.addItem("");
        cb.addItem("Pizza");
        cb.addItem("Pasta");
        cb.addItem("Burger");

        JTextField show = new JTextField(7);
        show.setBounds(50,140, 50, 50);
        JButton b = new JButton("select");

        JButton b1 = new JButton("temporary");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object x = cb.getSelectedItem();
                String s = x.toString();
                show.setText(s);
            }
        });


//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                Object x = cb.getSelectedItem();
//                String s = x.toString();
//                show.setText(s);
//            }
//        });
        p.add(l); p.add(cb); p.add(b); p.add(show); p.add(b1);
        f.setContentPane(p);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboExample("My ComboBox", 400,200);
    }
}