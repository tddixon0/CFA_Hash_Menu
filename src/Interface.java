package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Interface {
    private JFrame frame;
    private JTextArea chatArea;
    private JTextField inputField;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Interface();
            }
        });
    }// end main

    public Interface() {

        /**
         * main frame
         */
        frame = new JFrame("Chat Box");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * text area
         */
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setWrapStyleWord(true);
        chatArea.setLineWrap(true);

        /**
         * scroll
         */
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        /**
         * User input
         */
        inputField = new JTextField(0);

        /**
         * Send button
         */
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Message();
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        /**
         * Prompt
         */
        chatArea.append("Welcome to the CFATwo!\n");
        chatArea.append("Are you an employee or guest?.\n");

        frame.setVisible(true);
    }// end public interface2

    private void Message() {
        String message = inputField.getText();
        if (!message.isEmpty()) {
            chatArea.append("You: " + message + "\n");
            inputField.setText("");

            UserInput(message);
            // entree(message);
        }
    }// end sendMessage

    private void UserInput(String input) {
        if (input.equalsIgnoreCase("help")) {
            chatArea.append("Chat Box Help:\n");
            chatArea.append("1. Type 'hello' to greet.\n");
            chatArea.append("2. Type 'bye' to exit.\n");
            // Add more commands and responses as needed
        } else if (input.equalsIgnoreCase("hello")) {
            chatArea.append("Chat Box: Hello there!\n");
        } else if (input.equalsIgnoreCase("bye")) {
            chatArea.append("Chat Box: Goodbye!\n");
            // You can exit the application or perform other actions here
        } else {
            chatArea.append("Chat Box: I didn't understand that. Type 'help' for assistance.\n");
        }
    }// end UserInput

    public void end() {
        System.out.println("Thank you for choosing Chick-fil-A!");
        System.exit(0);
    }// end end
}// end Interface2
