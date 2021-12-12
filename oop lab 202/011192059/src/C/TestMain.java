package C;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1. create a container ->JFrame
//2. create a secondary container->JPanel
//3. Create GUI components (add listeners and event handling code to components)
//4. add components to the secondary container
//5. add secondary container to the top-level container

class Main{
    JTextField tx;
    JButton b;
    Main(String n, int x, int y){
        JFrame f = new JFrame(n);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(x,y);

        JPanel p = new JPanel();
        JLabel l = new JLabel("Input:");
        tx = new JTextField("10",10);
        //tx.setEditable(false);

        b = new JButton("Count");
        ButtonListener ba = new ButtonListener();
        b.addActionListener(ba);

        JButton b1 = new JButton("Reset");
        b1.addActionListener(ba);
        p.add(l); p.add(tx); p.add(b); p.add(b1);

        f.setContentPane(p);
        f.setVisible(true);
    }

    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) { //button click
            //event handling code
            //read from TextField, convert to int, increment value by 1,
            //convert to String, write to TextField

            if(e.getSource()==b) {
                String temp = tx.getText();
                int t = Integer.parseInt(temp);
                t++;
                String tmp = t + "";
                tx.setText(tmp);
            }
            else tx.setText("0");
        }
    }
}

public class TestMain {
    public static void main(String[] args) {
        // Counter c = new Counter("My Counter", 200, 200);
        Main a = new Main("My Frame", 400, 200);
        // Main1 b = new Main1("My App", 200,200);
    }
}