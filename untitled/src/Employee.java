import java.util.*;

public abstract class Employee implements IEmployee {
    String name;
    Date JoiningDate;

    public Employee(String name, Date joiningDate) {
        this.name = name;
        JoiningDate = joiningDate;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        FullTimeEmployee Sourov = new FullTimeEmployee(100000, 4, 10000, "Sourov Ahmed", new Date(2013-1900, 2, 23));
        PartTimeEmployee Rifat = new PartTimeEmployee(20, 500, "Mamun Ur Rashid", new Date(2020-1900, 5, 2));
        IEmployee[] employees = {Sourov, Rifat};
        for(int i=0; i<employees.length;i++){
            employees[i].ShowDetails();
            System.out.println("Monthly Salary : "+ employees[i].CalculateSalary());
            System.out.println("Job Duration(Month) : " + employees[i].GetJobDurationMonth());
        }

    }
}

class FullTimeEmployee extends  Employee{

    int MonthlySalary;
    int OvertimeWorkHours;
    int OvertimeSalaryRatePerHour;

    public FullTimeEmployee(int monthlySalary, int overtimeWorkHours, int overtimeSalaryRatePerHour, String name, Date date) {
        super(name, date);
        MonthlySalary = monthlySalary;
        OvertimeWorkHours = overtimeWorkHours;
        OvertimeSalaryRatePerHour = overtimeSalaryRatePerHour;
    }

    @Override
    public double CalculateSalary() {
        return MonthlySalary+ OvertimeWorkHours * OvertimeSalaryRatePerHour;
    }

    @Override
    public void ShowDetails() {

    }

    @Override
    public int GetJobDurationMonth() {
        Date now= new Date();
        return (now.year - JoiningDate.year)*12 + now.month-JoiningDate.month;

    }
}

class PartTimeEmployee extends Employee{

    int MonthlyWorkHours;
    int SalaryRatePerHour;

    public PartTimeEmployee( int monthlyWorkHours, int salaryRatePerHour, String name, Date joiningDate) {
        super(name, joiningDate);
        MonthlyWorkHours = monthlyWorkHours;
        SalaryRatePerHour = salaryRatePerHour;
    }

    @Override
    public double CalculateSalary() {
        return MonthlyWorkHours * SalaryRatePerHour;

    }

    @Override
    public void ShowDetails() {
        System.out.println("Employee Information ______________");
        System.out.println("Name : "+ name);
        System.out.println("Joining Date : "+ JoiningDate);
        System.out.println("Monthly salary : "+ CalculateSalary());
        System.out.println("Job duration (month) : "+ GetJobDurationMonth());

    }

    @Override
    public int GetJobDurationMonth() {
        Date now= new Date();
        return (now.year - JoiningDate.year)*12 + now.month-JoiningDate.month;
    }
}