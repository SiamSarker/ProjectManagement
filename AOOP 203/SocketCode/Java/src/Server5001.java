import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server5001 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5002);
            System.out.println("Waiting for client");
            Socket socket = serverSocket.accept();
            System.out.println("Connected to Client");

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(isr);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
