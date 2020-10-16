package Test;

class Animal{
    void fly(){
        System.out.println("Don't know if I can fly");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Bird is flying");
    }
    void layEgg(){
        System.out.println("Bird is laying egg");
    }
}

class MagPie extends Bird{
    void fly(){
        System.out.println("Magpie is flying");
    }
}
class Cat extends Animal{
    void fly(){
        System.out.println("Cat cannot fly");
    }
}

class Bat extends Animal {
    void fly(){
        System.out.println("Bat is flying");
    }
}

public class Test {
    public static void main(String[] args) {
        MagPie mp = new MagPie(); //A MagPie object is created
        mp.fly(); //lay() of MagPie has been called
        mp.layEgg(); // layEgg() of MagPie (which is implemented in Bird) is called

        Animal amp = (Animal) mp; ///up-casting
        amp.fly(); //Though the reference is of Animal class, but the object is of MagPie class, so it will use the
        //method from MagPie class
        //amp.layEgg(); //error animal class does not have layEgg

        Bird bmp = (Bird) amp; //We are casting an Animal reference to Bird reference.
        // It will work as the object is of MagPie class. bmp is a reference of Bird class,
        // but amp will always be a reference of Animal class
        bmp.layEgg();

        ((Bird) amp).layEgg(); //a different approach of down-casting. Done without an additional reference.
        //actually a temporary reference was created to execute the statement. But we did not assign
        //it to any variable
        //amp.layEgg(); //it will still generate an error. Because amp is a reference of Animal class.

        System.out.println("====================Flying different animals with Array of Animal references=============");
        Animal[] animals = {new Animal(), new Bird(), new Cat(), new MagPie(), new Bat()};

        for(Animal animal: animals){
            animal.fly();
        }



        System.out.println("=============Trying down-casting to subclass reference with parent class's object===============");
        Animal mp2 = new Animal(); //This time the object is of Animal class. Reference, too is of Animal class.
        mp2.fly(); ///it will use the fly() method of Animal class, as the object is of Animal class
        //mp2.layEgg(); //error. Animal class does not have layEgg()
        ((Bird) mp2).layEgg(); ///will generate an exception, because we can create a super class's reference to a subclass's object,
        ///but the other way is not allowed.
    }
}
