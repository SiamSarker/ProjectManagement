package Jframe;

import javax.swing.*;
import java.awt.*;

public class FrameDemo extends JFrame{     // use extend JFrame then do object with FrameDemo

    private ImageIcon icon;
//    private Container c;

    FrameDemo(){
        initComponents();
        
    }
    
    public void initComponents()
    {
//        c = this.getContentPane();
       // c.getBackground(getColorModel().getBlue(56,45,73));


        icon = new ImageIcon(getClass().getResource("icon.png"));
         this.setIconImage(icon.getImage());

    }




    public static void main(String[] args) {

        FrameDemo frame = new FrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame.setSize(400, 300);
//        frame.setLocationRelativeTo(null);
//        frame.setLocation(200, 50);

        frame.setBounds(200, 50, 400, 300);

        frame.setTitle("Hi, This is my first test");

        frame.setResizable(false);
    }
}
