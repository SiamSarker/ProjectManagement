package Layout;

import javax.swing.*;
import java.awt.*;

class Border1{
    JFrame f;
    Border1(){
        f = new JFrame();
        f.setBounds(100,200,300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("GRID inside BORDER");
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);

        f.add(new GridLayoutExample1(), BorderLayout.CENTER);

        f.setVisible(true);
    }
}

class GridLayoutExample1 extends JPanel{
    GridLayoutExample1(){
        int numberOfRows = 3;
        int numberOfColumns = 3;
        setLayout(new GridLayout(numberOfRows,numberOfColumns));
        for (int i = 1; i <= numberOfColumns*numberOfRows; i++){
            add(new Button(String.valueOf(i)));
        }
    }
}


public class GridInsideBorder {
    public static void main(String[] args) {
        new Border1();
    }
}
