package InputDialog;

import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog("Enter your first name : ", "Siam");
        String l_name = JOptionPane.showInputDialog("Enter your last name : ");

        String name = f_name+" "+l_name;

        JOptionPane.showMessageDialog(null, "Your full name is "+name);
    }
}
