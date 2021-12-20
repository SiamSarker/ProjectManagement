class Employee {
    String name;
    float salary;

    Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    void printsalary(float a) {
        System.out.println("total salary" + salary);
    }

}

class platinumEmployee extends Employee
{

    platinumEmployee (String name,float salary)
    {
        super(name,salary);
    }

    void printsalary() {
        System.out.println(name + " getting 15% bonus of salary " + salary);
        float total = (float) (salary + salary * .15);
        System.out.println("total salary: " + total);
    }
}



class silverEmployee extends Employee
{
    silverEmployee(String name,float salary)
    {
        super(name,salary);
    }
    void printsalary() {
        System.out.println(name + " getting 7% bonus of salary " + salary);
        float total = (float) (salary + salary * .07);
        System.out.println("total salary: " + total);
    }

}


class main {
    public static void main(String[] args) {
        platinumEmployee pp = new platinumEmployee("tam", 1000);
        silverEmployee ss = new silverEmployee("sir", 1000);

        pp.printsalary();
        ss.printsalary();


    }
}