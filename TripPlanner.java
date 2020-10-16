import java.util.Scanner;

/**
 * TripPlanner
 */
public class TripPlanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("Nice to meet you Kasey Champion, where are you traveling to? ");
        String place = input.nextLine();
        System.out.println("Great! Mexico City sounds like a great trip");
        for(int i = 0; i<11;i++)
            System.out.print("*");
        System.out.println();
        System.out.println();
        System.out.println("How many days are you going to spend travelling? ");
        int i = input.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip? ");
        int j = input.nextInt();
        input.close();
        System.out.println();
    }
    
}