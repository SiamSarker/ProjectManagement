import java.util.Scanner;

public class MyClass6 {
    int width;   // Member/Instance Variables
    int height;  // Member/Instance Variables
    MyClass6(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    MyClass6(){
        this.width = -1;
        this.height = -5;
    }
    int cross(){
        return width*height;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyClass6 r1 = new MyClass6(sc.nextInt(), sc.nextInt());
        MyClass6 r2 = new MyClass6();

        System.out.println(r1.width);
        System.out.println(r1.height);

        System.out.println("Area of r1 = "+r1.cross());

        System.out.println(r2.width);
        System.out.println(r2.height);

        System.out.println("Area of r1 = "+r2.cross());


        /*r1.width = 10;
        r1.height = 20;
        int area1 = r1.area();

        MyClass6 r2 = new MyClass6();
        r2.width = 30;
        r2.height = 15;
        int area2 = r2.area();

        r1.print();
        System.out.println(area1);
        System.out.println();
        r2.print();
        System.out.println(area2);*/

        sc.close();

    }
}