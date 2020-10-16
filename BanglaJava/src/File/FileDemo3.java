package File;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {
        try {
            File file = new File("person/student.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                String name = sc.next();
                String id = sc.next();

                System.out.println("ID: "+ id+" Name: "+name);
            }
            sc.close();

        }
        catch (Exception e)
        {

        }




    }
}
