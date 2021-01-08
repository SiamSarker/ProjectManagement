import java.util.Arrays;
import java.util.Scanner;

public class D0_Mean_Median_Mode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];

        for (int i = 0; i < N; i++){
            X[i] = sc.nextInt();
        }

        Arrays.sort(X);

        double Sum = 0;

        for (int i = 0; i < N; i++){
            Sum += X[i];
        }
        System.out.printf("%.1f\n", Sum/N);


        if (N%2 == 0 ){
            double med = (X[N%2-1]+X[N%2-1])/2;
            System.out.printf("%.1f\n", med);
        }
        else{
            double med = X[(N+1)/2];
            System.out.printf("%.1f\n", med);
        }



    }
}
