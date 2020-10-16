package c1.c2;

import c1.Food;

public class Appetizer extends Food {

    public Appetizer(String thai_soup) {
        super(thai_soup);
        
    }

    @Override
    public double getPrice() {
        System.out.println("The "+name+" cost "+price+" taka");
        return super.getPrice();
    }

    public void eat(){
        System.out.println("We started our meal by eating "+name);
    }

    public Appetizer(String name, double price) {
        super(name, price);
        System.out.println("We started our meal by eating "+name);
    }

    public void getQuantity(int i){
        System.out.println("We ordered "+i+" number of Wontons");
    }
    
    
    
}
