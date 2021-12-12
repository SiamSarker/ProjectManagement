import java.util.Scanner;

/**
 * MyCar
 */
public class MyCar {

    String manufacturer;
    String model;
    int year;
    MyCar(String manufacturer, String model, int year)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }
    void accelerate()
    {
        System.out.println("Car is accelerating");
    }
    void brake(){
        System.out.println("Car is breaking");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String manu = sc.nextLine();
        String md = sc.nextLine();
        int i = sc.nextInt();
        MyCar Car1 = new MyCar(manu, md, i);

        Car1.accelerate();
        System.out.println(Car1.manufacturer);
        System.out.println(Car1.model);
        System.out.println(Car1.year);
        Car1.brake();

        sc.close();
    }
}