package pack1.pack2;
import pack1.*;

public class Car extends Vehicle {
    public Car(String name, int id){
        super(name);
        this.id=id;
    }
    void print(){
        System.out.println(getName() + " " + id);
    }
}