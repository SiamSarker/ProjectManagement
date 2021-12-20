
public class BankingApplication {

    private String name;
    private String id;
    private double balance;

    public BankingApplication(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposite(int interest )
    {
        balance=balance+interest;

    }
    void withdrwal(int a)
    {

        balance=balance-a;

    }


    public static void main(String[] args) {
        BankingApplication b1=new BankingApplication("r","123",5);
        b1.deposite(200000);
        b1.withdrwal(30);

        System.out.println( b1.getBalance());


    }

}
