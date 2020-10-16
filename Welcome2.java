import java.util.Scanner;

public class Welcome2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        i = input.nextInt();
        input.close();
        System.out.print("Welcome to ");
        System.out.println("Java Programming!"+i );
    }
}