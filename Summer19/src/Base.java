public class Base {
    public void print(){
        System.out.println("Base");
    }


    public static void DoPrint( Base o){
        o.print();
    }

    public static void main(String[] args) {

        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();

        DoPrint(x);
        DoPrint(y);
        DoPrint(z);

    }
}
