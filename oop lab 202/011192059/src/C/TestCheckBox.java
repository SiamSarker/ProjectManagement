package C;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Check{
    Check(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,200);

        JPanel p = new JPanel();
        JCheckBox c = new JCheckBox("Checkbox");

        JButton b = new JButton("check");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (c.isSelected()){
                    c.setSelected(false);
                    b.setText("check");
                }
                else {
                    c.setSelected(true);
                    b.setText("uncheck");
                }
            }
        });


        /*b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(c.isSelected()){
                    c.setSelected(false);
                    b.setText("check");
                }
                else{
                    c.setSelected(true);
                    b.setText("uncheck");
                }
            }
        });*/

        p.add(c); p.add(b);
        f.setContentPane(p);
        f.setVisible(true);
    }
}
public class TestCheckBox {
    public static void main(String[] args) {
        new Check();
    }
}