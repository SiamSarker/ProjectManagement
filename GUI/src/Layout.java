

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {

    Layout(){
        JFrame f;

        f = new JFrame();
        f.setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setTitle("Layout");
    f.setLayout(new FlowLayout());
    
    JButton[] button= {
            new JButton("1"),
            new JButton("2"),
            new JButton("3"),
            new JButton("4"),
            new JButton("5"),
            new JButton("6"),
            new JButton("7"),
            new JButton("8")
    };
      for(JButton b : button){
        f.add(b);
      }   
      
      
    f.setVisible(true);
        
        
    }
    public static void main(String[] args) {
        new Layout();
        
    }
    
    
}
