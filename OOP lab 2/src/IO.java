import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IO {
    public static void main(String[] args) {
        try{

            FileWriter fw = new FileWriter("FileJ.txt");
            BufferedWriter writer = new BufferedWriter(fw);

            double d = 100.45;
            writer.write("" + d);
            writer.newLine();

            // writer.write() only takes ASCII
            for(int i = 97; i < 97+26; i++)
                writer.write(i);
            writer.newLine();

            writer.write("This is a String\n");
            writer.newLine();
            writer.write("abcd");

            writer.close();
        }
        catch (Exception e){

        }
    }
}
