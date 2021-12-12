package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;

public class Controller {
    @FXML
    TextArea allTextArea;
    @FXML
    TextField msgTextField;

    private BufferedWriter writer;
    private BufferedReader reader;

    public Controller() throws IOException {
        String myName = "Siam";

        Socket socket = new Socket("127.0.0.1", 5001);

        OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
        writer = new BufferedWriter(o);

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        reader = new BufferedReader(isr);

        writer.write(myName+"\n");
        writer.flush();

        Thread t = new Thread(){
            public void run(){
                try {
                    String line = reader.readLine() + "\n";
                    while (line!=null){
                        allTextArea.appendText(line);
                        line = reader.readLine()+ "\n";
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }

    // done initializing reader writer with

    @FXML
    void msgSend() throws IOException {
        String msg = msgTextField.getText() +"\n";
        msgTextField.setText("");
        writer.write(msg);
        writer.flush();
    }

}
