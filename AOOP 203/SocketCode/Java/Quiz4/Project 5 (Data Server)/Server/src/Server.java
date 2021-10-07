import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    public String id;
    public String name;
    public String cgpa;
    public String department;

    File data = new File("Data.txt");
    File temp = new File("Temp.txt");


    public void saveData(String line) {
        try {
            FileWriter newData = new FileWriter(data, true);

            newData.append(line + "\n");

            newData.close();

            System.out.println("Data Saved");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public void updateData(String line) {
        studentList();

        String[] parts = line.split(";");

        for (Student s : recordList) {
            if(s.id.equals(parts[0])){
                s.name = parts[1];
                s.cgpa = parts[2];
                s.department = parts[3];
            }
        }

        for (Student s : recordList) {
            s.saveNewData();
        }

        updateFile();

        System.out.println("Data Updated");
    }


    public void removeData(String idR) {
        studentList();

        for (Student s : recordList) {
            if(s.id.equals(idR)){
                recordList.remove(s);
                break;
            }
        }

        for (Student s : recordList) {
            s.saveNewData();
        }

        updateFile();

        System.out.println("Data Removed");
    }



    public void saveNewData() {
        try {
            FileWriter newData = new FileWriter(temp, true);
            newData.append(id + ";" + name + ";" + cgpa + ";" + department + "\n");
            newData.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateFile() {
        try {
            Scanner scn = new Scanner(temp);
            FileWriter updateData = new FileWriter(data);

            while (scn.hasNextLine()) {
                updateData.write(scn.nextLine() + "\n");
            }
            updateData.close();
            scn.close();
            temp.delete();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public ArrayList<Student> recordList;
    public void studentList() {
        recordList = new ArrayList<>();
        try {
            Scanner read = new Scanner(data);
            try {
                while (read.hasNextLine()) {
                    String data = read.nextLine();
                    String[] dataSplit = data.split(";");
                    Student studentData = new Student();
                    studentData.id = dataSplit[0];
                    studentData.name = dataSplit[1];
                    studentData.cgpa = dataSplit[2];
                    studentData.department = dataSplit[3];

                    recordList.add(studentData);
                }

            } catch (Exception f) {
                System.out.println(f.getMessage());
            }
        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
        }
    }
}

public class Server {
    public static void main(String[] args) {
        Student S1 = new Student();
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server is running...");
            System.out.println("Waiting for connection...");

            while(true) {
                Socket socket = server.accept();
                System.out.println("Connected...");

                InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                Scanner reader = new Scanner(isr);
                OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
                PrintWriter writer = new PrintWriter(osw);

                Scanner readFile;

                int flag = 0;
                while (reader.hasNextLine()) {
                    String command = reader.nextLine();

                    if (command.equals("Search")) {
                        System.out.println(command);
                        String id = reader.nextLine();
                        try {
                            readFile = new Scanner(S1.data);
                            while (readFile.hasNextLine()) {
                                String data = readFile.nextLine();
                                if (data.contains(id)) {
                                    writer.write(data + "\n");
                                    writer.flush();
                                    System.out.println("Found");
                                    flag = 1;
                                }
                            }
                            if(flag == 0){
                                System.out.println("Not Found");
                                writer.write("Student Not Found\n");
                                writer.flush();
                            }
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    else if (command.equals("Add")) {
                        String line = reader.nextLine();
                        try {
                            System.out.println(command);
                            S1.saveData(line);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    else if (command.equals("Remove")) {
                        String line = reader.nextLine();
                        try {
                            System.out.println(command);
                            S1.removeData(line);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    else if (command.equals("Update")) {
                        String line = reader.nextLine();
                        try {
                            System.out.println(command);
                            S1.updateData(line);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }

                socket.close();
                writer.close();
                System.out.println("Disconnected...");
                System.out.println("\n");
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
