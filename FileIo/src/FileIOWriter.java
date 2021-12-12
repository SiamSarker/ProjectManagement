import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileIOWriter {
    public static void main(String[] args) {
        try {
            File f = new File("Out.txt");
            PrintWriter pw = new PrintWriter(f);

//            int a = 10, b = 20;
//            pw.println("Abcde fghij");
//            pw.println(a +" "+b);

            String name;
            String age;

            Scanner sc = new Scanner(System.in);

            name = sc.nextLine();
            age = sc.nextLine();

            pw.println("Name: "+name);
            pw.println("Age: "+age);

            pw.close();
        }
        catch (IOException e){

        }
    }
}
