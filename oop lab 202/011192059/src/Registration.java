import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class Registration{
    Registration(){

        JFrame freg = new JFrame("Registration");
        freg.setSize(300,500);
        freg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p;
        JLabel label1, label2, label3;
        JTextField tf1, tf2, tf3;
        JButton button1;

        p = new JPanel();

        label1 = new JLabel("Name:");
        tf1 = new JTextField(24);
        label2 = new JLabel("Email:");
        tf2 = new JTextField(23);
        label3 = new JLabel("Password:");
        tf3 = new JTextField(23);
        button1 = new JButton("Register");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {



                String name = tf1.getText();
                String email = tf2.getText();
                String password = tf3.getText();

                String text = email + " "+ password +" "+ name;

                try{
                    BufferedWriter bw = new BufferedWriter(new FileWriter("Data2.txt", true));
                    bw.append(text+"\n");

                    bw.close();

                }
                catch(Exception e){

                }

                tf1.setText(null);
                tf2.setText(null);
                tf3.setText(null);

            }
        });

        p.add(label1);p.add(tf1);
        p.add(label2);p.add(tf2);
        p.add(label3);p.add(tf3);
        p.add(button1);

        freg.setContentPane(p);
        freg.setVisible(true);
}
}


class Login{

    Login(){

        JFrame flog = new JFrame("Login");
        flog.setSize(400,400);
        flog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p;
        JLabel label4, label5;
        JTextField tf4, tf5, tf6;

        JButton button2, button3;

        p = new JPanel();
        label4 = new JLabel("Email:");
        tf4 = new JTextField(26);
        label5 = new JLabel("Password:");
        tf5 = new JTextField(27);
        button2 = new JButton("Log in");
        button3 = new JButton("New Registration");
        tf6 = new JTextField(27);
        button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String email = tf4.getText();
            String password = tf5.getText();
            try{
                BufferedReader br = new BufferedReader(new FileReader("Data2.txt"));
                String line;
                int flag = 0;
                tf6.setText(null);
                while((line = br.readLine()) != null){
                    String[] splits = line.split(" ");
                    if(email.equals(splits[0]) && password.equals(splits[1])){
                        tf6.setText("Login Successful");
                        flag++;
                        break;
                    }
                    if(flag == 0)
                        tf6.setText("Login Unsuccessful");

                }

            }
            catch(IOException e){

            }


        }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Registration();
                } catch (Exception e1){

                }
            }
        });

        p.add(label4);p.add(tf4);p.add(label5);p.add(tf5);
        p.add(button2);p.add(button3);
        p.add(tf6);
        flog.setContentPane(p);
        flog.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }


    }


