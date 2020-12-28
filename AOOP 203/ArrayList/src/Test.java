import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("A.txt"));

            while (sc.hasNext()){
                BankAccount account = new BankAccount(sc.next(),sc.nextInt(),sc.nextDouble());
                bankAccounts.add(account);
            }
            sc.close();

            BankAccount ref1 = bankAccounts.get(3);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class BankAccount implements Serializable {
    String name;
    int id;
    double balance;

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
}
