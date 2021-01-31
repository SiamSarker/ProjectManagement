import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(123);
            Socket socket = serverSocket.accept();

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);

            OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(o);

            FileReader fr = new FileReader("Data.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            FileWriter fw = new FileWriter("Data.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);


            String data;
            while ((data = reader.readLine()) !=null){
                try {
                    if (data.equals("Register")) {

                        String newUser = reader.readLine();
                        String[] userarr = newUser.split(" ");

                        int flag = 0;
                        String line;
                        while ((line = bufferedReader.readLine()) != null) {

                            String[] splits = line.split(" ");

                            if (splits[0].equals(userarr[0]) && splits[1].equals(userarr[1])) {
                                flag++;
                                break;
                            }
                        }

                        if (flag > 0) {
                            writer.write("Already Exists\n");
                            writer.flush();
                        } else {
                            bufferedWriter.append(newUser);
                            bufferedWriter.newLine();
                            writer.write("Registration Successful\n");
                            writer.flush();
                        }
                    }

                    else if(data.equals("LogIn")) {


                        String newLogIn = reader.readLine();
                        String[] logArr = newLogIn.split(" ");

                        int flag = 0;
                        String line;
                        while ((line = bufferedReader.readLine()) != null) {

                            String[] splits = line.split(" ");

                            if (splits[0].equals(logArr[0]) && splits[1].equals(logArr[1])) {
                                flag++;
                                break;
                            }
                        }

                        if (flag > 0) {
                            writer.write("Log In Successful\n");
                            writer.flush();
                        } else {
                            writer.write("Not Registered\n");
                            writer.flush();
                        }

                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

            }

            writer.close();
            reader.close();
            bufferedReader.close();
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }

}
}
