package pack1.pack2;

public class Box {
    double boxLength;
    double boxHeight;
    double boxWidth;

    public Box(double var) {
        this.boxLength = var;
        this.boxHeight = var;
        this.boxWidth = var;
    }

    public Box(double boxLength, double boxHeight, double boxWidth) {
        this.boxLength = boxLength;
        this.boxHeight = boxHeight;
        this.boxWidth = boxWidth;
    }

    public double getVolume(){
        return (boxLength*boxHeight*boxWidth)/3;
    }

    public void printDetails(){
        System.out.printf("Length: "+boxLength);
        System.out.printf("Height: "+boxHeight);
        System.out.printf("Width: "+boxWidth);
    }


}
