package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;

public class Controller {
    @FXML
    TextField inputA;

    @FXML
    TextField inputB;

    @FXML
    TextArea resultTA;

    BufferedReader reader;

    BufferedWriter writer;

    public Controller() throws IOException {
        Socket socket = new Socket("127.0.0.1", 5678);

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        reader = new BufferedReader(isr);

        OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
        writer = new BufferedWriter(o);
    }

    @FXML
    void addFunction(){

        String a = inputA.getText();
        String b = inputB.getText();
        try {
            Double.parseDouble(a);
            Double.parseDouble(b);

            writer.write("add\n");
            writer.write(a);
            writer.newLine();
            writer.write(b);
            writer.newLine();

            writer.flush();

            String res = reader.readLine();
            resultTA.setText(res);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @FXML
    void subFunction(){

        String a = inputA.getText();
        String b = inputB.getText();
        try {
            Double.parseDouble(a);
            Double.parseDouble(b);

            writer.write("sub\n");
            writer.write(a);
            writer.newLine();
            writer.write(b);
            writer.newLine();

            writer.flush();

            String res = reader.readLine();
            resultTA.setText(res);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @FXML
    void multFunction(){

        String a = inputA.getText();
        String b = inputB.getText();
        try {
            Double.parseDouble(a);
            Double.parseDouble(b);

            writer.write("mult\n");
            writer.write(a);
            writer.newLine();
            writer.write(b);
            writer.newLine();

            writer.flush();

            String res = reader.readLine();
            resultTA.setText(res);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @FXML
    void divFunction(){

        String a = inputA.getText();
        String b = inputB.getText();
        try {
            Double.parseDouble(a);
            Double.parseDouble(b);

            writer.write("div\n");
            writer.write(a);
            writer.newLine();
            writer.write(b);
            writer.newLine();

            writer.flush();

            String res = reader.readLine();
            resultTA.setText(res);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @FXML
    void historyFunction() throws IOException {

        writer.write("history\n");
        writer.flush();

        String line;
        resultTA.setText("");
        while ((line = reader.readLine()) != null){
            if (line.equals("<eof>")) break;
            resultTA.appendText(line + "\n");
        }


    }


}
