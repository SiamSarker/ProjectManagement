import java.io.File;
import java.util.Scanner;

public class prlm {
    public static void main(String[] args) {
        int max = 0;
        try {
            File f = new File("in.txt");
            Scanner sc = new Scanner(f);

            int i = 0;
            while (true)
            {
                i = sc.nextInt();
                if(i > max)
                    max = i;
                sc.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(max);


    }
}
