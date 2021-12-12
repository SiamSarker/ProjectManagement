import java.util.InputMismatchException;
import java.util.Scanner;

public class InputApp {

    public static void getInput() throws Exception{
        throw new Exception("Negative integer found");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try {
            num = sc.nextInt();

            if (num < 0){
                try {
                    getInput();
                }catch(ArithmeticException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        catch (InputMismatchException e){
            System.out.println("Not an Integer");
            e.printStackTrace();
        }


        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
