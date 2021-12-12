package JLevel;

import javax.swing.*;
import java.awt.*;

public class LebelDemo extends JFrame {
//
//    private Container c;
//    private JLabel imgLabel;
//    private ImageIcon icon;


    JPanel c = new JPanel();
    JLabel imgLabel = new JLabel();
//
//    LebelDemo(){
//        initComponents();
//    }

    public LebelDemo(){

//        c = this.getContentPane();
//        c.setLayout(null);
//        c.setBackground(Color.BLACK);

//        icon = new ImageIcon(getClass().getResource("JLevel/ID.jpeg"));

//        imgLabel = new JLabel();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 50, 400, 500);

        setTitle("LebelDemo Test");

        imgLabel.setIcon(new ImageIcon("JLevel/ID.jpeg"));
//        imgLabel.setBounds(200,100,50,100);
        c.add(imgLabel);
        add(c);
        validate();
        
    }


    public static void main(String[] args) {
        LebelDemo frame = new LebelDemo();

    }
}
