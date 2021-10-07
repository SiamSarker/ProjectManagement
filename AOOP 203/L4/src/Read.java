import java.io.*;
import java.util.Random;

class Read
{
    public static void main(String[] args) throws IOException {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10; i++)
        {
            String filename ="Files/"+ i + ".txt";
            BufferedReader rd = new BufferedReader(new FileReader(filename));
            double sum = 0;
            for (int j = 0; j < 1000000; j++)
            {
                sum += Double.parseDouble(rd.readLine());
            }
            System.out.println(filename+" "+sum);
            rd.close();
        }
        long t2 = System.currentTimeMillis();
        long totalTime = t2 - t1;
        System.out.println("Total Time : "+totalTime);

    }
}