package super_key;

public class Car extends Vehicle {
    int gear;

    public Car(String color, double weight, int gear) {
        super(color, weight);
        this.gear = gear;
    }


    void attribute(){
        super.attribute();
        System.out.println("Gear : "+gear);
    }
}
