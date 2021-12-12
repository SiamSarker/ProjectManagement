
//package OopLabAssignment.Qs3;

        import java.util.Scanner;
class Employee2 {
    private String name;
    private double salary;
    private String id;
    private double salaryPerHour;
    private int numOfHourWorked;
    private double baseSalary;
    private double commissionPerProductSold;
    private int numberOfProduct;

    Employee2(String name, double salary, String id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Employee2(String name, String id, double salaryPerHour, int numOfHourWorked) {
        this.name = name;
        this.id = id;
        this.salaryPerHour = salaryPerHour;
        this.numOfHourWorked = numOfHourWorked;

    }

//    Employee(String name, String id, double salaryPerHour, int numOfHourWorked) {
//        this.name = name;
//        this.id = id;
//        this.salaryPerHour = salaryPerHour;
//        this.numOfHourWorked = numOfHourWorked;
//    }
//
//    Employee(String name, double baseSalary, double commissionPerProductSold, int numberOfProduct) {
//        this.name = name;
//        this.baseSalary = baseSalary;
//        this.commissionPerProductSold = commissionPerProductSold;
//        this.numberOfProduct = numberOfProduct;
//    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public double getSalaryPerHour(){
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour){
        this.salaryPerHour = salaryPerHour;
    }

    public int getNumOfHourWorked(){
        return numOfHourWorked;
    }

    public void setNumOfHourWorked(int numOfHourWorked){
        this.numOfHourWorked = numOfHourWorked;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getCommissionPerProductSold(){
        return commissionPerProductSold;
    }

    public void setCommissionPerProductSold(double commissionPerProductSold){
        this.commissionPerProductSold = commissionPerProductSold;
    }

    public int getNumberOfProduct(){
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct){
        this.numberOfProduct = numberOfProduct;
    }

    public void printInfo(){

    }


}

class Salaried extends Employee2 {
    Salaried(String name, double monthlySalary, String id){
        super(name,monthlySalary,id);
    }
    public void printInfo(){
        System.out.println("Salaried Employee : ");
        System.out.println("Name   : "+getName());
        System.out.println("Id     : "+getId());
        System.out.println("Salary : "+getSalary());
    }

}

class HourlySalaried extends Employee2 {

    HourlySalaried(String name, String id,double salaryPerHour, int numOfHourWorked){
        super(name, id, salaryPerHour, numOfHourWorked);

    }

    public void printInfo(){
        System.out.println("Hourly Salaried Employee : ");
        System.out.println("Name   : "+getName());
        System.out.println("Id     : "+getId());
        System.out.println("Salary : "+getSalaryPerHour()*getNumOfHourWorked());
    }

}

class Commissioned extends Employee2 {
    Commissioned(String name, double baseSalary, double commissionPerProductSold, int numberOfProduct, String id){
        super(name,baseSalary+commissionPerProductSold*numberOfProduct,id);
    }

    public void printInfo(){
        System.out.println("Commissioned Employee : ");
        System.out.println("Name   : "+getName());
        System.out.println("Id     : "+getId());
        System.out.println("Salary : "+getSalary());
    }

}

class run{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee2[] employees = new Employee2[1000];
        employees[0] = new Salaried("Siam",20000,"011551");
        employees[1] = new HourlySalaried("Roni","011552",300,30);
        employees[2] = new Commissioned("Rifat",10000,150,50,"011553");
        System.out.println("----Welcome to employee database----");
        System.out.println("1. View Record");
        System.out.println("2. Update Record");
        System.out.println("3. Exit");
        System.out.println("Choice your selection : ");
        int n = sc.nextInt();
        if (n==1){
            System.out.println(employees.length);
            for (int i=0;i<3;i++){
                employees[i].printInfo();
            }
//            employees.printInfo();
//            employeeHs.printInfo();
//            employeeC.printInfo();
        }
        if (n==2) {
            System.out.println("----Welcome to employee database update system----");
            System.out.println("1. Salaried Employee");
            System.out.println("2. Hourly Salaried Employee");
            System.out.println("3. Commissioned Employee");
            System.out.println("Choice your selection : ");

            int n1 = sc.nextInt();
            for (int i = 0; i < employees.length; i++) {
//                int n1 = sc.nextInt();
                if (n1 == 1 && i == 0) {
                    sc.nextLine();
                    System.out.print("Name   : ");
                    employees[i].setName(sc.nextLine());
                    System.out.print("Id     : ");
                    employees[i].setId(sc.nextLine());
                    System.out.print("Salary : ");
                    employees[i].setSalary(sc.nextDouble());
                    System.out.println("Salaried Employee Data Update!");
                    employees[i].printInfo();
                    break;
                }
                if (n1 == 2 && i == 1) {
                    sc.nextLine();
                    System.out.print("Name                  : ");
                    employees[i].setName(sc.nextLine());
                    System.out.print("Id                    : ");
                    employees[i].setId(sc.nextLine());
                    System.out.print("Salary Per Hour       : ");
                    employees[i].setSalaryPerHour(sc.nextDouble());
                    System.out.print("Number Of Hour Worked : ");
                    employees[i].setNumOfHourWorked(sc.nextInt());
                    System.out.println("Hourly Salaried Employee Data Update!");
                    employees[i].printInfo();
                    break;
                }
                if (n1 == 3 && i == 2) {
                    sc.nextLine();
                    System.out.print("Name                        : ");
                    employees[i].setName(sc.nextLine());
                    System.out.print("Id                          : ");
                    employees[i].setId(sc.nextLine());
                    System.out.print("Base Salary                 : ");
                    employees[i].setBaseSalary(sc.nextDouble());
                    System.out.print("Commission Per Product Sold : ");
                    employees[i].setCommissionPerProductSold(sc.nextDouble());
                    System.out.print("Number Of Product           : ");
                    employees[i].setNumberOfProduct(sc.nextInt());
                    System.out.println("Commissioned Employee Data Update!");
                    employees[i].printInfo();
                    break;
                }
            }
        }


        if(n==3){

        }




    }
}