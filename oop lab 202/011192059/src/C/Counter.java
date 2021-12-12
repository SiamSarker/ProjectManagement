package C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter{
    JTextField tx;
    Counter(String n, int x, int y){
        JFrame f = new JFrame(n);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(x,y);

        JPanel p = new JPanel();
        JLabel l = new JLabel("Counter");
        tx = new JTextField("0",7);
        tx.setEditable(false);

        JButton b = new JButton("Count");
        // ButtonListener ba = new ButtonListener();
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String t = tx.getText();
                int a = Integer.parseInt(t)+1;
                tx.setText(a+"");
            }
        });

        ActionListener object;
        object = new ActionListener(){
            //override abstract methods
            public void actionPerformed(ActionEvent e){
                //tx->set value to 0
                tx.setText("0");
            }
        };

        JButton b1 = new JButton("Reset");
        //b1.addActionListener(object);
        b1.addActionListener(new ActionListener(){
            //override abstract methods
            public void actionPerformed(ActionEvent e){
                //tx->set value to 0
                tx.setText("0");
            }
        });

        p.add(l); p.add(tx); p.add(b); p.add(b1);

        f.setContentPane(p);
        f.setVisible(true);
    }

    /*
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //event handling code
            //read from TextField, convert to int, increment value by 1,
            //convert to String, write to TextField
            String temp= tx.getText();
            int t = Integer.parseInt(temp);
            t++;
            String tmp = t+"";
            tx.setText(tmp);
        }
    }

     */
}