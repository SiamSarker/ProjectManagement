import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author sisuj
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        File fileObj;
        fileObj = new File("C:\\Users\\sisuj\\OneDrive\\Documents\\NetBeansProjects\\FileRead\\txxx.txt");
        try {
            FileReader reader = new FileReader(fileObj);
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();

            ArrayList<Person> myList = new ArrayList<Person>();

            while(line != null){

//                String g = "John, 3.67, 011234567";
                String[] arr = new String[3];
                arr = line.split(" ");
//                for(int i = 0; i < arr.length; i++){
//                    System.out.println(arr[i]);
//                }

                myList.add(new Person(arr[0], arr[1], arr[2]));


                System.out.println(line);
                line = br.readLine();
            }


            br.close();
            reader.close();





        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

}