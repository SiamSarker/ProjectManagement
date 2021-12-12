import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
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

//            bankAccounts.set(2, new BankAccount("Siam", 100, 20040));
//            bankAccounts.remove(1);

            bankAccounts.sort(new Comparator<BankAccount>() {
                @Override
                public int compare(BankAccount o1, BankAccount o2) {
//                    if (o1.id < o2.id) return -1;   //  -1 means o1 first then o2 - Accending
//                    else if (o1.id > o2.id) return 1;    //   usually o2 first then o1

                    return o1.name.compareTo(o2.name);     //  accending string sort

                }
            });

            for (BankAccount b: bankAccounts){
                System.out.println(b.name+" "+b.id+" "+b.balance);
            }

            sc.close();

//            BankAccount ref1 = bankAccounts.get(2);
//            System.out.println(ref1.name+" "+ref1.id+" "+ref1.balance);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class BankAccount {
    String name;
    int id;
    double balance;

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
}
