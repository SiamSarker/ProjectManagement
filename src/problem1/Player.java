package problem1;

public class Player {
    String name;
    double salary;
    int jersey_number;

    public Player() {
    }

    public Player(String name, double salary, int jersey_number) {
        this.name = name;
        this.salary = salary;
        this.jersey_number = jersey_number;
    }

    void print()
    {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(jersey_number);

    }

}
