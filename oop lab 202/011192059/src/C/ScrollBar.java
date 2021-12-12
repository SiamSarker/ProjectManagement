package C;

import javax.swing.*;

public class ScrollBar{
    public static void main(String[] args) {
        JFrame f = new JFrame("Test ScrollBar");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,300,300);
        f.setLayout(null);
        /*JLabel nm = new JLabel("Name");
        JTextField nmtf = new JTextField(20);
        JLabel gen = new JLabel("Gender");
        JCheckBox ml = new JCheckBox("Male");
        JCheckBox fml = new JCheckBox("Female");
        JLabel note = new JLabel("Note");
        JTextArea nt = new JTextArea(5,10);
        JButton submit = new JButton("Create");
        */
        JPanel p = new JPanel();
        //JTextArea nt = new JTextArea(5,10);
        //nt.setText("vhbufdvh \nvdofuvfdfb vfhoufbhvbvbviohvdbvThe last line\n says that the vertical scrollbar will always be there. There is a similar com\nmand for horizontal. Otherwise, the scrollbar will only show up when it is needed (or never, if you use _SCROLLBAR_NEVER)\n. I guess it's your call which w\nay you want to use it.\nThe last line says that the vertical scrollbar will always be there. There is a similar command for horizontal. O\nherwise, the scrollbar will only show up when it is needed (or never, if \nyou use _SCROLLBAR_NEVER). I guess it's your call which way you want to use it.\nThe last line says that the vertical scrollbar will\n always be there. There is a similar command for horizontal. Otherwise, the scrollbar will only show up when it is needed (or never, if you use _SCROLLBAR_NEVER). I guess it's your call which way you want to use it.");
        //JScrollPane jsp = new JScrollPane(nt, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        //JScrollPane scrollPane = new JScrollPane(nt);
        //scrollPane.setBounds(10,60,780,500);
        //scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        JTextArea ta = new JTextArea();
//        JScrollPane sp = new JScrollPane(ta);
        ta.setText("vhbufdvh \nvdofuvfdfb vfhoufbhvbvbviohvdbvThe last line\n says that the vertical scrollbar will always be there. There is a similar com\nmand for horizontal. Otherwise, the scrollbar will only show up when it is needed (or never, if you use _SCROLLBAR_NEVER)\n. I guess it's your call which w\nay you want to use it.\nThe last line says that the vertical scrollbar will always be there. There is a similar command for horizontal. O\nherwise, the scrollbar will only show up when it is needed (or never, if \nyou use _SCROLLBAR_NEVER). I guess it's your call which way you want to use it.\nThe last line says that the vertical scrollbar will\n always be there. There is a similar command for horizontal. Otherwise, the scrollbar will only show up when it is needed (or never, if you use _SCROLLBAR_NEVER). I guess it's your call which way you want to use it.");
//        //p.add(nt);
//
//        ta=new JTextArea();
//        ta.setBounds(5,5,100,200);

        JScrollPane scrolltxt=new JScrollPane(ta);
        scrolltxt.setBounds(3,3,300,100);

        f.add(scrolltxt);


//        p.add(ta);
//        f.getContentPane().add(sp);
//        f.setContentPane(p);




        f.setVisible(true);
    }

}