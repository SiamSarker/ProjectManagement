package FinalAssignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;


public class Problem01 extends JFrame {
    private Container container;
    private JPanel panel1,panel2;
    private JTextField textField1,textField2,textField3,textField4;
    private JLabel insert,name,phone,email,address,search;
    private JButton insert_button,reset_button;
    private JComboBox comboBox;
    private JTextArea area,textArea;
    Problem01(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        container=this.getContentPane();
        container.setBackground(Color.LIGHT_GRAY);

        insert=new JLabel("Insert");
        insert.setFont(new Font("Agency FB",Font.BOLD,30));
        insert.setBounds(210,20,200,50);
        insert.setForeground(Color.BLACK);
        container.add(insert);

        Color color = new Color(242,122,10);
        panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(color);
        panel1.setBounds(50,70,450,300);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

        Font font_label=new Font("Agency FB",Font.PLAIN,20);
        name=new JLabel("Name");
        name.setLayout(null);
        name.setBounds(20,20,100,25);
        name.setFont(font_label);
        panel1.add(name);

        textField1=new JTextField();
        textField1.setLayout(null);
        textField1.setBackground(new Color(217,228,252));
        textField1.setBounds(120,20,300,33);
        panel1.add(textField1);

        phone=new JLabel("Phone no.");
        phone.setLayout(null);
        phone.setBounds(20,70,100,25);
        phone.setFont(font_label);
        panel1.add(phone);

        textField2=new JTextField();
        textField2.setLayout(null);
        textField2.setBackground(new Color(217,228,252));
        textField2.setBounds(120,70,300,33);
        panel1.add(textField2);

        email=new JLabel("Email");
        email.setLayout(null);
        email.setBounds(20,120,100,25);
        email.setFont(font_label);
        panel1.add(email);

        textField3=new JTextField();
        textField3.setLayout(null);
        textField3.setBackground(new Color(217,228,252));
        textField3.setBounds(120,120,300,33);
        panel1.add(textField3);

        address=new JLabel("Address");
        address.setLayout(null);
        address.setBounds(20,170,100,25);
        address.setFont(font_label);
        panel1.add(address);

        textField4=new JTextField();
        textField4.setLayout(null);
        textField4.setBackground(new Color(217,228,252));
        textField4.setBounds(120,170,300,33);
        panel1.add(textField4);

        insert_button=new JButton("Insert");
        insert_button.setBounds(120,230,80,30);
        insert_button.setFocusPainted(false);
        panel1.add(insert_button);

        insert_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    String name = textField1.getText();
                    String num = textField2.getText();
                    String mail = textField3.getText();
                    String address= textField4.getText();

                    FileWriter file = new FileWriter("Database/DataTable.txt",true);
                    BufferedWriter writer = new BufferedWriter(file);
                    PrintWriter writer1 = new PrintWriter(writer);

                    writer1.println(name+"__"+num+"__"+mail+"__ "+address);
                    writer1.close();

                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");

                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        reset_button=new JButton("Reset");
        reset_button.setBounds(210,230,80,30);
        reset_button.setFocusPainted(false);
        panel1.add(reset_button);
        container.add(panel1);

        reset_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
            }
        });

        search=new JLabel("Search");
        search.setBounds(210,340,200,150);
        search.setFont(new Font("Agency FB",Font.BOLD,30));
        search.setForeground(Color.BLACK);
        container.add(search);

        panel2=new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(color);
        panel2.setBounds(50,440,450,300);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

        JLabel label_search = new JLabel("Field");
        label_search.setLayout(null);
        label_search.setBounds(30,60,100,100);
        label_search.setFont(font_label);
        panel2.add(label_search);

        String[] elements ={"Name","Phone number","Email"};
        comboBox=new JComboBox(elements);
        comboBox.setBounds(80,90,340,35);
        panel2.add(comboBox);

        JTextField search_field = new JTextField();
        search_field.setBounds(80,140,340,35);
        search_field.setBackground(new Color(217,228,252));
        panel2.add(search_field);

        JButton button_search = new JButton("Search");
        button_search.setBounds(190,190,100,35);
        button_search.setFocusPainted(false);
        panel2.add(button_search);
        container.add(panel2);

        JLabel label_area1 = new JLabel("AddressBook");
        label_area1.setBounds(780,50,200,40);
        label_area1.setFont(new Font("Agency FB",Font.BOLD,34));
        container.add(label_area1);

        JLabel label_search1 = new JLabel("Search Window");
        label_search1.setFont(new Font("Agency FB",Font.BOLD,34));
        label_search1.setBounds(1480,50,200,40);
        container.add(label_search1);

        area=new JTextArea();
        area.setEditable(false);
        area.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        area.setBackground(new Color(217,228,252));
        area.setFont(new Font("Agency FB",Font.PLAIN,30));
        container.add(area);
        JScrollPane scrollPane=new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(600,100,600,650);
        container.add(scrollPane);

        textArea=new JTextArea();
        textArea.setEditable(false);
        textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        textArea.setFont(new Font("Agency FB",Font.PLAIN,30));
        textArea.setBackground(new Color(217,228,252));
        textArea.setBounds(1300,100,600,550);
        container.add(textArea);
        button_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText(" ");
                    try{
                        String input=search_field.getText();
                        Scanner scan = new Scanner(new File("Database/DataTable.txt"));
                        while (scan.hasNext()) {
                            String line = scan.nextLine();
                            if (line.contains(input)) {
                                textArea.append(line + "\n");
                            }
                        }
                        search_field.setText("");


                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                }
        });

        JButton button = new JButton("View");
        button.setBounds(620,760,130,40);
        button.setFocusPainted(false);
        container.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    FileReader reader = new FileReader("Database/DataTable.txt");
                    BufferedReader reader1 = new BufferedReader(reader);
                    area.read(reader1,"area");

                }catch (IOException e){

                }
            }
        });

        JButton refresh = new JButton("Refresh");
        refresh.setBounds(820,760,130,40);
        refresh.setFocusPainted(false);
        container.add(refresh);

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    FileReader reader = new FileReader("Database/DataTable.txt");
                    BufferedReader reader1 = new BufferedReader(reader);
                    area.read(reader1,"area");

                }catch (IOException e){

                }
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new Problem01();
    }
}
