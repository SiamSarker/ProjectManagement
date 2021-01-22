package sample;

import javafx.event.ActionEvent;
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

    @FXML
    TextArea noticeTextArea;
    @FXML
    TextField noticeTextField;

    final private BufferedWriter writer;
    final private BufferedReader reader;

    public Controller() throws IOException {
        String myName = "Leader";

        Socket socket = new Socket("127.0.0.1", 123);

        OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
        writer = new BufferedWriter(o);

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        reader = new BufferedReader(isr);

        writer.write(myName+"\n");
        writer.flush();

        Thread t = new Thread(){
            public void run(){
                String condition;
                try {
                    while (true){
                        condition = reader.readLine() + "\n";
                        if (condition.contains("AllMsg")){
                            String line = reader.readLine() + "\n";
                            allTextArea.appendText(line);
                        }
                        else if (condition.contains("notice")){
                            String line = reader.readLine() + "\n";
                            noticeTextArea.appendText(line);
                        }
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
        writer.write("AllMsg\n");
        writer.flush();
        writer.write(msg);
        writer.flush();
    }

    @FXML
    void noticeSend() throws IOException {
        String msg = noticeTextField.getText() +"\n";
        noticeTextField.setText("");
        writer.write("notice\n");
        writer.flush();
        writer.write(msg);
        writer.flush();

    }


    void assign1() {
    }


    void chat1() {
    }


    void chat2() {
    }

    void assign2() {
    }

    void assign3() {
    }

    void send3() {
    }

}
