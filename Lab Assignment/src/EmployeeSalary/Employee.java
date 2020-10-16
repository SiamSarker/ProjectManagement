package EmployeeSalary;

public abstract class Employee {

    private String name;
    private String AccNo;

    public Employee(String name, String accNo) {
        this.name = name;
        AccNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
    }
}
