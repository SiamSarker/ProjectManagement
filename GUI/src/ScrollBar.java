import javax.swing.*;
import java.awt.*;

public class ScrollBar{
    public static void main(String[] args) {
        JFrame f = new JFrame("Test ScrollBar");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,300,300);
        f.setLayout(null);
        JLabel nm = new JLabel("Name");
        JTextField nmtf = new JTextField(20);
        JLabel gen = new JLabel("Gender");
        JCheckBox ml = new JCheckBox("Male");
        JCheckBox fml = new JCheckBox("Female");
        JLabel note = new JLabel("Note");
        JTextArea nt = new JTextArea(5,10);
        JButton submit = new JButton("Create");
        JScrollPane jsp = new JScrollPane(nt, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);



        f.setVisible(true);
    }

}
