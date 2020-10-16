package C;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CarShowRoom extends JFrame{
    CarShowRoom(int n,int m){
        setSize(n,m);
        JPanel panel=new JPanel(new FlowLayout());
        JComboBox combobox=new JComboBox();
        combobox.addItem(" ");
        combobox.addItem("Audi");
        combobox.addItem("BMW");
        combobox.addItem("Mazda");
        combobox.addItem("Nissan");
        combobox.addItem("Ferrari");
        JButton button1=new JButton("Show");
        JButton button2=new JButton("Book");
        JTextArea ta1=new JTextArea(15,30);
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Object x=combobox.getSelectedItem();
                String s1=x.toString();
                String g=ta1.getText();
                if(s1=="Audi")
                    ta1.setText(g+"\n"+"There are 11 Cars available."+"\n"+"The price is $40,900."+"\n"+"The colors available are Red,White,Blue."+"\n"+"Some unique features-luxurious interiors,Quattro all-wheel-drive system");
                if(s1=="BMW")
                    ta1.setText(g+"\n"+"There are 17 Cars available."+"\n"+"The price is $50,500."+"\n"+"The colors available are Black,White,Yellow."+"\n"+"Some unique features-cool driver-assistance technology,grin-inducing MINI brand");
                if(s1=="Mazda")
                    ta1.setText(g+"\n"+"There are 22 Cars available."+"\n"+"The price is $30,999."+"\n"+"The colors available are Green,Red,Black."+"\n"+"Some unique features-lightweight,excellent handling");
                 if(s1=="Nissan")
                    ta1.setText(g+"\n"+"There are 30 Cars available."+"\n"+"The price is $25,900."+"\n"+"The colors available are Red,White,Blue,Orange."+"\n"+"Some unique features-360-degree surround view camera system,Anti-Lock Braking System");
                 if(s1=="Ferrari")
                    ta1.setText(g+"\n"+"There are 7 Cars available."+"\n"+"The price is $43,900."+"\n"+"The colors available are Black,White."+"\n"+"Some unique features-produces less carbon dioxide,sports car");              
            }
        });
        JTextArea ta2=new JTextArea();
        ta2.setVisible(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Object a=combobox.getSelectedItem();
                String s2=a.toString();
                ta2.setVisible(true);
                if(s2=="Audi")
                    ta2.setText("Total amount due:$40,900");
                if(s2=="BMW")
                    ta2.setText("Total amount due:$50,500");               
                if(s2=="Mazda")
                    ta2.setText("Total amount due:$30,999");                
                 if(s2=="Nissan")
                    ta2.setText("Total amount due:$25,900");
                 if(s2=="Ferrari")
                    ta2.setText("Total amount due:$43,900");                 
            }
        });
        panel.add(combobox);panel.add(button1);panel.add(button2);panel.add(ta1);panel.add(ta2);
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CarShowRoom(500,500);
    }
}
