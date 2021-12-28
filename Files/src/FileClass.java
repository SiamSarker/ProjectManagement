import java.io.*;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {


//        try {
//            fileObj.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Not working");
//        }

        try {
            File fileObj = new File("/Users/siamsarker/Google Drive/Java/Files/hello.txt");
            Scanner fsc = new Scanner(fileObj);
            while (fsc.hasNextLine()){
                String data = fsc.nextLine();
                System.out.println(data);
            }

            BufferedReader br = new BufferedReader(new FileReader(new File("hello.txt")));


//            PrintWriter pwrite = new PrintWriter(fileObj);
//            pwrite.write("Hello World");
//            pwrite.flush();
//            pwrite.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
