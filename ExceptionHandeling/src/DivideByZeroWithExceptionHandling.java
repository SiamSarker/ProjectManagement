import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator)
        throws ArithmeticException
    {
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try
            {
                System.out.println("Enter a numerator");
                int numerator = sc.nextInt();

                System.out.println("Enter a denomirator");
                int denominator = sc.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf( "\nResult: %d / %d = %d\n", numerator, denominator, result );
                continueLoop = false;
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.err.printf("\nException: %s\n", inputMismatchException);
                sc.nextLine();
                System.out.println("Enter integer");
            }
            catch ( ArithmeticException arithmeticException)
            {
                System.err.printf("\nException: %s\n", arithmeticException);
                System.out.println("Zero is not vaild, try again");
            }
        }
        while ( continueLoop );
    }
}
