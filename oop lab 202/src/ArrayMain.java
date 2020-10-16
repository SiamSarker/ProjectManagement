class Shape{
    double length;
    public Shape(double length) {
        this.length = length;
    }

    void getArea(){
    }
}

class Rectangle extends Shape{
    double sideB = 1.5;

    public Rectangle(double length) {
        super(length);
    }

    void getArea(){
        System.out.println("The area of Rectangle is "+length*sideB);
    }
}

class Triangle extends Shape{
    double height = 1.7;

    public Triangle(double length) {
        super(length);
    }

    void getArea(){
        System.out.println("The area of Triangle is "+length*height);
    }
}

class Circle extends Shape{
    double pi = 3.14;

    public Circle(double length) {
        super(length);
    }

    void getArea(){
        System.out.println("The area of Circle is "+length*length*pi);
    }
}


public class ArrayMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Triangle(2.0);
        shapes[0].getArea();
        shapes[1] = new Triangle(1.5);
        shapes[1].getArea();

        shapes[2] = new Rectangle(2.0);
        shapes[2].getArea();
        shapes[3] = new Rectangle(1.0);
        shapes[3].getArea();

        shapes[4] = new Circle(1.5);
        shapes[4].getArea();


    }
}
