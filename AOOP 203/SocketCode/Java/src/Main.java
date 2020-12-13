import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client");
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            System.out.println("Connected to Client");

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            try (BufferedReader bufferedReader = new BufferedReader(isr)) {
                String line = bufferedReader.readLine();
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
