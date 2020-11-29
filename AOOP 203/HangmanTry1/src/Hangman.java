import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

class GUI extends JFrame implements ActionListener {

    public static final String file = "data/input.txt";
    private static final int width = 600;
    private static final int height = 600;

    private static final String start = "Play";
    private static final String stop = "Exit";
    public static final String newplay = "Play Again?";

    public static String text;
    public static JPasswordField textField;

    public static JLabel label;
    public static JPanel mainPanel, upperPanel, middlePanel, lowerPanel, belowPanel;

    private int state = 0;
    public static int BodyPart = 0;
    private static String guesses = "";

    public static String sentence;
    private static char[] random;
    private static String[] words;
    private static char[] tries;


    public GUI() throws IOException {
        super("Hang-Man");
        setSize(width, height);

        words = Text();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,0));
        mainPanel.setBackground(Color.WHITE);

        middlePanel = new JPanel();
        upperPanel = new JPanel();
        upperPanel.setBackground(Color.WHITE);
        middlePanel.setBackground(Color.WHITE);

        mainPanel.add(upperPanel);
        mainPanel.add(middlePanel);
        lowerPanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(4, 4));
        lowerPanel.setBackground(Color.GRAY);

        mainPanel.add(lowerPanel, BorderLayout.SOUTH);

        belowPanel = new JPanel();
        belowPanel.setBackground(Color.CYAN);

        add(mainPanel);
        add(belowPanel, BorderLayout.AFTER_LAST_LINE);


        PlayButton(upperPanel);

        AlphabetButtons(lowerPanel);

        newPlayButtons(belowPanel);

    }


    public void PlayButton(JPanel leftPanel) throws IOException {

        label = new JLabel("Player 1 word input: ");

        textField  = new JPasswordField(10);
        textField.setEchoChar('*');

        System.out.println(text);
        JButton play  =  new JButton(start);
        play.setActionCommand(start);
        play.addActionListener(this);

        leftPanel.add(label);
        leftPanel.add(textField);
        leftPanel.add(play);

    }


    public void AlphabetButtons(JPanel bottomPanel) {

        JButton[] buttons = new JButton[26];
        String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z" };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(letters[i]);
            buttons[i].setSize(40, 40);
            buttons[i].setActionCommand(letters[i]);
            buttons[i].addActionListener(this);

            bottomPanel.add(buttons[i]);
        }

    }


    public void newPlayButtons(JPanel belowPanel) {
        JButton playAgain = new JButton(newplay);
        playAgain.setSize(100, 100);
        playAgain.setActionCommand(newplay);
        playAgain.addActionListener(this);
        JButton exit = new JButton(stop);
        exit.setActionCommand(stop);
        exit.addActionListener(this);
        exit.setSize(100, 100);
        belowPanel.add(playAgain);
        belowPanel.add(exit);
    }




    public void paint(Graphics g) {
        super.paint(g);

        Font font = new Font("Times", Font.BOLD, 24);
        g.setFont(font);
        g.setColor(Color.BLACK);

        if (state == 1) {

            Message(g);
            String result = "";
            for (int i = 0; i < tries.length; i++) {

                result += tries[i] + " ";


            }
            g.drawString(result, 300, 175);
            g.drawString("Guesses", 300, 300);
            g.drawString(guesses, 300, 350);
            System.out.println(random);

            try {
                hangman(g);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    private void hangman(Graphics g) throws IOException {

        if (BodyPart >= 1) {

            g.setColor(Color.BLACK);
            g.fillOval(35, 140, 70, 60);
            // hat
            g.setColor(Color.GRAY);
            g.fillRect(48, 120, 48, 30);
            g.fillRect(30, 140, 80, 15);

            // draw eyes
            g.setColor(Color.WHITE);
            g.fillOval(55, 160, 10, 10);
            g.fillOval(75, 160, 10, 10);

            // smile
            g.setColor(Color.WHITE);
            g.drawArc(50, 175, 40, 10, -10, -180);

            if (BodyPart >= 2) {
                // body
                g.setColor(Color.BLACK);
                g.fillRect(60, 200, 20, 80);
            }

            if (BodyPart >= 3) {
                // left arm
                g.setColor(Color.BLACK);
                g.fillRect(25, 220, 45, 15);
                g.setColor(Color.BLACK);
                g.fillRect(15, 220, 10, 15);
            }
            if (BodyPart >= 4) {
                // right arm
                g.setColor(Color.BLACK);
                g.fillRect(80, 220, 45, 15);
                g.setColor(Color.BLACK);
                g.fillRect(120, 220, 10, 15);
            }
            if (BodyPart >= 5) {
                // left foot
                g.setColor(Color.BLACK);
                g.fillRect(35, 280, 30, 15);
            }
            if (BodyPart >= 6) {
                // right foot
                g.setColor(Color.BLACK);
                g.fillRect(70, 280, 30, 15);
            }
        }
    }


    private void Message(Graphics g) {

        if (WinCheck() && BodyPart < 6) {
            g.drawString("Woohoo! You Won", 50, 100);
            lowerPanel.setVisible(false);
            belowPanel.setVisible(true);
            System.out.println("gotcha");

        }

        if (!WinCheck() && BodyPart < 6) {
            g.drawString("Start Playing Hang-Man", 25, 100);
        }  if (BodyPart >= 6) {
            g.drawString("You Lost!!", 25, 100);
            lowerPanel.setVisible(false);
            belowPanel.setVisible(true);
        }

    }


    public void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(text);
        writer.close();
    }

    public static String getword() {
        words = Text();

        int n = words.length;
        String word = words[n-1];
        return word;
    }

    public boolean WinCheck() {
        if (Arrays.equals(tries, random)) {
            return true;
        } else {
            return false;
        }
    }


    public static String[] Text() {
        BufferedReader reader = null;

        List<String> wordList = new ArrayList<String>();
        try {
            reader = new BufferedReader(new FileReader(file));
            String s = null;

            while ((s = reader.readLine()) != null) {

                wordList.add(s);
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());
            System.exit(-1);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.exit(-1);
            }
        }
        return wordList.toArray(new String[wordList.size()]);
    }

    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.equals(start)) {

            text = textField.getText().toLowerCase();
            try {
                write();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            upperPanel.setVisible(false);
            state = 1;
            play();
            repaint();

        }

        else if (command.length() == 1 && state == 1) {
            letters(command);
        }
        else if (command.equals(newplay)) {

            BodyPart = 0;
            guesses = "";
            lowerPanel.setVisible(true);
            upperPanel.setVisible(true);

            state = 1;
            play();
            repaint();

        } else if (command.equals(stop)) {
            state = 2;
            System.exit(-1);
        }
    }

    public void letters(String command) {

        System.out.println(command);

        if (sentence.contains(command.toLowerCase())) {
            for (int i = 0; i < random.length; i++) {
                if (command.toLowerCase().charAt(0) == random[i]) {
                    tries[i] = command.toLowerCase().charAt(0);

                }

            }
        } else if (!sentence.contains(command.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Sorry " + command
                    + " is not part of the word");
            BodyPart++;
        }

        guesses += command;
        if (BodyPart < 6 && !WinCheck()) {
            guesses += ", ";
        }
        else if (BodyPart >= 6){
            guesses += " end game!";
        }
        repaint();
    }

    private static void play() {


        sentence = getword();

        random = sentence.toCharArray();

        tries = new char[random.length];

        for (int i = 0; i < tries.length; i++) {
            tries[i] = '_';
        }

    }


    public static void main(String[] args) throws IOException {

        GUI hangman = new GUI();
        hangman.setVisible(true);

    }
}