import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

class CreateFiles
{
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++)
        {
            String filename ="Files/"+ i + ".txt";
            BufferedWriter wr = new BufferedWriter(new FileWriter(filename));
            for (int j = 0; j < 1000000; j++)
            {
                wr.write(new Random().nextDouble() +"\n");
            }
            wr.close();
        }
    }
}