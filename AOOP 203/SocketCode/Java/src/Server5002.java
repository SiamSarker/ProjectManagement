import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server5002 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5001);
            System.out.println("Waiting for client");
            Socket socket = serverSocket.accept();
            System.out.println("Connected to Client");

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(isr);

            OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(o);

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                writer.write(line+"\n");
                writer.flush();
                line = bufferedReader.readLine();
            }
            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
