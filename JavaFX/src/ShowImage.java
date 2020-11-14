import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ShowImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image viewer");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        try {
            BufferedImage image = ImageIO.read(new File("star.png"));

            Image imageScaled = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);

            JLabel imageLabel = new JLabel(new ImageIcon(imageScaled));

            frame.setLayout(null);
            imageLabel.setBounds(30,30,200,200);

            frame.add(imageLabel);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}
