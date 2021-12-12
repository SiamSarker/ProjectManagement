import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIORead {
    public static void main(String[] args) {
        try {
            File f = new File("Out.txt");
            Scanner sc = new Scanner(f);

            sc.next();
            String name = sc.next();
            sc.next();
            String age = sc.next();

            System.out.println(name);
            System.out.println(age);

            sc.close();
        }
        catch (IOException e){

        }
    }
}
