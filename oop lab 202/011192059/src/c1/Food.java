package c1;

public class Food {
    protected String name;
    protected double price;

    public Food(String name) {
        this.name = name;
        
    }
    
    

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Food() {
        
    }

    public double getPrice() {
        return price;
    }
    
    public void eat(){
        
        
    }

    public void getQuantity(int i){
    }
    
    
}
