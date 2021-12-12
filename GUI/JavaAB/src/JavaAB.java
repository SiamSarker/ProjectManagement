import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JavaAB {
    JFrame f;
    JTextField jTextField3;
    JButton jButton1;

    public JavaAB(){
        f = new JFrame("A or B");
        f.setLayout(new FlowLayout());
        f.setSize(300,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        f.add(jTextField3 = new JTextField(10));

        f.add(jButton1 = new JButton("Change"));
        jButton1.addActionListener(new InchAction());


        f.setVisible(true);
    }

    class InchAction implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (jTextField3.getText().equals("A")){
                jTextField3.setText("B");
            }
            else if (jTextField3.getText().equals("B")){
                jTextField3.setText("A");
            }

        }
    }


    public static void main(String[] args) {
        new JavaAB();
    }

}