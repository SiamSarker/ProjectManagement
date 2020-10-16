public class Person {
    String name;
    public Person(String a) {
        name = a; }
    public void display() {
        System.out.println("Hello from Person " + name); }
    public void display(String msg) {
        System.out.println("Hello from Person "+name+" :"+ msg); }
}

class AnonymousWithClass {
    public static void main(String[] args) {

        Person p = new Person("Tanjina") {
            @Override
            public void display() {
                display(2); // this is fine
                System.out.println("Hello from Annonymous");
            }

            // Extra method
            public void display(int a) {
                System.out.println("Number: " + a);
            }
        };
        p.display();
        p.display("3"); // Ok
//    p.display(3);
//    is not applicable for the arguments (int)

    }
}