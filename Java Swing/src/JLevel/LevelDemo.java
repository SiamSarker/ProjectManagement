package JLevel;

import javax.swing.*;
import java.awt.*;

public class LevelDemo extends JFrame {

    private Container c;
    private JLabel userLabel, passLabel;
    private Font f;

    LevelDemo(){
        initComponents();
    }

    public void initComponents()
    {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        f = new Font("Arial", Font.BOLD, 14);

        userLabel = new JLabel();
        userLabel.setText("Enter your username : ");
        userLabel.setBounds(50, 20, 400, 30);
        userLabel.setFont(f);
        userLabel.setForeground(Color.WHITE);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.GRAY);
        userLabel.setToolTipText("Example: Siam Sarker");
        c.add(userLabel);

//        System.out.println(" "+userLabel.getText()+" ");
//        String s = userLabel.getToolTipText();
//        System.out.println(s);

        passLabel = new JLabel("Enter your password : ");
        passLabel.setBounds(50, 60, 400, 30);
        passLabel.setFont(f);
        passLabel.setForeground(Color.WHITE);
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.GRAY);
        passLabel.setToolTipText("Example: 2464@#&#64");
        c.add(passLabel);

    }


    public static void main(String[] args) {

        LevelDemo frame = new LevelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);

        frame.setTitle("JLevel Demo");

    }
}
