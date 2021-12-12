package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.sound.sampled.Line;
import java.io.*;
import java.time.chrono.MinguoChronology;
import java.util.ArrayList;

public class Controller {
    @FXML
    private TextField Name, ID, CGPA;

    @FXML
    private TextArea ta1, ta2;


    public void button1Click(ActionEvent actionEvent) throws IOException {
        String name = Name.getText();
        String id = ID.getText();
        String cgpa = CGPA.getText();
        FileWriter fw = new FileWriter("StudentData.txt", true);
        BufferedWriter writer = new BufferedWriter(fw);
        String Line = cgpa+" " +id+ " "+name;
        writer.write(Line+ "");
        writer.newLine();
        FileReader fr = new FileReader("StudentData.txt");
        BufferedReader reader = new BufferedReader(fr);
        writer.close();
    }


    public void button2Click(ActionEvent actionEvent) throws IOException {

        //Controller [] student = new Controller[30];
        FileReader fr = new FileReader("StudentData.txt");
        BufferedReader reader = new BufferedReader(fr);

        String maxCg = null;
        String minCg = null;

        double maxcg = 0;
        double mincg = 10;


        String line;

        while ((line = reader.readLine()) != null) {

            String[] splits = line.split(" ");

            if (ta1 == null)
            {
                ta1.setText(splits[2]+" "+splits[1]+" "+splits[0]);
            }
            else ta1.setText(ta1.getText()+"\n"+splits[2]+" "+splits[1]+" "+splits[0]);;


            if (Double.parseDouble(splits[0]) > maxcg) {
                maxCg = splits[2]+" "+splits[1]+" "+splits[0];
                maxcg = Double.parseDouble(splits[0]);
            }
            if (Double.parseDouble(splits[0]) < mincg) {
                minCg = splits[2]+" "+splits[1]+" "+splits[0];
                mincg = Double.parseDouble(splits[0]);
            }

        }

       ta2.setText("Highest CGPA:  "+maxCg+"\n"+"Lowest CGPA:  "+ minCg);

        reader.close();

    }


}
