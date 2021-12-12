import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Tasks: 

1) Use BorderLayout

2) Add price and quantity with each menu item.

3) Add another TextField for “quantity”. When you press the button “select”, it will check whether the quantity entered in the TextField is available for the item selected. If available, then select the item and show the total price of the number of item selected in the previously created TextField named show.


*/



public class ComboExample {
    ComboExample(String n, int w, int h){
        JFrame f = new JFrame(n);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(w,h);
        
        JPanel p = new JPanel();
        JLabel l = new JLabel("Menu:");

        JComboBox cb = new JComboBox();
        cb.addItem("");
        cb.addItem("Pizza");
        cb.addItem("Pasta");
        cb.addItem("Burger");
        //each item should have a price and quantity available associated with it.

        JLabel bill = new JLabel("Bill: ");
        JTextField show = new JTextField(7);
        show.setBounds(50,140, 50, 50);
        JButton b = new JButton("select");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Object x = cb.getSelectedItem();
                String s = x.toString();
                show.setText(s);
            }
        });
        p.add(l); p.add(cb); p.add(b); p.add(bill); p.add(show);
        f.setContentPane(p);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboExample("My ComboBox", 400,200);
    }
}


