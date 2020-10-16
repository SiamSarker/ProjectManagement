import java.util.Scanner;


public class Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 19, 20};
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int x = sc.nextInt();
        for(int i = 0; i<arr.length; i++)
        {
            if(x == arr[i])
            {
                System.out.println("Found");
                count++;
            }
                      
        }
        if(count == 0)
        System.out.println("Not found");
    }
}