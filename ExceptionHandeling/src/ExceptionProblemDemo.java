import java.util.Scanner;

public class ExceptionProblemDemo {

    public static void main(String[] args) {

        int count = 0;

        do
        {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter num1 : ");
                int num1 = sc.nextInt();
                System.out.print("Please enter num2 : ");
                int num2 = sc.nextInt();
                int result = num1 / num2;
                System.out.println("Result:"+num1+"/"+num2+" = "+result);
                count++;

            }
            catch (Exception e){
                System.out.println("Exception: "+e);
                System.out.println("You must enter integer. Please try again");

            }

        }
        while (count == 0);

    }
}
