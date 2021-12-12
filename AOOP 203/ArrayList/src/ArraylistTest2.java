import java.io.*;

public class ArraylistTest2 {
    public static void main(String[] args) {

        BankAccount2 acc = new BankAccount2("Abc", 10, 2999);
        try {
            FileOutputStream f = new FileOutputStream("Data/B.txt");
            ObjectOutputStream ow = new ObjectOutputStream(f);

            ow.writeObject(acc);

            FileInputStream f2 = new FileInputStream("Data/B.txt");
            ObjectInputStream or = new ObjectInputStream(f2);

            BankAccount2 acc2 = (BankAccount2) or.readObject();
            System.out.println(acc2.name+" "+acc2.id+" "+acc2.balance);

            or.close();
            ow.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
class BankAccount2 implements Serializable {
    String name;
    int id;
    double balance;

    public BankAccount2(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
}