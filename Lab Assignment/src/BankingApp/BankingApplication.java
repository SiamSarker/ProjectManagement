package BankingApp;

import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Record arr[] = new Record[10];
        int i = 0;
        int n = 0;

        if(n == 1)
        {
            arr[i] = new Record(sc.nextLine(),sc.nextDouble());
            i++;
        }



        int index = 0;

        arr[index] = new Record(null,0);

        arr[index] = new Record(sc.nextLine(),sc.nextDouble());

        System.out.println(arr[0].getName());
        System.out.println(arr[0].getAmount());

    }
}
