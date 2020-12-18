import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server5002 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5001);
            ArrayList<Client5002> client5002s = new ArrayList<>();

            while (true) {
                Socket socket = serverSocket.accept();
                Client5002 client5002 = new Client5002(socket, client5002s);
                client5002s.add(client5002);
                Thread clientThread = new Thread(client5002);
                clientThread.start();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
