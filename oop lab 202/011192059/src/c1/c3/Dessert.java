package c1.c3;

import c1.Food;

public class Dessert extends Food {

    public Dessert(String cheeseCake) {
        super(cheeseCake);

    }

    @Override
    public double getPrice() {
        System.out.println("The "+name+" cost "+price+" taka");
        return super.getPrice();
    }

    public void eat(){
        System.out.println("We ate "+" at the end of our meal.");
    }

    public Dessert(String name, double price) {
        super(name, price);
    }

}
