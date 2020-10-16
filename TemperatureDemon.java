import java.util.Scanner;

/**
 * TemperatureDemon
 */
public class TemperatureDemon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels, farn;

        System.out.print("Celsius = ");
        cels = input.nextDouble();

        farn = 1.8 * cels + 32;

        System.out.println("Farenheit : "+farn);
        input.close();

    }
}