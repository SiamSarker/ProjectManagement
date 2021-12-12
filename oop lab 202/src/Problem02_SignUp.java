//package FinalAssignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;



public class Problem02_SignUp extends JFrame {
    JTextField username;

    JPasswordField password;

    JButton button1, button2;

    Container container1;
    JLabel label1, label2, label3, label4, label5, label6;
    JTextField textField1, textField2;
    JPasswordField passwordField1, passwordField2;

    Problem02_SignUp() {
        setLocation(30, 10);
        setBounds(700, 150, 800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container1 = getContentPane();
        container1.setLayout(null);
        container1.setBackground(Color.white);

        Color color1 = new Color(242, 122, 10);
        Font font_label = new Font("Agency FB", Font.ITALIC, 50);

        Font font_label2 = new Font("Agency FB", Font.PLAIN, 25);
        label1 = new JLabel("Username");
        label1.setLayout(null);
        label1.setBounds(220, 150, 150, 40);
        label1.setForeground(Color.BLACK);
        label1.setFont(font_label2);
        container1.add(label1);

        Font font1 = new Font("Arial", Font.PLAIN, 20);
        Color c = new Color(217, 228, 252);
        textField1 = new JTextField();
        textField1.setLayout(null);
        textField1.setBounds(220, 194, 470, 44);
        textField1.setBackground(c);
        textField1.setFont(font1);
        container1.add(textField1);

        label2 = new JLabel("Email");
        label2.setLayout(null);
        label2.setBounds(220, 260, 150, 40);
        label2.setForeground(Color.BLACK);
        label2.setFont(font_label2);
        container1.add(label2);

        textField2 = new JTextField();
        textField2.setLayout(null);
        textField2.setBounds(220, 304, 470, 44);
        textField2.setBackground(c);
        textField2.setFont(font1);
        container1.add(textField2);

        label3 = new JLabel("Password");
        label3.setLayout(null);
        label3.setBounds(220, 370, 150, 40);
        label3.setForeground(Color.BLACK);
        label3.setFont(font_label2);
        container1.add(label3);

        passwordField1 = new JPasswordField();
        passwordField1.setLayout(null);
        passwordField1.setBounds(220, 414, 470, 44);
        passwordField1.setBackground(c);
        passwordField1.setEchoChar('*');
        passwordField1.setFont(font1);
        container1.add(passwordField1);

        label4 = new JLabel("Confirm Password");
        label4.setLayout(null);
        label4.setBounds(220, 480, 250, 40);
        label4.setForeground(Color.BLACK);
        label4.setFont(font_label2);
        container1.add(label4);

        label5 = new JLabel("Sign Up and Explore");
        label5.setLayout(null);
        label5.setBounds(260, 5, 380, 70);
        label5.setForeground(color1);
        label5.setFont(font_label);
        container1.add(label5);

        Font underline = new Font("Arial", Font.ITALIC, 44);
        label6 = new JLabel("------------------------");
        label6.setLayout(null);
        label6.setBounds(240, 45, 380, 70);
        label6.setForeground(Color.BLACK);
        label6.setFont(underline);
        container1.add(label6);

        passwordField2 = new JPasswordField();
        passwordField2.setLayout(null);
        passwordField2.setBounds(220, 524, 470, 44);
        passwordField2.setBackground(c);
        passwordField2.setEchoChar('*');
        passwordField2.setFont(font1);
        container1.add(passwordField2);

        Font font2 = new Font("Arial", Font.BOLD, 25);
        button1 = new JButton("Register");
        button1.setBackground(color1);
        button1.setFocusPainted(false);
        button1.setForeground(Color.white);
        button1.setFont(font2);
        button1.setBounds(270, 620, 370, 44);
        container1.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (passwordField1.getText().equals(passwordField2.getText())) {
                    try {
                        String email = textField2.getText();
                        String pass = passwordField1.getText();
                        FileWriter fileWriter = new FileWriter("Database/UserInputs.txt", true);
                        BufferedWriter write = new BufferedWriter(fileWriter);
                        PrintWriter writer = new PrintWriter(write);
                        writer.println(email + " " + pass);
                        JOptionPane.showMessageDialog(null, "Successful");
                        Problem02 frame = new Problem02();
                        dispose();
                        frame.setVisible(true);

                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password doesn't match.Try again?");
                    textField1.setText("");
                    textField2.setText("");
                    passwordField1.setText("");
                    passwordField2.setText("");
                }
            }
        });

        setVisible(true);

    }


    static class Problem02 extends JFrame {
        JTextField username;

        JPasswordField password;

        Container container1;

        JButton button1, button2;

        JLabel label1, label2, label3, label4;

        Problem02() {

            setLocation(30, 10);
            setBounds(700, 200, 600, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            container1 = getContentPane();
            container1.setLayout(null);
            container1.setBackground(Color.white);

            //ImageIcon icon = new ImageIcon(getClass().getResource("logo.png"));
            //label1 = new JLabel(icon);
            //label1.setBounds(167, 20, icon.getIconWidth(), icon.getIconHeight());
            //container1.add(label1);

            Font font_label2 = new Font("Agency FB", Font.PLAIN, 29);
            label2 = new JLabel("Email");
            label2.setBounds(30, 250, 100, 40);
            label2.setForeground(Color.BLACK);
            label2.setFont(font_label2);
            container1.add(label2);

            Font font1 = new Font("Arial", Font.PLAIN, 17);
            Color c = new Color(217, 228, 252);
            username = new JTextField();
            username.setBounds(30, 294, 530, 44);
            username.setBackground(c);
            username.setFont(font1);
            container1.add(username);

            label3 = new JLabel("Password");
            label3.setBounds(30, 350, 100, 40);
            label3.setForeground(Color.BLACK);
            label3.setFont(font_label2);
            container1.add(label3);

            password = new JPasswordField();
            password.setBackground(c);
            password.setBounds(30, 393, 530, 44);
            password.setFont(font1);
            password.setEchoChar('*');
            container1.add(password);

            Font font2 = new Font("Arial", Font.BOLD, 25);
            Color color1 = new Color(242, 122, 10);

            button1 = new JButton("LOG IN");
            button1.setBackground(color1);
            button1.setFocusPainted(false);
            button1.setForeground(Color.white);
            button1.setFont(font2);
            button1.setBounds(30, 470, 530, 44);
            container1.add(button1);

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    boolean login = false;

                    try {
                        File file = new File("Database/UserInputs.txt");
                        Scanner scan = new Scanner(file);
                        String file_email;
                        String file_pass;
                        while (scan.hasNext()) {
                            file_email = scan.next();
                            file_pass = scan.next();
                            if (file_email.equals(username.getText()) && (file_pass.equals(password.getText()))) {
                                login = true;
                                break;
                            }
                        }

                        if (login) {
                            JOptionPane.showMessageDialog(null, "Login Successful");
                            label2.nextFocus();
                        } else {
                            JOptionPane.showMessageDialog(null, "Login Unsuccessful.Try Again?");
                            label2.nextFocus();
                        }
                        username.setText("");
                        password.setText("");

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            });

            label4 = new JLabel("Don't have an account?");
            label4.setBounds(150, 520, 437, 100);
            label4.setBackground(Color.white);
            label4.setForeground(Color.gray);
            label4.setFont(font1);
            container1.add(label4);

            button2 = new JButton("SignUp");
            button2.setBounds(310, 550, 130, 40);
            button2.setFont(font2);
            button2.setForeground(color1);
            button2.setBorderPainted(false);
            button2.setFocusPainted(false);
            button2.setContentAreaFilled(false);
            container1.add(button2);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Problem02_SignUp frame = new Problem02_SignUp();
                dispose();
                frame.setVisible(true);
            }
        });


            setVisible(true);
        }


        public static void main(String[] args) {
            Problem02 b = new Problem02();
        }
    }
}

