import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Client implements Runnable {
    final private BufferedReader reader;
    final private BufferedWriter writer;
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





    @Override
    public void run() {

        String clientData = null;
        String condition = null;
        try {

            condition = reader.readLine()+"\n";
            System.out.println(condition);

            System.out.println((new File("Data.txt")).exists());
            File file = new File("Data.txt");
            File file1 = new File("Data1.txt");
            File file2 = new File("Data2.txt");
            File file3 = new File("Data3.txt");
            FileWriter fileWriter;



            System.out.println("Writing done");


            clientData = reader.readLine()+"\n";

            if (condition.contains("AllMsg")|| condition.contains("chat"))
                clientData = clientname + " : "+clientData;
            else if (condition.contains("notice")){
                clientData = "==> "+clientData;
            }

            while (clientData != null) {
                for (Client client : clients){
                    synchronized (client.writer) {
                        if (condition.contains("AllMsg")){
                            client.writer.write("AllMsg\n");
                            client.writer.flush();
                        }
                        else if (condition.contains("notice")){
                            fileWriter = new FileWriter(file,  true);
                            fileWriter.append(clientData);
                            fileWriter.close();
                            client.writer.write("notice\n");
                            client.writer.flush();

                        }
                        else if (condition.contains("assign1")){
                            fileWriter = new FileWriter(file1, true);
                            fileWriter.append(clientData);
                            fileWriter.close();
                            client.writer.write("assign1\n");
                            client.writer.flush();
                        }
                        else if (condition.contains("assign2")){
                            fileWriter = new FileWriter(file2, true);
                            fileWriter.append(clientData);
                            fileWriter.close();
                            client.writer.write("assign2\n");
                            client.writer.flush();
                        }
                        else if (condition.contains("assign3")){
                            fileWriter = new FileWriter(file3, true);
                            fileWriter.append(clientData);
                            fileWriter.close();
                            client.writer.write("assign3\n");
                            client.writer.flush();
                        }
                        else if (condition.contains("chat1")){
                            client.writer.write("chat1\n");
                            client.writer.flush();
                        }
                        else if (condition.contains("chat2")){
                            client.writer.write("chat2\n");
                            client.writer.flush();
                        }
                        else if (condition.contains("chat3")){
                            client.writer.write("chat3\n");
                            client.writer.flush();
                        }

                        client.writer.write(clientData);
                        client.writer.flush();
                    }
                }
                condition = reader.readLine()+"\n";
                clientData = reader.readLine()+"\n";
                if (condition.contains("AllMsg") || condition.contains("chat"))
                    clientData = clientname + " : "+clientData;
                else if (condition.contains("notice")){
                    clientData = "==> "+clientData;
                }

            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}