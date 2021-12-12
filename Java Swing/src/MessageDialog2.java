import javax.swing.*;

public class MessageDialog2 {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("icon.png");

        JOptionPane.showMessageDialog(null,"Enter Correct Password","This is a title", 0, icon);
    }
}
