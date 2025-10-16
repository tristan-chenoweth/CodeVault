package Java.numberGuessingGameGUI;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.lang.Boolean;

public class numberGameGUI {
    private int numRandom;
    private int remainingGuesses;
    private JTextField guessField;
    private JTextArea outputArea;
    private JButton checkButton;
    private JButton restartButton;
    private JButton exitButton;
    private JRadioButton withHintsRadio;
    private JRadioButton withoutHintsRadio;
    private ButtonGroup optionGroup;
    private Boolean hintCheck;

    public numberGameGUI() {
        JFrame frame = new JFrame("Number Guessing Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel promptLabel = new JLabel("Enter your guess:");
        guessField = new JTextField(10);
        checkButton = new JButton("Check");
        restartButton = new JButton("Restart");
        exitButton = new JButton("Exit");

        inputPanel.add(promptLabel);
        inputPanel.add(guessField);
        inputPanel.add(checkButton);
        inputPanel.add(exitButton);
        inputPanel.add(restartButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new FlowLayout());

        withHintsRadio = new JRadioButton("Play with hints");
        withoutHintsRadio = new JRadioButton("Play without hints");


        withHintsRadio.setSelected(true);

        optionGroup = new ButtonGroup();
        optionGroup.add(withHintsRadio);
        optionGroup.add(withoutHintsRadio);

        optionsPanel.add(withHintsRadio);
        optionsPanel.add(withoutHintsRadio);

        frame.add(optionsPanel, BorderLayout.CENTER);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // Initialize the game
        startNewGame();

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess(hintCheck);
            }
        });

        restartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        withHintsRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });

        withoutHintsRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });

        frame.setVisible(true);
    }

    private void startNewGame() {
        numRandom = generateRandomNumber();
        remainingGuesses = 3;
        outputArea.setText("Welcome to the Number Guessing Game!\nYou get 3 chances to guess a number from 1 to 100.\n");
        guessField.setText("");
        guessField.setEnabled(true);
        checkButton.setEnabled(true);
        restartButton.setEnabled(false);
        exitButton.setEnabled(true);
        withHintsRadio.setEnabled(true);
        withoutHintsRadio.setEnabled(true);

        if (withHintsRadio.isSelected()) {
            outputArea.append("Playing with hints.\n");
            hintCheck = true;
        }
        else if (withoutHintsRadio.isSelected()) {
            outputArea.append("Playing without hints.\n");
            hintCheck = false;
        }
        else {
            withHintsRadio.setEnabled(false);
            withoutHintsRadio.setEnabled(false);
        }
    }

    private Boolean checkGuess(Boolean hintCheck) {
        try {
            // System.out.println(numRandom);
            int guess = Integer.parseInt(guessField.getText());
            remainingGuesses--;

            if (hintCheck == false) {
                if (guess == numRandom) {
                    outputArea.append("ou guessed it right!\n" + guess + " was the correct number!\n");
                    gameOver();
                }
                else {
                    if(guess > 100 || guess < 0){
                    outputArea.append("Please select a number between 0 and 100.\n");
                    remainingGuesses++;
                    }
                    else {
                        outputArea.append("Sorry, " + guess + " is not correct...\n");
        
                        if (remainingGuesses == 0) {
                            outputArea.append("The correct number was " + numRandom + ". Game over.\n");
                            gameOver();
                        }
                        else {
                            outputArea.append("You have " + remainingGuesses + " guess(es) remaining.\n");
                        }
                    }
                }
            }
            else {
                if (guess == numRandom) {
                    outputArea.append("You guessed it right!\n" + guess + " was the correct number!\n");
                    gameOver();
                }
                else {
                    if(guess > 100 || guess < 0){
                    outputArea.append("Please select a number between 0 and 100.\n");
                    remainingGuesses++;
                    }
                    else {
                        outputArea.append("Sorry, " + guess + " is not correct...\n");
        
                        if (guess < numRandom) {
                            outputArea.append("The number is higher.\n");
                        }
                        else {
                            outputArea.append("The number is lower.\n");
                        }
        
                        if (remainingGuesses == 0) {
                            outputArea.append("The correct number was " + numRandom + ". Game over.\n");
                            gameOver();
                        }
                        else {
                            outputArea.append("You have " + remainingGuesses + " guess(es) remaining.\n");
                        }
                    }
                }
            }
        }
        catch (NumberFormatException ex) {
            outputArea.append("Please enter a valid number.\n");
        }
        guessField.setText("");
        return hintCheck;
    }

    private void gameOver() {
        guessField.setEnabled(false);
        checkButton.setEnabled(false);
        restartButton.setEnabled(true);
        withHintsRadio.setEnabled(true);
        withoutHintsRadio.setEnabled(true);
    }

    private int generateRandomNumber() {
        Random generator = new Random();
        return generator.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new numberGameGUI();
            }
        });
    }
}