public class DifferentShapedBox extends Box {


    public DifferentShapedBox(double width, double height, double depth) {
        super(width, height, depth);
    }

    @Override
    public double volume() {
        return width*height*depth;
    }
}
