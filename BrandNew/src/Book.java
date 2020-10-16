public class Book {

    String title;
    String author;
    double price;

    public Book() {
        title = "Book1";
        author = "Author1";
        price = 56.7;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {

        Book b[] = new Book[4];
        b[0] = new Book();
        b[1] = new Book("Book2", "Author2", 45.6);
        b[2] = new Book("Book3", "Author3", 46.2);
        b[3] = new Book("Book4", "Author4", 48.3);

        for(Book arr : b)
            System.out.println("Price of "+arr.title+" is "+ arr.price);
    }
}
