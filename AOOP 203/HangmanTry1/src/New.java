import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;

;

@SuppressWarnings("serial")
class GUI extends JFrame implements ActionListener {
    public static final String FILE = "input/dictionary.txt";
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final String FILE_START = "Play";
    private static final String FILE_STOP = "Exit";
    public static final String SHOW_REPLAY = "Play Again?";
    private int state = 0;
    private static char[] randPhrase;
    private static String[] words;
    private static char[] guesses;
    public static int numBodyParts = 0;
    private static String numGuesses = "";
    public static String phrase;

    public static String text;
    public static JPanel mainPanel, leftPanel, rightPanel, bottomPanel, belowPanel;
    public static JLabel label;
    public static JPasswordField textField;

    public GUI() throws IOException {
        super("Hang-Man");
        setSize(WIDTH, HEIGHT);

        words = textFile();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,0));
        mainPanel.setBackground(Color.WHITE);

        rightPanel = new JPanel();
        leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);
        rightPanel.setBackground(Color.WHITE);

        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(4, 4));
        bottomPanel.setBackground(Color.GRAY);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        belowPanel = new JPanel();
        belowPanel.setBackground(Color.GREEN);

        add(mainPanel);
        add(belowPanel, BorderLayout.AFTER_LAST_LINE);


        createPlayButton(leftPanel);

        createButtons(bottomPanel);

        replayButtons(belowPanel);


    }

    public void replayButtons(JPanel belowPanel) {
        JButton playAgain = new JButton(SHOW_REPLAY);
        playAgain.setSize(100, 100);
        playAgain.setActionCommand(SHOW_REPLAY);
        playAgain.addActionListener(this);
        JButton exit = new JButton(FILE_STOP);
        exit.setActionCommand(FILE_STOP);
        exit.addActionListener(this);
        exit.setSize(100, 100);
        belowPanel.add(playAgain);
        belowPanel.add(exit);
    }


    public void createButtons(JPanel bottomPanel) {

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

    public void createPlayButton(JPanel leftPanel) throws IOException {

        label = new JLabel("Player 1 word input: ");

        textField  = new JPasswordField(10);
        textField.setEchoChar('*');

        System.out.println(text);
        JButton play  =  new JButton(FILE_START);
        play.setActionCommand(FILE_START);
        play.addActionListener(this);

        leftPanel.add(label);
        leftPanel.add(textField);
        leftPanel.add(play);

    }


    public void paint(Graphics g) {
        super.paint(g);

        // set the font
        Font font = new Font("Serif", Font.BOLD | Font.ITALIC, 24);
        g.setFont(font);
        g.setColor(Color.RED);

        // if user has selected play from menu - start game
        if (state == 1) {

            gameMessages(g);
            String result = "";
            for (int i = 0; i < guesses.length; i++) {

                result += guesses[i] + " ";


            }
            g.drawString(result, 300, 175);
            g.drawString("GUESSES", 300, 300);
            g.drawString(numGuesses, 300, 350);
            System.out.println(randPhrase);

            try {
                hangman(g);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



    private void hangman(Graphics g) throws IOException {

        if (numBodyParts >= 1) {

            g.setColor(Color.YELLOW);
            g.fillOval(35, 140, 70, 60);
            // hat
            g.setColor(Color.RED);

            g.fillRect(48, 120, 48, 30);
            g.fillRect(30, 140, 80, 15);

            // draw eyes
            g.setColor(Color.GREEN);
            g.fillOval(55, 160, 10, 10);
            g.fillOval(75, 160, 10, 10);

            // smile
            g.setColor(Color.RED);
            g.drawArc(50, 175, 40, 10, -10, -180);

            if (numBodyParts >= 2) {
                // body
                g.setColor(Color.GREEN);
                g.fillRect(60, 200, 20, 80);
            }

            if (numBodyParts >= 3) {
                // left arm
                g.setColor(Color.GREEN);
                g.fillRect(25, 220, 45, 15);
                g.setColor(Color.YELLOW);
                g.fillRect(15, 220, 10, 15);
            }
            if (numBodyParts >= 4) {
                // right arm
                g.setColor(Color.GREEN);
                g.fillRect(80, 220, 45, 15);
                g.setColor(Color.YELLOW);
                g.fillRect(120, 220, 10, 15);
            }
            if (numBodyParts >= 5) {
                // left foot
                g.setColor(Color.BLACK);
                g.fillRect(35, 280, 30, 15);
            }
            if (numBodyParts >= 6) {
                // right foot
                g.setColor(Color.BLACK);
                g.fillRect(70, 280, 30, 15);
            }
        }
    }


    private void gameMessages(Graphics g) {

        if (winner() && numBodyParts < 6) {
            g.drawString("You Won!!", 50, 100);
            bottomPanel.setVisible(false);
            belowPanel.setVisible(true);
            System.out.println("gotcha");

        }

        if (!winner() && numBodyParts < 6) {
            g.drawString("Let's Play Hang Man!!!", 25, 100);
        }  if (numBodyParts >= 6) {
            g.drawString("You Lost!!", 25, 100);
            bottomPanel.setVisible(false);
            belowPanel.setVisible(true);
        }

    }

    public static String getword() {
        words = textFile();

        int n = words.length;
        String word = words[n-1];
        return word;
    }

    public boolean winner() {
        if (Arrays.equals(guesses, randPhrase)) {
            return true;
        } else {
            return false;
        }
    }

    public void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE));
        writer.write(text);
        writer.close();
    }


    public static String[] textFile() {
        BufferedReader reader = null;

        List<String> wordList = new ArrayList<String>();
        try {
            reader = new BufferedReader(new FileReader(FILE));
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

        if (command.equals(FILE_START)) {

            text = textField.getText().toLowerCase();
            try {
                write();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            leftPanel.setVisible(false);
            state = 1;
            play();
            repaint();

        }

        else if (command.length() == 1 && state == 1) {
            letters(command);
        }
        else if (command.equals(SHOW_REPLAY)) {

            numBodyParts = 0;
            numGuesses = "";
            bottomPanel.setVisible(true);
            leftPanel.setVisible(true);

            state = 1;
            play();
            repaint();

        } else if (command.equals(FILE_STOP)) {
            state = 2;
            System.exit(-1);
        }
    }

    public void letters(String command) {

        System.out.println(command);

        if (phrase.contains(command.toLowerCase())) {
            for (int i = 0; i < randPhrase.length; i++) {
                if (command.toLowerCase().charAt(0) == randPhrase[i]) {
                    guesses[i] = command.toLowerCase().charAt(0);

                }

            }
        } else if (!phrase.contains(command.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Sorry " + command
                    + " is not part of the word");
            numBodyParts++;
        }

        numGuesses += command;
        if (numBodyParts < 6 && !winner()) {
            numGuesses += ", ";
        }
        else if (numBodyParts >= 6){
            numGuesses += " end game!";
        }
        repaint();
    }

    private static void play() {


        phrase = getword();

        randPhrase = phrase.toCharArray();

        guesses = new char[randPhrase.length];

        for (int i = 0; i < guesses.length; i++) {
            guesses[i] = '_';
        }

    }


    public static void main(String[] args) throws IOException {

        GUI hangman = new GUI();
        hangman.setVisible(true);

    }
}