
package com.mycompany.mid1;
class Vehicle{
String grade;
Double roadtax;
Vehicle(){}
Vehicle(String grade, double roadtax){
    this.grade=grade;
    this.roadtax=roadtax;
}
double total_tax(){
    return roadtax;
}
}
class Public_vehicle extends Vehicle{
double fitness_tax;
Public_vehicle(){}
Public_vehicle(String grade, double roadtax, double fitness_tax){
super(grade,roadtax);
this.fitness_tax=fitness_tax;
}
@Override
double total_tax(){
return fitness_tax+roadtax;
}
}
class Private_vehicle extends Vehicle{
double fitness_tax;
Private_vehicle(){}
Private_vehicle(String grade, double roadtax, double fitness_tax){
super(grade,roadtax);
this.fitness_tax=fitness_tax;
}
@Override
double total_tax(){
return 1.5*(fitness_tax+roadtax);
}
}
public class Mid1{
    public static void main(String[] args) {
        Vehicle[] v=new Vehicle[3];
        v[0]=new Vehicle("A",100);
        System.out.println("For Vehicle:"+v[0].total_tax());
        v[1]=new Public_vehicle("A",100,200);
        System.out.println("For Public_vehicle:"+v[1].total_tax());
        v[2]=new Private_vehicle("A",100,200);
        System.out.println("For Private_vehicle:"+v[2].total_tax());
    }
}
