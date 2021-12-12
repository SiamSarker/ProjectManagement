import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {


        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        try {

            ServerSocket serverSocket = new ServerSocket(123);
            System.out.println("Waiting for client");
            Socket socket = serverSocket.accept();
            System.out.println("Connected to Client");

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader Reader = new BufferedReader(isr);


            OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(o);


            Scanner sc = new Scanner(new File("text1.txt"));

            while (sc.hasNext()) {
                BankAccount account = new BankAccount(sc.next(),
                        sc.nextInt(),
                        sc.nextDouble(), sc.nextInt());

                bankAccounts.add(account);
            }

            String data;
            while ((data = Reader.readLine()) != null) {
                if (data.equals("name")) {
                    String nameSearch = Reader.readLine();
                    int count = 0;

                    for (BankAccount b: bankAccounts) {
                        if (b.name.contains(nameSearch)) {

                            writer.write(b.name + " " + b.id + " " + b.balance + " " + b.age+"\n");
                            writer.flush();
                            count++;
                        }
                    }

                    if (count==0) {
                        writer.write("Data Not Found\n");
                        writer.flush();
                    }

                } else if (data.equals("add")) {

                    BufferedWriter writeFile = new BufferedWriter(new FileWriter("text1.txt"));

                    String newData = Reader.readLine();

                    writeFile.append(newData);

                    writeFile.close();

                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



        class BankAccount{
            String name;
            int id;
            double balance;
            int age;

            public BankAccount(String name, int id, double balance, int age) {
                this.name = name;
                this.id = id;
                this.balance = balance;
                this.age = age;
            }
        }


