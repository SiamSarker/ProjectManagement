import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class AddressBook{
    AddressBook(){
        JFrame fadd = new JFrame("Address Book");
        fadd.setSize(500,300);
        fadd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p;
        JLabel label1, label2, label3, label4, label5;
        JTextField tf1, tf2, tf3, tf4, tf5;
        JTextArea ta1, ta2;
        JButton button1, button2, button3;

        p=new JPanel();


        label1 = new JLabel("Name:");
        tf1 = new JTextField(20);
        label2 = new JLabel("Phone no:");
        tf2 = new JTextField(15);
        label3 = new JLabel("Email:");
        tf3 = new JTextField(20);
        label4 = new JLabel("Address:");
        tf4 = new JTextField(15);

        button1 = new JButton("Save");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = tf1.getText();
                String phone = tf2.getText();
                String email = tf3.getText();
                String address = tf4.getText();

                String text = name + " "+ phone +" "+ email +" "+ address;

                try{
                    BufferedWriter bw = new BufferedWriter(new FileWriter("Data.txt", true));
                    bw.append(text+"\n");

                    bw.close();

                }
                catch(IOException e){

                }

                tf1.setText(null);
                tf2.setText(null);
                tf3.setText(null);
                tf4.setText(null);
            }
        });

        ta1 = new JTextArea(10,10);

        button2 = new JButton("Show All");

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    BufferedReader br = new BufferedReader(new FileReader("Data.txt"));
                    String line;
                    while((line = br.readLine()) != null){
                        String prevText = ta1.getText();
                        if(prevText.length() > 0)
                            line = prevText+"\n"+line;
                        ta1.setText(line);

                    }

                }
                catch(IOException e){

                }
                }
            });


        tf5 = new JTextField(10);
        button3 = new JButton("Search");
        ta2 = new JTextArea(10,10);

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String find = tf5.getText();
                try{
                    BufferedReader br = new BufferedReader(new FileReader("Data.txt"));
                    String line;
                    ta2.setText(null);
                    while((line = br.readLine()) != null){
                        String[] splits = line.split(" ");
                        if(find.equals(splits[0])){
                            String prevText = ta2.getText();
                            if(prevText.length() > 0)
                                line = prevText+"\n"+line;
                            ta2.setText(line);
                        }


                    }

                }
                catch(IOException e){

                }
            }
        });

        p.add(label1);p.add(tf1);p.add(label2);p.add(tf2);p.add(label3);p.add(tf3);p.add(label4);p.add(tf4);
        p.add(button1);p.add(button2);
        p.add(tf5);
        p.add(button3);
        p.add(ta1);p.add(ta2);
        fadd.setContentPane(p);
        fadd.setVisible(true);
    }
    public static void main(String[] args){
        new AddressBook();
    }
}
