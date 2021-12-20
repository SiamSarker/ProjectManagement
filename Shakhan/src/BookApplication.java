import java.util.Scanner;
public class BookApplication {
    private String name;
    private Double price;
    private String address;

    public BookApplication(String name, Double price, String address) {
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




    public static void main(String[] args) {

        BookApplication books[]= new BookApplication[10];
         Scanner sc = new Scanner(System.in);



            String name = sc.next();
            Double price = Double.valueOf(sc.next());
            String add = sc.next();

            books[0] = new BookApplication(name, price, add);
            System.out.println(books[0].getPrice());
        System.out.println(books[0].getAddress());

            books[0].setPrice(0.0);

            System.out.println(books[0].getPrice());




    }
}




