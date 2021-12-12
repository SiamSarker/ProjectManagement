package MenuBar;

import javax.swing.*;
import java.lang.reflect.Method;

public class MenuFrame extends JFrame {
    MenuFrame()
    {
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create menu bar and add it to frame
        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);

        // create the menu items add to the menubar
        JMenu file = new JMenu("File");
        Action action;
        JMenuItem item1 = file.add(new JMenuItem("New..."));
        JMenuItem item2 = file.add(new JMenuItem("Open..."));
        JMenuItem item3 = file.add(new JMenuItem("Close"));
        file.addSeparator();
        JMenuItem item5 = file.add(new JMenuItem("Quit..."));
        mbar.add(file);


        JMenu edit = new JMenu("Edit");
        JMenuItem item6 = edit.add(new JMenuItem("Cut"));
        JMenuItem item7 = edit.add(new JMenuItem("Copy"));
        JMenuItem item8 = edit.add(new JMenuItem("Paste"));
        edit.addSeparator();
        // these are checkable menu items
        JCheckBoxMenuItem debug = new JCheckBoxMenuItem("Debug");
        edit.add(debug);
        JCheckBoxMenuItem test = new JCheckBoxMenuItem("Testing");
        edit.add(test);
        mbar.add(edit);

        setVisible(true);

    }

    public static void main(String[] args) {
        MenuFrame frame = new MenuFrame();
    }
}
