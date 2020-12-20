import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(123);
        System.out.println("Waiting for client");
        Socket socket = serverSocket.accept();
        System.out.println("Connected to Client");

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader Reader = new BufferedReader(isr);


        OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter writer = new BufferedWriter(o);

        String data;

        while ((data = Reader.readLine()) != null){
            if (data.equals("text1.txt")){
                File file;
                BufferedReader readFile = new BufferedReader(new FileReader(data));
                String words = "";
                String line = readFile.readLine() + "\n";


                Thread t = new Thread(){
                    @Override
                    public void run() {
                        try {
                            String line = readFile.readLine() + "\n";
                            while (line != null) {
                                writer.write(line);
                                writer.flush();
                                line = Reader.readLine() + "\n";
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                };
                t.start();

            }
            else if (data.equals("text2")){

                File file;
                BufferedReader readFile = new BufferedReader(new FileReader(data));
                String words = "";
                String line = readFile.readLine() + "\n";


                Thread t = new Thread(){
                    @Override
                    public void run() {
                        try {
                            String line = readFile.readLine() + "\n";
                            while (line != null) {
                                writer.write(line);
                                writer.flush();
                                line = Reader.readLine() + "\n";
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                };
                t.start();

            }
            else if (data.equals("text3")){

                File file;
                BufferedReader readFile = new BufferedReader(new FileReader(data));
                String words = "";
                String line = readFile.readLine() + "\n";


                Thread t = new Thread(){
                    @Override
                    public void run() {
                        try {
                            String line = readFile.readLine() + "\n";
                            while (line != null) {
                                writer.write(line);
                                writer.flush();
                                line = Reader.readLine() + "\n";
                            }
                            writer.write("<eof>\n");
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                };
                t.start();

            }
            else {
                writer.write("File Not Found\n");
                writer.flush();
            }
        }


    }
}
