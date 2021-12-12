package JLevel;

import javax.swing.*;
import java.awt.*;

public class TextFieldDemo extends JFrame {

    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    TextFieldDemo(){
        initComponents();
    }

    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 16);

        tf1 = new JTextField("Siam");;
        tf1.setBounds(30,30,200,40);
        tf1.setFont(f);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setText("Sarker");
        tf2.setBounds(30, 70, 200, 40);
        tf2.setFont(f);
        c.add(tf2);

    }



    public static void main(String[] args) {

        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Text File Demo");

    }
}
