class Employee{
    public String name;
    public int ID;
    public void printInfo() {
        System.out.println("Name: "+name+" ,"+"ID: "+ID);
    }
    public double getSalary(){
        return -1.0;
    }
}

class Salaried extends Employee{
    public double salary=30000.0;
    public double getSalary(){
        return salary;
    }
}

class Commission extends Employee{
    public double salary=15000.0;
    public double getSalary(){
        return salary;
    }
}

class Hourly extends Employee{
    public double salary=20000.0;
    public double getSalary(){
        return salary;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Joe"; emp.ID=12;
        emp.printInfo();
        System.out.println(emp.getSalary());
        Salaried e1= new Salaried();
        e1.name="Rahim"; e1.ID=1;
        e1.salary+=10000.0;
        e1.printInfo(); System.out.println(e1.getSalary());
        Hourly e2=new Hourly();
        e2.name="Fahim"; e2.ID=2;
        e2.printInfo(); System.out.println(e2.getSalary());
        Commission e3=new Commission();
        e3.name="Karim"; e3.ID=3;
        e3.printInfo(); System.out.println(e3.getSalary());
    }
}
