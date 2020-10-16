import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReader {
    public static void main(String[] args) {
        try{
            File file;
            FileReader fr = new FileReader("FileJ.txt");
            BufferedReader reader = new BufferedReader(fr);

//            int val = reader.read(); // returns int
//            System.out.println(val);
//            System.out.println((char)val);

//            String line1 = reader.readLine();
//            String line2 = reader.readLine();
//            String line3 = reader.readLine(); // full line

//            double d = Double.parseDouble(line3);

//            String[] splits = line3.split(" ");
//
//            System.out.println(splits.length);
//            System.out.println(splits[0]);
//            System.out.println(splits[1]);
//            System.out.println(splits[2]);



//            System.out.println(line1);
//            System.out.println(line2);
//            System.out.println(line3);


//            int a1, a2, a3;
//            a1 = Integer.parseInt(splits[0]);
//            a2 = Integer.parseInt(splits[1]);
//            a3 = Integer.parseInt(splits[2]);

//            String line = reader.readLine();
//            while(line != null)
//            {
//                System.out.println(line);
//                line = reader.readLine();
//            }



            reader.close();
        }
        catch (Exception e)
        {

        }
    }
}
