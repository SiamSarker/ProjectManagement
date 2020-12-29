import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ArrayList<StudentAccount> studentAccounts = new ArrayList<>();
        try {
//            Scanner sc = new Scanner("Data/A.txt");
//            while (sc.hasNext()){
//                StudentAccount account = new StudentAccount(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble());
//                studentAccounts.add(account);
//            }

            ServerSocket serverSocket = new ServerSocket(123);
            System.out.println("Waiting for client");
            Socket socket = serverSocket.accept();
            System.out.println("Connected to Client");

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);


            OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(o);


            // 1. or search
            if (reader.readLine().equals("1")) {
                int flag = 0;
                int matchId = Integer.parseInt(reader.readLine());
                for (StudentAccount b : studentAccounts) {
                    if (b.id == matchId) {
                        // send the values to the cliient
                        flag++;
                        writer.write(b.id + " " + b.name + " " + b.marks + " " + b.cgpa + "\n");
                        writer.flush();
                        break;
                    }
                }
                if (flag == 0){
                    writer.write("Data not Found" + "\n");
                    writer.flush();
                }

            }


            if (reader.readLine().equals("2")) {
                // 2.  Add

                StudentAccount NewAc = new StudentAccount(Integer.parseInt(reader.readLine()), reader.readLine(), Double.parseDouble(reader.readLine()), Double.parseDouble(reader.readLine()));
                studentAccounts.add(NewAc);
                BufferedWriter writeFile = new BufferedWriter(new FileWriter("Data/A.txt"));
                for (StudentAccount b : studentAccounts) {
                    String s = b.id + " " + b.name + " " + b.marks + " " + b.cgpa + "\n";
                    writeFile.write(s);
                }
                writeFile.close();
                //  added successfully
            }

            //  3. Remove object by the given ID

            if (reader.readLine().equals("3")) {

                int flag = 0;
                int matchId = Integer.parseInt(reader.readLine());
                int count = 0;
                for (StudentAccount b : studentAccounts) {
                    if (b.id == matchId) {
                        // send the values to the cliient
                        flag++;
                        break;
                    }
                    count++;
                }
                if (flag > 0)
                    studentAccounts.remove(count);

                BufferedWriter writeFile = new BufferedWriter(new FileWriter("Data/A.txt"));
                for (StudentAccount b : studentAccounts) {
                    String s = b.id + " " + b.name + " " + b.marks + " " + b.cgpa + "\n";
                    writeFile.write(s);
                }
                writeFile.close();

                //  hopefully will work
            }

            //  4.  update a student information

            if (reader.readLine().equals("4")) {
                int matchId = Integer.parseInt(reader.readLine()); // given id
                String name = reader.readLine();
                double marks = Double.parseDouble(reader.readLine());
                double cgpa = Double.parseDouble(reader.readLine());

                for (StudentAccount b : studentAccounts) {
                    if (b.id == matchId) {
                        // send the values to the client
                        b.name = name;
                        b.marks = marks;
                        b.cgpa = cgpa;
                        break;
                    }
                }
                BufferedWriter writeFile = new BufferedWriter(new FileWriter("Data/A.txt"));
                for (StudentAccount b : studentAccounts) {
                    String s = b.id + " " + b.name + " " + b.marks + " " + b.cgpa + "\n";
                    writeFile.write(s);
                }
                writeFile.close();

            }

            }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
