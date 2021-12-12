import java.util.Scanner;

public class MyClass4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       double d;
       int i = sc.nextInt();
        d = sc.nextDouble();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);

       System.out.println(i);
       System.out.println(d);
   //    System.out.println(k);
   sc.close();
    }
}