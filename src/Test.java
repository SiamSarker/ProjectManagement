class Calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(int a, double b){
        return a+b;
    }
    double add(int a, double b, double c){
        return a+b+c;
    }

}
public class Test{
    public Test(String t2) {
    }

    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(4,5));
        System.out.println(c.add(4,5.0));
        System.out.println(c.add(4,5, 6.0));
    }
}