public class BoxTest {
    public static void main(String[] args) {
        Box c1;
        c1 = new Cube(5.0);
        System.out.println(c1.volume());
        c1 = new DifferentShapedBox(20.3,2,45);
        System.out.println(c1.volume());

    }
}
