package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;

public class Controller {


    @FXML
    TextField name;
    
    @FXML
    TextField password;

    @FXML
    Label label;


    BufferedReader reader;

    BufferedWriter writer;

    public Controller() throws IOException, IOException {
        Socket socket = new Socket("127.0.0.1", 123);

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        reader = new BufferedReader(isr);

        OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
        writer = new BufferedWriter(o);
    }


    public void register(ActionEvent actionEvent) {

        String nameText = name.getText();
        String passwordText = password.getText();
        try {

            writer.write("Register\n");
            writer.write(nameText+" "+passwordText+"\n");
            writer.flush();

            String res = reader.readLine();
            label.setText(res);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void login(ActionEvent actionEvent) {

        String nameText = name.getText();
        String passwordText = password.getText();
        try {

            writer.write("LogIn\n");
            writer.write(nameText+" "+passwordText+"\n");

            writer.flush();

            String res = reader.readLine();
            label.setText(res);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}
