package MenuBar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleMenuFrame extends JFrame {
    SimpleMenuFrame(){
        super("SimpleBar");
        setBounds(200,100,300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);

        JMenu file = new JMenu("File");
        bar.add(file);

        JMenu edit = new JMenu("Edit");
        bar.add(edit);

        JMenu view = new JMenu("View");
        bar.add(view);

        JMenuItem[] items = {
                file.add(new JMenuItem("New")),
                file.add(new JMenuItem("Open")),
                file.add(new JMenuItem("Open Recent")),
                file.add(new JMenuItem("Close Project"))
        };
        file.addSeparator();
        file.add(new JMenuItem("Setting"));
        file.addSeparator();

        JMenuItem[] items2 = {
                edit.add(new JMenuItem("Cut")),
                edit.add(new JMenuItem("Copy")),
                edit.add(new JMenuItem("Paste")),
                edit.add(new JMenuItem("Delete"))
        };

        JCheckBoxMenuItem fl = new JCheckBoxMenuItem("Full Screen");
        view.add(fl);

        fl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fl.isSelected()) {
                    setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
                else {
                       setBounds(200,100,300,200);
                }
            }
        });


        JMenu sub = new JMenu("Special");
        JMenuItem[] subitem = {
                new JMenuItem("First"),
                new JMenuItem("Second"),
                new JMenuItem("Third")
        };
        for (JMenuItem item : subitem){
            sub.add(item);
        }

        edit.add(sub);


        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleMenuFrame();
    }
}
