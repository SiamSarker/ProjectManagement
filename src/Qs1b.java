public class Qs1b {
    String model;
    String color;
    int maxSpeed;

    public Qs1b(String model,String color,int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }

    public void brake(){
        System.out.println("Car has stoped");
    }

    public static void main(String[] args) {
        Qs1b obj = new Qs1b("Tesla", "Blue", 170);
        obj.accelerate();
        System.out.println(obj.model);
        System.out.println(obj.color);
        System.out.println(obj.maxSpeed);
        obj.brake();
    }

}