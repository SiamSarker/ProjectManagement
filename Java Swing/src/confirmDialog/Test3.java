package confirmDialog;

import javax.swing.*;

public class Test3 {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit this program?", "Quit", JOptionPane.YES_NO_OPTION);

        if(choice == JOptionPane.YES_OPTION)
        {
            System.exit(0);

        }
        else {
            JOptionPane.showMessageDialog(null, "You're still in the program");
            System.out.println("You have no option");
        }

    }
}
