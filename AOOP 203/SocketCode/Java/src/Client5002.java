import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Client5002 implements Runnable {
    final private BufferedReader reader;
    final private BufferedWriter writer;
    ArrayList<Client5002> client5002s;
    String clientname;

    public Client5002(Socket socket, ArrayList<Client5002> client5002s) throws IOException {
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        reader = new BufferedReader(isr);

        OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
        writer = new BufferedWriter(o);

        clientname = reader.readLine();

        this.client5002s = client5002s;
    }

    @Override
    public void run() {
        String clientData = null;
        try {
            clientData = reader.readLine()+"\n";
            clientData = clientname + " writes: "+clientData;
            while (clientData != null) {
                for (Client5002 client : client5002s){
                    synchronized (client.writer) {
                        client.writer.write(clientData);
                        client.writer.flush();
                    }
                }
                clientData = reader.readLine()+"\n";
                clientData = clientname + " writes: "+clientData;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}