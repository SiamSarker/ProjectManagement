import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
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

            System.out.println("Press 1 for search name\nPress 2 for Add new Account");
            int flag = sc.nextInt();
            sc.nextLine();
            if (flag == 1) {
                String name = sc.nextLine();
                writer.write("search\n");
                writer.flush();
                writer.write(name+"\n");
                writer.flush();

                String line = Reader.readLine() + "\n";
                System.out.println(line);
            } else if (flag == 2) {

                writer.write("add\n");
                writer.flush();

                String name = sc.next();
                int id = sc.nextInt();
                double balance = sc.nextDouble();
                int age = sc.nextInt();

                String line = name +" "+id+" "+balance+" "+age+"\n";
                writer.write(line+"\n");
                writer.flush();

            } else
                System.out.println("Wrong Input");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
