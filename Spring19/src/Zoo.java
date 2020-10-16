import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();
        Bird b = new Magpie();
        Magpie c = (Magpie) b;
        a.fly();
        b.fly();
        System.out.println(b.i);
        ((Magpie)b).fly(15);
        c.fly();
        a.eat();
        b.eat();
        c.eat();
    }
}