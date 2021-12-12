import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;



class Main{

    Main(String n, int a, int b){


        JFrame frm = new JFrame("Registration");
        frm.setSize(700, 600);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBackground(Color.lightGray);
        frm.setLayout(null);

        JLabel label1 = new JLabel("User Name:");
        label1.setBounds(20, 65, 120, 30);
        frm.add(label1);
        JTextField text1 = new JTextField();
        text1.setBounds(125, 65, 200, 30);
        text1.setBackground(Color.white);
        frm.add(text1);

        JLabel label2 = new JLabel("User Email:");
        label2.setBounds(20, 130, 120, 30);
        frm.add(label2);
        JTextField text2 = new JTextField();
        text2.setBounds(125, 130, 200, 30);
        text2.setBackground(Color.white);
        frm.add(text2);

        JLabel label3 = new JLabel("User Password:");
        label3.setBounds(20, 185, 120, 30);
        frm.add(label3);
        JPasswordField text3 = new JPasswordField();
        text3.setBounds(125, 185, 200, 30);
        text3.setBackground(Color.white);
        frm.add(text3);

        JButton btn = new JButton("Register");
        btn.setBounds(300, 240, 100, 25);
        frm.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                File file = new File("file.txt");
                try {
                    FileWriter writer = new FileWriter(file, true);
                    text1.write(writer);
                    writer.write(" ");
                    text2.write(writer);
                    writer.write("  ");
                    text3.write(writer);
                    writer.write(" \n ");
                    writer.close();
                    Scanner sc = new Scanner(file);
                    boolean found = false;
                    while (sc.hasNext()) {

                        String a1 = sc.next();
                        String a2 = sc.next();
                        if (a1.equals(text2.getText()) && (a2.equals(text3.getText()))) {
                            found = true;
                            JOptionPane.showMessageDialog(null, "Registration complete");
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(null, "Complete your Registration");

                    }
                    text1.setText(" ");
                    text2.setText("");
                    text3.setText("");
                    sc.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        });


        frm.setVisible(true);
    }

    }


    class Main2{

    Main2(String s, int a, int b){

        JFrame frm2 = new JFrame("log-in");
        frm2.setSize(400,400);
        frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm2.setBackground(Color.lightGray);
        frm2.setLayout(null);

        JLabel label4 = new JLabel("User Email:");
        label4.setBounds(20,130,120,30);
        frm2.add(label4);
        JTextField text4 = new JTextField();
        text4.setBounds(125,130,200,30);
        text4.setBackground(Color.white);
        frm2.add(text4);

        JLabel label5 = new JLabel("User Password:");
        label5.setBounds(20,185,120,30);
        frm2.add(label5);
        JPasswordField text5 = new JPasswordField();
        text5.setBounds(125,185,200,30);
        text5.setBackground(Color.white);
        frm2.add(text5);
        JButton jb2 = new JButton("Log-in");
        jb2.setBounds(280,240,100,25);
        frm2.add(jb2);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    File file = new File("file.txt");
                    Scanner sc = new Scanner(file);
                    boolean found= false;
                    while(sc.hasNext()){
                        String a3 =sc.next();
                        String a4=sc.next();
                        if(a3.equals(text4.getText()) && (a4.equals(text5.getText()))){
                            found=true;
                            JOptionPane.showMessageDialog(null,"Login Successful");
                        }
                    }
                    if(!found){
                        JOptionPane.showMessageDialog(null,"Login UnSuccessful");
                    }
                    text4.setText("");
                    text5.setText("");

                    sc.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        frm2.setVisible(true);
    }



    }



public class Login {

    public static void main(String[] args) {
        Main a = new Main("Registration", 700, 700);
        Main2  b = new Main2("log-in", 400, 400);
    }
}