package Car;

public class Audi extends Car {
    public Audi(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void accelerate() {

        System.out.println("Car is accelerating");

    }

    @Override
    public void brake() {

        System.out.println("Car is braking");

    }

    public void print(){
        System.out.println(model);
        System.out.println(color);
        System.out.println(maxSpeed);
    }
}
