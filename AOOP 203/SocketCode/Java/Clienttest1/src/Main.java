import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 5000);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

        try (BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            bufferedWriter.write("Hello Server!\n");
            bufferedWriter.flush();

            bufferedWriter.close();

        }


    }
}
