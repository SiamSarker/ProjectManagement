import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //part 1
        System.out.println("Part 1: Find 'a'");
        System.out.println("Write a sentence:");
        String find_a = sc.nextLine();
        int count_a = 0;
        int i = 0;
        while(true){
            if (find_a.charAt(i) == 'a')
                count_a++;
            if(i == find_a.length()-1)
                break;
            i++;
        }

        System.out.println("The number of 'a' is "+count_a);

        //part 2
        System.out.println("Part 2: find 'yes'");
        System.out.println("Write a sentence:");
        String find_yes = sc.nextLine();
        if(find_yes.contains("yes"))
            System.out.println("There is 'yes' in the sentence");
        else
            System.out.println("There is no 'yes'");

        //part 3
        System.out.println("Part 3: add two strings as integer");
        System.out.println("Input two strings as integer");
        String s1 = sc.next();
        String s2 = sc.next();

        int inS1 = Integer.parseInt(s1);
        int inS2 = Integer.parseInt(s2);
        int sum = inS1+inS2;

        System.out.println("Sum is "+ sum);


        //part 4
        System.out.println("Part 4: Write in a file");
        try{

            File f = new File("Output.txt");
            PrintWriter wr = new PrintWriter(f);
            sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Age:");
            String age = sc.next();


            wr.println("Name: "+name);
            wr.println("Age: "+ age);
            System.out.println("Output is written in the file Output.txt");

            sc.close();
            wr.close();

        }
        catch (Exception e){

        }

        //part 5
        System.out.println("Part 4: Read and Write in file");
        int inti = 0;
        int max = 0;
        int min = 0;
        int total = 0;
        int val = 0;
        System.out.println("Reading input from Input.txt");
        try{
            File file = new File("Input.txt");
            Scanner fsc = new Scanner(file);

            while (true) {
                val = fsc.nextInt();
                if (inti == 0)
                {
                    max = val;
                    min = val;
                    inti++;
                }
                if (val > max)
                    max = val;
                total += val;
                if( val < min)
                    min = val;
            }
        }
        catch (Exception e) {

        }
        try{
            File file2 = new File("Values.txt");
            PrintWriter wr = new PrintWriter(file2);
            wr.println("Max:" +max);
            wr.println("Min: "+min);
            wr.println("Sum: "+total);
            wr.close();
        }
        catch (Exception e)
        {

        }
        System.out.println("Output is written in the file Values.txt");
    }
}
