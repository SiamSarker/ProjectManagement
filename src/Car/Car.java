package Car;

abstract public class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;

        System.out.println(model);
        System.out.println(color);
        System.out.println(maxSpeed);
    }


    public abstract void accelerate();

    public abstract void brake();


    public abstract void print();
}
