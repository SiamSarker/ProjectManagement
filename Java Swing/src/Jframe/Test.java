package Jframe;

import javax.swing.*;

public class Test extends JFrame {

    Test(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50,100, 400, 500);
        setTitle("This is title");
    }

    public static void main(String[] args) {

        Test fram = new Test();
        fram.setVisible(true);

    }
}
