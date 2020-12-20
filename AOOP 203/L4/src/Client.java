import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 123);

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader Reader = new BufferedReader(isr);

            OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(o);

            Scanner sc = new Scanner(System.in);

            String fileName = sc.next();

            writer.write(fileName+".txt\n");
            writer.flush();

            Thread t = new Thread(){
                @Override
                public void run() {
                    try {
                        String line = Reader.readLine() + "\n";
                        while (line != null) {
                            if(line.equals("<eof>")) break;
                            System.out.println(line);
                            line = Reader.readLine() + "\n";
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
