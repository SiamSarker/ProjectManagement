class Plant
{
    Plant()
    {
        System.out.println( "A plant has grown.");
    }

    void water() {
        System.out.println("Watering...");
    }

    void sow(){
        System.out.println("Sowing some plants");
    }
}

class Flower extends Plant
{
    Flower()
    {
        System.out.println("A flower has bloomed.");
    }
    void sow()  // overridden
    {
        super.sow();
        System.out.println("Sowing a flower plant");
    }
}

class Daisy extends Flower{
    Daisy(){
        System.out.println("A daisy has bloomed.");
    }
    void water(){ //overridden
        System.out.println( "Watering a daisy plant.");
    }
    void scent(){
        System.out.println("Fragrance..");
    }
}

public class Garden {
    public static void main(String[] args) {


        Plant f1 = new Daisy();
        Plant f2 = new Plant();
        f2.sow();
        f1.sow();

        f1.water();
        f2.water();


        /*
        1.
        You cannot add or remove anything from the class Plant, Flower and Daisy.
        You can only write your code here in the main method.
        You have to generate the following output by calling appropriate methods:

            A plant has grown.
            A flower has bloomed.
            A daisy has bloomed.

            A plant has grown.
            Sowing some plants
            Sowing some plants

            Sowing a flower plant

            Watering a daisy plant.
            Watering...


        2. You can only create two objects.
        [Hint: Recall the topic(subclass polymorphism) taught in today's class]

        3.
        You must add the following comment: "//overriden method"
        after every overridden method you find in the code.

         */
    }
}
