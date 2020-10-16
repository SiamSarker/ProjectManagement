package inheritance;

public class Parent {
    public int v1;
    public int v2;  // Child class wont inherit v2.

    public Parent(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
        System.out.println("Parent Constructor");
    }

    public void pFunction(){

    }
}
