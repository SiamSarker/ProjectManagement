public class Cube extends Box {

    double cube;
    public Cube(double cube) {
        super(cube,cube,cube);
        this.cube = cube;

    }

    @Override
    public double volume() {
        return cube*cube*cube;
    }
}
