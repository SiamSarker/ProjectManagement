import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y, i;
        X = sc.nextInt();
        Y = sc.nextInt();

        if (X > Y) {
            int total = 0;
            for (i = Y; i <= X; i++) {
                if (i % 5 != 0) {
                    total += i;
                }
            }
            System.out.println(total);
        }else if(X < Y){
            int total2 = 0;
            for (i = X; i <= Y; i++) {
                if (i % 13 != 0) {
                    total2 +=i;
                }
            }

            System.out.println(total2);
        }
    }
}
