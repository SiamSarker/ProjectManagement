import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5678);
            Socket socket = serverSocket.accept();

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);

            OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(o);

            String data;
            StringBuilder history = new StringBuilder();
            while ((data = reader.readLine()) !=null){
                try {
                    if (data.equals("add")) {
                        String a = reader.readLine();
                        String b = reader.readLine();

                        double d1 = Double.parseDouble(a);
                        double d2 = Double.parseDouble(b);

                        String res = (d1 + d2) + "\n";

                        history.append(a).append(" + ").append(b).append(" = ").append(res);    //  auto suggested

                        writer.write(res);
                        writer.flush();
                    } else if (data.equals("sub")) {
                        String a = reader.readLine();
                        String b = reader.readLine();

                        double d1 = Double.parseDouble(a);
                        double d2 = Double.parseDouble(b);

                        String res = (d1 - d2) + "\n";

                        history.append(a).append(" - ").append(b).append(" = ").append(res);    //  auto suggested

                        writer.write(res);
                        writer.flush();
                    } else if (data.equals("mult")) {
                        String a = reader.readLine();
                        String b = reader.readLine();

                        double d1 = Double.parseDouble(a);
                        double d2 = Double.parseDouble(b);

                        String res = (d1 * d2) + "\n";

                        history.append(a).append(" * ").append(b).append(" = ").append(res);    //  auto suggested

                        writer.write(res);
                        writer.flush();
                    } else if (data.equals("div")) {
                        String a = reader.readLine();
                        String b = reader.readLine();

                        double d1 = Double.parseDouble(a);
                        double d2 = Double.parseDouble(b);

                        String res = (d1 / d2) + "\n";

                        history.append(a).append(" / ").append(b).append(" = ").append(res);    //  auto suggested

                        writer.write(res);
                        writer.flush();
                    } else if (data.equals("history")) {

                        String curHistory = history.toString();
                        writer.write(curHistory + "<eof>\n");      //  <eof> means of data writing
                        writer.flush();
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }

            writer.close();
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
