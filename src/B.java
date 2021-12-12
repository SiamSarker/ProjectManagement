public class B extends A {

    int x = 5;
    B(){
        super();
        System.out.println("B's Constructor");
    }

    void display(){
        super.display();
        System.out.println("Inside B class");

    }
}
