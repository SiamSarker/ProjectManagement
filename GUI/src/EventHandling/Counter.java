package EventHandling;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    JFrame f;
    JTextField tf;
    JButton cnt, rst, down;

    public Counter() {
        f = new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setBounds(100, 200, 500, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel("Counter"));
        tf = new JTextField(10);
        f.add(tf);
        tf.setText("0");
        cnt = new JButton("Count");
        f.add(cnt);
        down = new JButton("Down");
        f.add(down);
        rst = new JButton("Reset");
        f.add(rst);




        cnt.addActionListener(new CounterAction1());
        rst.addActionListener(new CounterAction1());
        down.addActionListener(new CounterAction1());
//    {
//            public void actionPerformed(ActionEvent e) {
////            String s = tf.getText();
////            int a = Integer.parseInt(s);
////            a++;
////            s = a + "";
////            tf.setText(s);
//                //There is a short form of above
//                tf.setText(Integer.parseInt(tf.getText())+1+"");
//                System.out.println(e.getActionCommand());
//            }
//        }

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Counter();
    }
    public class CounterAction1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton j = (JButton) e.getSource();
            if (j == cnt && Integer.parseInt(tf.getText()) < 7){
                tf.setText(Integer.parseInt(tf.getText())+1+"");
            }
            else if(j == rst){
                tf.setText("0");
            }
            else if (j == down && Integer.parseInt(tf.getText()) > 0){
                tf.setText(Integer.parseInt(tf.getText())-1+"");
            }
            else tf.setText("0");
            System.out.println(e.getActionCommand());
        }
    }
}
