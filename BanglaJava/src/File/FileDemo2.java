package File;

import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args) {

        try {
            String name, id;
            Scanner sc = new Scanner(System.in);
            System.out.println("How many students?");
            int n = sc.nextInt();
            Formatter formatter = new Formatter("person/student.txt");
            for (int i = 0; i<n; i++){
                System.out.println("Enter name and id");
                name = sc.next();
                id = sc.next();
                formatter.format("%s %s\r\n", name, id);
            }

            formatter.close();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
