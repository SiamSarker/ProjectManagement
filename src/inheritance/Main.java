package inheritance;

public class Main {
    public static void main(String[] args) {
        Child c = new Child(5, 6, 7);

        c.v1 = 10;
        c.v2 = 30;     // v2 is private in Parent
        c.v3 = 40;
        c.pFunction();
        c.cFunction();

    }
}
