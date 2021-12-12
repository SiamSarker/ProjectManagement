import java.util.Scanner;

/**
 * LearnScanner
 */
public class LearnScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hello "+ name);
        input.close();
    }
}