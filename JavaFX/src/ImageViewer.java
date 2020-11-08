import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageViewer {
    void go() {
        JFrame frame = new JFrame("Image viewer");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel img1 = readImage("star.png", 50,50);
        img1.setBounds(250,30,50,50);
        frame.add(img1);

        frame.setVisible(true);

        int xpos = 250;
        int ypos = 30;
        for (int i = 0; i < 30; i++)
        {
            try {
                Thread.sleep(100);
                xpos -= 7;
                ypos += 7;
                img1.setBounds(xpos, ypos, 50, 50);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }


    }



    JLabel readImage(String imagpath, int width, int height)
    {
        try {
            BufferedImage image = ImageIO.read(new File(imagpath));

            Image imageScaled = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            return new JLabel(new ImageIcon(imageScaled));

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        new ImageViewer().go();

    }




}
