import java.util.Scanner;

public class MyClass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [6];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2  == 0){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}