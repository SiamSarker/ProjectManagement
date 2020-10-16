package inheritance;

public class Child extends Parent{
    public int v3;

    Child(int v1, int v2, int v3){
        super(v1, v2);
        this.v3 = v3;
        System.out.println("Child Constructor");
    }

    public void cFunction(){
        super.v1 = 20;  // Access Parent variable v1.

    }
}
