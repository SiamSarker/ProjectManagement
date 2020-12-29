import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 123);

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);

            OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(o);

            Scanner sc = new Scanner(System.in);

            System.out.println("Press 1 for student ID data\nPress 2 for Add new Account\nPress 3 for remove an ID\nPress 4 for Update a ID data");
            int flag = sc.nextInt();
            sc.nextLine();
            if (flag == 1) {
                String id = sc.nextLine();
                writer.write(id);
                writer.flush();

                String line = reader.readLine() + "\n";
                System.out.println(line);
            }
            else if (flag == 2) {
                writer.write("2");
                writer.flush();
                System.out.println("ID: ");
                writer.write(sc.nextLine()+"\n");
                writer.flush();
                System.out.println("Name: ");
                writer.write(sc.nextLine()+"\n");
                writer.flush();
                System.out.println("Marks: ");
                writer.write(sc.nextLine()+"\n");
                writer.flush();
                System.out.println("CGPA: ");
                writer.write(sc.nextLine()+"\n");
                writer.flush();

            }
            else
                System.out.println("Wrong Input");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
