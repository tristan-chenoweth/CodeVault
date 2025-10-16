package Java.simpleWindow;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleWindow {
     public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple Window Example");

        // Set the size of the window that is opened
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton (exit button)
        JButton exitButton = new JButton("Exit");

        // Set the size of the button
        exitButton.setSize(new Dimension(100, 50));

        // Add an ActionListener to the exit button
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the window when the button is clicked
                System.exit(0);
            }
        });

        // Create Hi button. 
        JButton printHiButton = new JButton("Hi!");

        // Set button size
        printHiButton.setSize(new Dimension(100, 50));

        // Add an ActionListener to the exit button
        printHiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the window when the button is clicked
                System.out.println("Hello World!");             
            }
        });

        // Set the position of the button using layout manager (FlowLayout in this case)
        frame.setLayout(new FlowLayout(0,0,0)); // Use FlowLayout for simplicity

        // Create a JTextArea to display console output
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Use a monospaced font

        // Create a JScrollPane to scroll through console output if necessary
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Redirect standard output and error streams to the text area
        PrintStream outputStream = new PrintStream(new ConsoleOutputStream(textArea));
        System.setOut(outputStream);
        System.setErr(outputStream);

        // Make the window visible
        frame.setVisible(true);
        
        // Example console output
        System.out.println("Hello, this is a console message.");
        System.err.println("This is an error message.");

        // Add the exit button to the content pane of the window 
        // Order matters in context for how buttons are loaded to the window
        frame.getContentPane().add(printHiButton,null,0);
        frame.getContentPane().add(exitButton,null);

        // Set the default close operation (what happens when the close button is clicked)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}

class ConsoleOutputStream extends OutputStream {
    private JTextArea textArea;

    public ConsoleOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
        // Append the character to the text area
        textArea.append(String.valueOf((char) b));
        // Scroll to the end of the text area
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}
