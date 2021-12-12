package Introduction;

import javax.swing.*;

public class GUITest3 extends JFrame {
    GUITest3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,150);

        JPanel panel = new JPanel();
        panel.add(new JButton("My Button"));

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        GUITest3 test1 = new GUITest3();
    }
}

