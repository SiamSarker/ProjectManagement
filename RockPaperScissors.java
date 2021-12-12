import java.util.EventListener;
import java.util.Scanner;

/**
 * RockPaperScissors
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Does player one choose rock, paper or scissors");
        String playerOne = input.next();
        System.out.println("Does player two choose rock, paper or scissors");
        String playerTwo = input.next();

        if(playerOne.equals("rock"))
        {
            if(playerTwo.equals("scissors"))
            {
                System.out.println("Player one wins.");
            }
            else if(playerTwo.equals("paper"))
            {
                System.out.println("Player two wins.");
            }
            else
            {
                System.out.println("tie!");
            }

        }
        else if(playerOne.equals("paper"))
        {
            if(playerTwo.equals("scissors"))
            {
                System.out.println("Player two wins.");
            }
            else if(playerTwo.equals("paper"))
            {
                System.out.println("tie!");
            }
            else
            {
                System.out.println("Player one wins");
            }
        }
        else
        {
                System.out.println("tie!");
        }

        input.close();
    }
}