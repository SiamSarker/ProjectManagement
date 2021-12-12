import java.util.Scanner;

/**
 * CheckEvenOdd
 */
public class CheckEvenOdd {

    public static void main(String[] args) {

        int num;

        System.out.println("Write an integer: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        input.close();
        if(num % 2 == 0)
        {
            System.out.println("This is even number");
        }
        else
            System.out.println("This is Odd number");
        
    }
}