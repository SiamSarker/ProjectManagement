import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MouseKeyImage {
    int xpos = 120, ypos = 120;

    void go(){
        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel img1 = readImage("star.png", 50, 50);

        img1.setBounds(xpos, ypos, 50, 50);
        frame.add(img1);

        frame.setVisible(true);

        int speed = 10;
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char pressedChar = e.getKeyChar();
                System.out.println(pressedChar);

                switch (pressedChar){
                    case 'w':
                        ypos -= speed;        // Moves image up
                        break;
                    case 'd':
                        xpos += speed;       // Moves image right
                        break;
                    case 's':
                        ypos += speed;      // Moves image down
                        break;
                    case 'a':
                        xpos -= speed;      // Moves image left
                        break;
                }
                img1.setBounds(xpos, ypos, 50, 50);
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX()-8;
                int y = e.getY()-31;

                System.out.println(x +" "+ y);

                img1.setBounds(x, y, 50, 50);
            }
        });

    }

    JLabel readImage(String imagePath, int width, int height){
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));

            Image imageScaled = image.getScaledInstance(width, height,
                    Image.SCALE_SMOOTH);

            return new JLabel(new ImageIcon(imageScaled));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        new MoveImagebyKey().go();
    }
}
