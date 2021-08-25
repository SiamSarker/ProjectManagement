import java.util.Vector;

public abstract class Vehicle {
    public abstract void move();
    public abstract void permission();
    public abstract void refill_tank();


    public static void main(String[] args) {
        Vehicle rickshaw = new rickshaw();
        Vehicle cng = new CNG();
        Vehicle car = new Car();
        Vehicle bus = new Bus();

        rickshaw.move();
        cng.move();
        car.move();
        bus.move();

        System.out.println();

        rickshaw.permission();
        cng.permission();
        car.permission();
        bus.permission();

        System.out.println();
        ((MotorVehicle) cng).refill_tank();
        ((MotorVehicle) cng).refill_tank();
        ((MotorVehicle) cng).refill_tank();


    }
}

class MotorVehicle extends Vehicle{

    @Override
    public void move() {
        System.out.println("Burning engine fuel");
    }

    @Override
    public void permission() {

    }

    @Override
    public void refill_tank() {
            System.out.println("Filled with fuel");
    }


}

class rickshaw extends Vehicle {


    @Override
    public void move() {
        System.out.println("Padding the chain");

    }

    @Override
    public void permission() {
        System.out.println("Rickshaw can move in narrow streets");
    }

    @Override
    public void refill_tank() {

    }
}

class CNG extends MotorVehicle {

    @Override
    public void move() {
        super.move();

    }

    @Override
    public void permission() {
        System.out.println("CNG can move in city streets");
    }
}

class Car extends MotorVehicle {

    @Override
    public void move() {
        super.move();

    }

    @Override
    public void permission() {
        System.out.println("Car can move in highway");

    }
}

class Bus extends MotorVehicle {

    @Override
    public void move() {
        super.move();

    }

    @Override
    public void permission() {
        System.out.println("Bus can move in expressway");

    }
}
