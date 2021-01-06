package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Controller {

    @FXML
    private TextField q1, q2, q3, q4, q5, q6, tf1, tf2, tf3, tf4;

    @FXML
    private Label showLabel;


    public void button1Clicked(ActionEvent actionEvent) {

        ArrayList<Double> quiz = new ArrayList<Double>();
        quiz.add(Double.parseDouble(q1.getText()));
        quiz.add(Double.parseDouble(q2.getText()));
        quiz.add(Double.parseDouble(q3.getText()));
        quiz.add(Double.parseDouble(q4.getText()));
        quiz.add(Double.parseDouble(q5.getText()));
        quiz.add(Double.parseDouble(q6.getText()));

        Collections.sort(quiz, Collections.reverseOrder());

        double quizTotal = 0;
        for (int i = 0; i<3; i++)
            quizTotal += quiz.get(i);
        showLabel.setText("Quiz: "+String.format("%.2f", quizTotal/3)+"");

        double totalMark = 0;
        totalMark += (quizTotal/3) * 2;
        totalMark += Double.parseDouble(tf1.getText());
        totalMark += Double.parseDouble(tf2.getText());
        totalMark += Double.parseDouble(tf3.getText());
        totalMark += Double.parseDouble(tf4.getText());

        showLabel.setText(showLabel.getText()+"\nTotal: "+String.format("%.2f", totalMark)+"");

        if (totalMark >= 90)
            showLabel.setText(showLabel.getText()+"\nGrade : 4.00 (A)");
        else if(totalMark >= 86)
            showLabel.setText(showLabel.getText()+"\nGrade : 3.67 (A-)");
        else if(totalMark >= 82)
            showLabel.setText(showLabel.getText()+"\nGrade : 3.33 (B+)");
        else if(totalMark >= 78)
            showLabel.setText(showLabel.getText()+"\nGrade : 3.00 (B)");
        else if(totalMark >= 74)
            showLabel.setText(showLabel.getText()+"\nGrade : 2.67 (B-)");
        else if(totalMark >= 70)
            showLabel.setText(showLabel.getText()+"\nGrade : 2.33 (C+)");
        else if(totalMark >= 66)
            showLabel.setText(showLabel.getText()+"\nGrade : 2.00 (C)");
        else if(totalMark >= 62)
            showLabel.setText(showLabel.getText()+"\nGrade : 1.67 (C-)");
        else if(totalMark >= 58)
            showLabel.setText(showLabel.getText()+"\nGrade : 1.33 (D)");
        else if(totalMark >= 55)
            showLabel.setText(showLabel.getText()+"\nGrade : 1.00 (D-)");
        else
            showLabel.setText(showLabel.getText()+"\nGrade : 0.00 (F)");


    }
}
