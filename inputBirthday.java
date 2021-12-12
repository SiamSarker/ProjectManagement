import java.util.Scanner;


public class inputBirthday {

    public static void main(String[] args) {
        Scanner inputBirthday = new Scanner (System.in);
        System.out.println("On what day of the month were you born? ");
        int date = inputBirthday.nextInt();
        System.out.println("What is the name of the month in which you were born? ");
        String month = inputBirthday.next();
        System.out.println("During what year were you born? ");
        int year = inputBirthday.nextInt();
        System.out.println("You were born on "+month+" "+date+", "+year+". You're mighty old!");
        inputBirthday.close();
    }
}