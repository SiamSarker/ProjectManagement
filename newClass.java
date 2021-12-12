import java.util.Scanner;

public class newClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      int a = sc.nextInt();
        sc.nextInt();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(a);
        System.out.println(s1);
        System.out.println(s2);
        sc.close();
    }
}