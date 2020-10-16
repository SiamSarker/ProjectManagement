package Layout;

import java.awt.*;

public class GridLayoutExample extends Frame {
    public GridLayoutExample(int widthInPixels, int heightInPixels){
        setTitle("Grid Example");
        setSize(widthInPixels,heightInPixels);
        int numberOfRows = 4;
        int numberOfColumns = 3;
        setLayout(new GridLayout(numberOfRows,numberOfColumns));
        for(int label = 1; label < 13; label++)
            add(new Button(String.valueOf(label)));
        show();
    }

    public static void main(String[] args) {
        GridLayoutExample f = new GridLayoutExample(175,100);
    }
}
