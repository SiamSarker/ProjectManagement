public class DemoClass {
    private static double PI = 3.1416;

    class InnerClass {
         void calculateArea(double radius){
            double area = PI*radius*radius;
            System.out.println("Area: "+area);
        }
    }

    void displayInner(double radius){
        InnerClass n = new InnerClass(radius);
    }




    public static void main(String[] args) {
        DemoClass dm = new DemoClass();
        dm.
                calculateArea(5.0);
    }

}
