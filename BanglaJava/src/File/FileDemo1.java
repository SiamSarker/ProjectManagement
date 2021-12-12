package File;

import java.io.File;
import java.util.SortedMap;

public class FileDemo1 {
    public static void main(String[] args) {


        try {
            File dir = new File("person");
            dir.mkdir();


            File file1 = new File("/Users/siamsarker/Google Drive/Spring_2020/Java/BanglaJava/person/student.txt");
            File file2 = new File("/Users/siamsarker/Google Drive/Spring_2020/Java/BanglaJava/person/teacher.txt");

            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File has been created");

            System.out.println(file1.getAbsolutePath());

        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
