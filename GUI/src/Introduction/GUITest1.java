package Introduction;

import javax.swing.*;

public class GUITest1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,150);

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Lebel 1");
        JTextField jTextField1 = new JTextField("JTextField 1");

        panel1.add(label1);
        panel1.add(jTextField1);

        JPanel panel2 = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);

        JPanel panel = new JPanel();
        panel.add(panel1);
        panel.add(panel2);

        frame.add(panel);

        frame.setVisible(true);
    }
}
