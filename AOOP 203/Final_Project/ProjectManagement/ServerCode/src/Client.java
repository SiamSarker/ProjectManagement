import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Client implements Runnable {
    private BufferedReader reader;    // used to be in final
    private BufferedWriter writer;    // used to be in final
    ArrayList<Client> clients;
    String clientname;

    public Client(Socket socket, ArrayList<Client> clients) throws IOException {
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        reader = new BufferedReader(isr);

        OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
        writer = new BufferedWriter(o);

        clientname = reader.readLine();

        this.clients = clients;
    }

//    public Client() {
//    }

    @Override
    public void run() {
        String clientData = null;
        try {
            clientData = reader.readLine()+"\n";
            clientData = clientname + " writes: "+clientData;
            while (clientData != null) {
                for (Client client : clients){
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