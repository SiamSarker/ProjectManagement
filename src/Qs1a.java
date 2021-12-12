import java.util.Scanner;

public class Qs1a {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 1, 10, 19, 20, 5 };
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        sc.close();
        int found = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if(var == arr[i]){
                    found++;
                    break;
                }
            }
        }
        if(found == 0)
            System.out.println("Not Found");
        else
            System.out.println("Found");
    }
}
