import java.util.Scanner;

public class Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double d;
        int a = sc;
        d = sc.nextDouble();
        String s = sc.next();

        System.out.println(a);
        System.out.println(d);
        System.out.println(s);
        sc.close();
    }
}