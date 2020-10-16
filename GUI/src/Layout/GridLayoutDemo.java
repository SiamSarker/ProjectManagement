package Layout;

import javax.swing.*;
import java.awt.*;

class GridLayoutExample2 extends JPanel{
    public GridLayoutExample2(){
        int numberOfRows = 4;
        int numberOfColums = 3;
        setLayout(new GridLayout(numberOfRows, numberOfColums));
        for(int i = 1; i <= numberOfColums*numberOfRows; i++)
            add(new JButton(String.valueOf(i)));

    }
}

public class GridLayoutDemo extends JFrame {
    GridLayoutDemo(){
        super("Grid Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,200,300,300);
        setContentPane(new GridLayoutExample2());
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
