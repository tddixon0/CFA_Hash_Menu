package src;
/**
 * Program created to represent Face-to-Face order taking from a guest at Chick-fil-A
 * Program created to represent Face-to-Face order taking from a guest
 * @author TylerDixon
 * @author EthanVonHagel
 */

import javax.swing.*;

import src.Menu.Beverages;
import src.Menu.Breakfast;
import src.Menu.Entrees;
import src.Menu.Salads;
import src.Menu.Sides;
import src.Menu.Treats;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MainRunner {
	static Scanner scanner = new Scanner(System.in);
	static Beverages bev = new Beverages();
	static Breakfast bfast = new Breakfast();
	static Entrees entree = new Entrees();
	static Guest guest = new Guest(null);
	static Menu menu = new Menu();
	static Salads salads = new Salads();
	static Sides side = new Sides();
	static Treats treat = new Treats();
//	static ID id = new ID();
//	Hashing hash = new Hashing(0); 
	private JFrame frame;
    private JTextArea chatArea;
    private JTextField inputField;
    
	
	/**
	 * ------------------------------------------------------
	 * @param args
	 * @return 
	 */
	
public void Interface2() {
    	
    	/**
    	 * main frame
    	 */
        frame = new JFrame("CFATwo");
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
        inputField = new JTextField(2);

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
    }//end public interface2
	
private void Message() {
    String message = inputField.getText();
    if (!message.isEmpty()) {
        chatArea.append("You: " + message + "\n");
        inputField.setText("");

        UserInput(message);
        entree(message);
        order(message);
        
    }
}//end sendMessage

private void UserInput(String input) {
    if (input.equalsIgnoreCase("help")) {
        chatArea.append("Chat Box Help:\n");
        chatArea.append("1. Type 'hello' to greet.\n");
        chatArea.append("2. Type 'bye' to exit.\n");
        // Add more commands and responses as needed
    } else if (input.equalsIgnoreCase("hello")) {
        chatArea.append("CFATwo: Hello there!\n");
    } else if (input.equalsIgnoreCase("bye")) {
        chatArea.append("CFATwo: Goodbye!\n");
        // You can exit the application or perform other actions here
    } else {
        chatArea.append("CFATwo: I didn't understand that. Type 'help' for assistance.\n");
    }
}//end UserInput


	/**
	 * ------------------------------------------------------------------
	 * @param args
	 */

	public static void main (String[] args) {
		MainRunner driver = new MainRunner();
		driver.id();
		driver.Interface2();
	}//end main

	/**
	 * This sets input from user as String to return to next line
	 * @param input
	 * @return
	 */
	private String input(String input) {
		chatArea.append(input);
		return scanner.nextLine();
	}//end input

	/**
	 * This will verify if the user is an employee
	 */
	private void id() {
		String strInput = input("Do you have an ID? If not, enter \"Guest\":");
		switch(strInput.toLowerCase()) {
		case "1687":
		case "2023":
		case "0":
		case "Guest":
		case "guest":
			chatArea.append("User credentials accepted.");	
			chatArea.append("Thank you for choosing Chick-fil-A!");
			greeting();
			break;
		default:
			chatArea.append("Please enter a valid Employee ID");
			id();
			break;
		}//end switch
	}//end id
	
	public void entree(String input) {
		String strInput = input("What would you like?");
		switch(strInput.toLowerCase()) {
		case "1":
		case "cfa sandwhich":
			chatArea.append("A CFA Sandwhich is 4.75");
			end();
			break;

		case "cfa delux":
		case "1 delux":
			chatArea.append("A CFA Delux is $5.45");
			end();
			break;

		case "2":
		case "spicy sandwhich": 
			chatArea.append("A Spicy Sandwhich is $5.15");
			end();
			break;

		case "spicy delux":
		case "2 delux":
			chatArea.append("A Spicy Delux is $5.85");
			end();
			break;

		case "3":
			chatArea.append("Would you like 5, 8, 12, or 30 nuggets?");
			order(strInput);
		case "5 nuggets":
			chatArea.append("5 nuggets is $3.00");
			end();
			break;
		case "8 nuggets":
			chatArea.append("8 nuggets is is $4.75");
			end();
			break;
		case "12 nuggets":
			chatArea.append("12 nuggets is $6.68");
			end();
			break;
		case "30 nuggets":
			chatArea.append("30 nuggets is $16.59");
			end();
			break;

		case "4":
			chatArea.append("Would you like 2, 3, or 4 strips?");
			order(strInput);
		case "2 strips":
			chatArea.append("2 strips is $3.39");
			end();
			break;
		case "3 strips":
			chatArea.append("3 strips is $4.99");
			end();
			break;
		case "4 strips":
			chatArea.append("4 strips  is $6.39");
			end();
			break;

		case "5":
			chatArea.append("A Grilled Sandwhich is $6.29");
			end();
			break;

		case "6":
			chatArea.append("Would you like 5, 8, or 12 grilled nuggets?");
			order(strInput);
		case "5 grilled nuggets":
			chatArea.append("5 grilled nuggets is $3.50");
			end();
			break;
		case "8 grilled nuggets":
			chatArea.append("8 grilled nuggets is $5.59");
			end();
			break;
		case "12 grilled nuggets":
			chatArea.append("12 grilled nuggets is $7.99");
			end();
			break;

		case "7":
			chatArea.append("A Grilled Club is $7.99");
			end();
			break;

		case "8":
			chatArea.append("A Wrap is $7.59");
			end();
			break;
		case "Filet":
			chatArea.append("A filet is $4.50");
			end();
			break;
		case "Grilled Filet":
			chatArea.append("A grilled filet is $5.35");
			end();
			break;
		case "Spicy Filet":
			chatArea.append("A spicy filet is $4.90");
			end();
			break;
		}
	}

	public void order(String input) {
		String strInput = input("What would you like?");
			switch(strInput.toLowerCase()) {
//begin entrees			
			case "1":
			case "cfa sandwhich":
				chatArea.append("A CFA Sandwhich is 4.75");
				end();
				break;

			case "cfa delux":
			case "1 delux":
				chatArea.append("A CFA Delux is $5.45");
				end();
				break;

			case "2":
			case "spicy sandwhich": 
				chatArea.append("A Spicy Sandwhich is $5.15");
				end();
				break;

			case "spicy delux":
			case "2 delux":
				chatArea.append("A Spicy Delux is $5.85");
				end();
				break;

			case "3":
				chatArea.append("Would you like 5, 8, 12, or 30 nuggets?");
				order(strInput);
			case "5 nuggets":
				chatArea.append("5 nuggets is $3.00");
				end();
				break;
			case "8 nuggets":
				chatArea.append("8 nuggets is is $4.75");
				end();
				break;
			case "12 nuggets":
				chatArea.append("12 nuggets is $6.68");
				end();
				break;
			case "30 nuggets":
				chatArea.append("30 nuggets is $16.59");
				end();
				break;

			case "4":
				chatArea.append("Would you like 2, 3, or 4 strips?");
				order(strInput);
			case "2 strips":
				chatArea.append("2 strips is $3.39");
				end();
				break;
			case "3 strips":
				chatArea.append("3 strips is $4.99");
				end();
				break;
			case "4 strips":
				chatArea.append("4 strips  is $6.39");
				end();
				break;

			case "5":
				chatArea.append("A Grilled Sandwhich is $6.29");
				end();
				break;

			case "6":
				chatArea.append("Would you like 5, 8, or 12 grilled nuggets?");
				order(strInput);
			case "5 grilled nuggets":
				chatArea.append("5 grilled nuggets is $3.50");
				end();
				break;
			case "8 grilled nuggets":
				chatArea.append("8 grilled nuggets is $5.59");
				end();
				break;
			case "12 grilled nuggets":
				chatArea.append("12 grilled nuggets is $7.99");
				end();
				break;

			case "7":
				chatArea.append("A Grilled Club is $7.99");
				end();
				break;

			case "8":
				chatArea.append("A Wrap is $7.59");
				end();
				break;
			case "Filet":
				chatArea.append("A filet is $4.50");
				end();
				break;
			case "Grilled Filet":
				chatArea.append("A grilled filet is $5.35");
				end();
				break;
			case "Spicy Filet":
				chatArea.append("A spicy filet is $4.90");
				end();
				break;
//begin drinks
			case "small tea":
			case "small soft drink":
			case "small soda":
				chatArea.append("That will be $1.79");
				end();
				break;
			case "small lemonaid":
			case "small sunjoy":
			case "medium tea":
			case "medium soda":
			case "medium soft drink":
				chatArea.append("That will be $2.15");
				end();
				break;
			case "large tea":
			case "large soda":
			case "large soft drink":
				chatArea.append("That will be $2.55");
				end();
				break;
			case "medium lemonaid":
			case "medium sunjoy":
				chatArea.append("That will be $2.49");
				end();
				break;
			case "large sunjoy":
				chatArea.append("That will be $2.95");
				end();
				break;
			case "gallon tea":
				chatArea.append("That will be $6.25");
				end();
				break;
			case "gallon lemonaid":
				chatArea.append("That will be $12.00");
				end();
				break;
//begin breakfast
			case "chicken biscuit":
				chatArea.append("That will be $3.49");
				end();
				break;
			case "4 minis":
				chatArea.append("That will be $4.49");
				end();
				break;
			case "10 minis":
				chatArea.append("That will be $11.19");
				end();
				break;	
			case "Egg white grill":
				chatArea.append("That will be $4.85");
				end();
				break;
			case "Hash Brown scramble bowl":
				chatArea.append("That will be $4.75");
				end();
				break;
			case "Hash brown scramble burrito":
				chatArea.append("That will be $4.75");
				end();
				break;
			case "chicken egg cheese biscuit":
				chatArea.append("That will be $4.39");
				end();
				break;
			case "CEC biscuit":
				chatArea.append("That will be $4.39");
				end();
				break;
			case "BEC biscuit":
				chatArea.append("That will be $4.79");
				end();
				break;
			case "bacon egg cheese biscuit":
				chatArea.append("That will be $4.79");
				end();
				break;
			case "SEC bisciut":
				chatArea.append("That will be $4.79");
				end();
				break;
			case "sausage egg cheese biscuit":
				chatArea.append("That will be $4.79");
				end();
				break;
			case "chicken egg cheese muffin":
				chatArea.append("That will be $4.59");
				end();
				break;
			case "CEC muffin":
				chatArea.append("That will be $4.59");
				end();
				break;
			case "bacon egg cheese muffin":
				chatArea.append("That will be $3.99");
				end();
				break;
			case "BEC muffin":
				chatArea.append("That will be $3.99");
				end();
				break;
			case "sausage egg cheese muffin":
				chatArea.append("That will be $3.99");
				end();
				break;
			case "SEC muffin":
				chatArea.append("That will be $3.99");
				end();
				break;
			case "Buttered buscuit":
				chatArea.append("That will be $1.49");
				end();
				break;
			case "Hash brown":
				chatArea.append("That will be $1.49");
				end();
				break;
			case "English Muffin":
				chatArea.append("That will be $1.69");
				end();
				break;
			case "Breakfast filet":
				chatArea.append("That will be $2.00");
				end();
				break;
//begin salads
			case "Cobb salad":
			case "cobb":
				chatArea.append("That will be $9.39");
				end();
				break;
			case "Spicy Southwest Salad":
				chatArea.append("That will be $9.59");
				end();
				break;
			case "Southwest salad":
				chatArea.append("That will be $9.59");
				end();
				break;
			case "Market salad":
				chatArea.append("That will be $9.59");
				end();
				break;
			case "salad":
				chatArea.append("That will be $9.59");
				end();
				break;

//begin sides
			case "small fry":
				chatArea.append("That will be $2.09");
				end();
				break;
			case "medium fry":
			case "kale crunch side salad":
				chatArea.append("That will be $2.35");
				end();
				break;
			case "large fry":
				chatArea.append("That will be $2.75");
				end();
				break;
			case "small fruit cup":
				chatArea.append("That will be $2.99");
				end();
				break;
			case "medium fruit cup":
			case "side salad":
			case "medium mac and cheese":
				chatArea.append("That will be $3.95");
				end();
				break;
			case "cup chicken soup":
				chatArea.append("That will be $3.75");
				end();
				break;
			case "bowl chicken soup":
				chatArea.append("That will be $5.69");
				end();
				break;
			case "cup tortilla soup":
				chatArea.append("That will be $5.19");
				end();
				break;
			case "bowl tortilla soup":
				chatArea.append("That will be $7.95");
				end();
				break;
			case "cookie parfait":
			case "granola parfait":
			case "parfait":
				chatArea.append("That will be $4.65");
				end();
				break;
			case "chips":
				chatArea.append("That will be $1.99");
				end();
				break;
			case "apple sauce":
				chatArea.append("That will be $2.29");
				end();
				break;
//begin treats
			case "frosted lemonaid":
			case "frosted coffee":
				chatArea.append("That will be $5.19");
				end();
				break;
			case "cookie":
				chatArea.append("That will be $1.55");
				end();
				break;
			case "brownie":
				chatArea.append("That will be $2.15");
				end();
				break;
			case "milkshake":
				chatArea.append("That will be $4.29");
				end();
				break;
			case "icedream cup":
			case "icecream cup":
				chatArea.append("That will be $1.35");
				end();
				break;
			case "icedream cone":
			case "icecream cone":
				chatArea.append("That will be $1.69");
				end();
				break;
			default:
				chatArea.append("Please enter a menu item");
				order(strInput);

			}

		}//end order

	public void end() {
		chatArea.append("Thank you for choosing Chick-fil-A!");
		System.exit(0);
	}//end end

	/**
	 * Introduction to the conversation
	 * Asks the guest for their name and uses it while talking
	 */
	public void greeting() {
		Guest newGuest;
		chatArea.append("May I have a name for the order?");
		newGuest = new Guest(scanner.nextLine());
		chatArea.append("Hello " + newGuest + ", How may I serve you today?");
		chatArea.append("Take a look at our menu with the matching prices by saying \"menu\"");
			String strInput = input("If you'd like to order, just say \"order\"");
				switch(strInput.toLowerCase()){
				case "menu":
				case "Menu":
					menu();
					break;
				case "order":
				case "Order":
				case "o":
					order(strInput);
					break;
				default:
					chatArea.append("Please enter a valid command.");
					greeting();
					break;
			}//end switch		
	}//end greeting

	/**
	 * Select which menu to see
	 */
	public void menu() {
		chatArea.append("Our menus are: Beverages, Entrees, Salads, Sides, Breakfast, and Treats");
		String strInput = input("Which menu would you like to see?");
		switch(strInput.toLowerCase()) {
		case "beverages":
		case "beverage":
		case "drinks":
		case "drink":
			Beverages.main(null);
//			beverageMenu();
			order(strInput);
			break;
		case "breakfast":
		case "bfast":
			Breakfast.main(null);
			order(strInput);
			break;
		case "entree":
			Entrees.main(null);
			order(strInput);
			break;
		case "salads":
		case "salad":
			Salads.main(null);
			order(strInput);
			break;
		case "sides":
		case "side":
			Sides.main(null);
			order(strInput);
			break;
		case "treats":
		case "treat":
		case "desserts":
		case "dessert":
			Treats.main(null);
			order(strInput);
			break;
		default:
			chatArea.append("I'm sorry could you repeat that please?");
			menu();
			break;
		}//end switch
	}//end menu

}//end Driver