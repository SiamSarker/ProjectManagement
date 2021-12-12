import java.util.Scanner;

public class prlm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'a')
                count++;
        }
        System.out.println(count);
    }
}
