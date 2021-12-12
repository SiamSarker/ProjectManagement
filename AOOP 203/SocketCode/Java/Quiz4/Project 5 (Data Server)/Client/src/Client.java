import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    OutputStreamWriter osw;
    PrintWriter writer;
    InputStreamReader isr;
    Scanner reader;
    Client(){

        try {
            Socket socket = new Socket("127.0.0.1", 5000);

            osw = new OutputStreamWriter(socket.getOutputStream());
            writer = new PrintWriter(osw);
            isr = new InputStreamReader(socket.getInputStream());
            reader = new Scanner(isr);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void add(String addID, String addName, String addCGPA, String addNo){
        writer.write("Add\n");
        writer.flush();
        String line = addID + ";" + addName + ";" + addCGPA + ";" + addNo + "\n";
        writer.write(line);
        writer.flush();
    }

    public void remove(String idR){
        writer.write("Remove\n");
        writer.flush();
        writer.write(idR + "\n");
        writer.flush();
    }

    public void update(String addID, String addName, String addCGPA, String addNo){
        writer.write("Update\n");
        writer.flush();
        String line = addID + ";" + addName + ";" + addCGPA + ";" + addNo + "\n";
        writer.write(line);
        writer.flush();
    }

    public void search(String searchID){
        writer.write("Search\n");
        writer.flush();
        writer.write(searchID + "\n");
        writer.flush();

        String data = reader.nextLine();
        if(!data.equals("Student Not Found")){
            String[] datapart = data.split(";");

            System.out.println("ID   : " + datapart[0]);
            System.out.println("Name : " + datapart[1]);
            System.out.println("CGPA : " + datapart[2]);
            System.out.println("Num  : " + datapart[3]);
        }
        else {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        Client c1 = new Client();
//        c1.add("011192096", "Rajeet", "4.00", "CSE");
//        c1.add("011192000", "James", "4.00", "CSE");

//        c1.update("011192096", "Rajeet", "3.00", "CSE");

//        c1.remove("011192000");
//
//        c1.search("011192026");
    }
}
