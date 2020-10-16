package Car;

public class Main {
    public static void main(String[] args) {
        Car c1;

        c1 = new Audi("Tesla", "Red", 920);

        c1.accelerate();
        c1.brake();

        c1.print();
    }
}
