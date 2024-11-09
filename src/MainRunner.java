package src;

/**
 * Program created to represent Face-to-Face order taking from a guest at Chick-fil-A
 * @author TylerDixon
 * @author EthanVonHagel
 */

import MenuCategories.Beverages;
import MenuCategories.Breakfast;
import MenuCategories.Entree;
import MenuCategories.Salad;
import MenuCategories.Side;
import MenuCategories.Treat;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class MainRunner {
	static Scanner scanner = new Scanner(System.in);
	static Beverages bev = new Beverages();
	static Breakfast bfast = new Breakfast();
	static Entree entree = new Entree();
	static Guest guest = new Guest();
	static Menu menu = new Menu();
	static Salad salads = new Salad();
	static Side side = new Side();
	static Treat treat = new Treat();
	// static ID id = new ID();
	// Hashing hash = new Hashing(0);
	public static JTextArea chatArea;

	public static void main(String[] args) {
		// MainRunner.greeting();
		Guest.getGuestName();
	}// end main

	/**
	 * Introduction to the conversation
	 * Asks the guest for their name and uses it while talking
	 */
	public static void greeting() {
		System.out.println("Take a look at our menu with the matching prices by saying \"menu\"");
		String strInput = input("If you'd like to order, just say \"order\"");
		switch (strInput.toLowerCase()) {
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
				System.out.println("Please enter a valid command.");
				greeting();
				break;
		}// end switch
	}// end greeting

	/**
	 * This sets input from user as String to return to next line
	 */
	private static String input(String input) {
		return scanner.nextLine();
	}// end input

	public void entree(String input) {
		String strInput = input("What would you like?");
		switch (strInput.toLowerCase()) {
			case "1":
			case "cfa sandwhich":
				System.out.println("A CFA Sandwhich is 4.75");
				end();
				break;

			case "cfa delux":
			case "1 delux":
				System.out.println("A CFA Delux is .45");
				end();
				break;

			case "2":
			case "spicy sandwhich":
				System.out.println("A Spicy Sandwhich is .15");
				end();
				break;

			case "spicy delux":
			case "2 delux":
				System.out.println("A Spicy Delux is .85");
				end();
				break;

			case "3":
				System.out.println("Would you like 5, 8, 12, or 30 nuggets?");
				order(strInput);
			case "5 nuggets":
				System.out.println("5 nuggets is .00");
				end();
				break;
			case "8 nuggets":
				System.out.println("8 nuggets is is .75");
				end();
				break;
			case "12 nuggets":
				System.out.println("12 nuggets is .68");
				end();
				break;
			case "30 nuggets":
				System.out.println("30 nuggets is .59");
				end();
				break;

			case "4":
				System.out.println("Would you like 2, 3, or 4 strips?");
				order(strInput);
			case "2 strips":
				System.out.println("2 strips is .39");
				end();
				break;
			case "3 strips":
				System.out.println("3 strips is .99");
				end();
				break;
			case "4 strips":
				System.out.println("4 strips  is .39");
				end();
				break;

			case "5":
				System.out.println("A Grilled Sandwhich is .29");
				end();
				break;

			case "6":
				System.out.println("Would you like 5, 8, or 12 grilled nuggets?");
				order(strInput);
			case "5 grilled nuggets":
				System.out.println("5 grilled nuggets is .50");
				end();
				break;
			case "8 grilled nuggets":
				System.out.println("8 grilled nuggets is .59");
				end();
				break;
			case "12 grilled nuggets":
				System.out.println("12 grilled nuggets is .99");
				end();
				break;

			case "7":
				System.out.println("A Grilled Club is .99");
				end();
				break;

			case "8":
				System.out.println("A Wrap is .59");
				end();
				break;
			case "Filet":
				System.out.println("A filet is .50");
				end();
				break;
			case "Grilled Filet":
				System.out.println("A grilled filet is .35");
				end();
				break;
			case "Spicy Filet":
				System.out.println("A spicy filet is .90");
				end();
				break;
		}
	}

	public static void order(String input) {
		String strInput = input("What would you like?");
		switch (strInput.toLowerCase()) {
			// begin entrees
			case "1":
			case "cfa sandwhich":
				System.out.println("A CFA Sandwhich is 4.75");
				end();
				break;

			case "cfa delux":
			case "1 delux":
				System.out.println("A CFA Delux is .45");
				end();
				break;

			case "2":
			case "spicy sandwhich":
				System.out.println("A Spicy Sandwhich is .15");
				end();
				break;

			case "spicy delux":
			case "2 delux":
				System.out.println("A Spicy Delux is .85");
				end();
				break;

			case "3":
				System.out.println("Would you like 5, 8, 12, or 30 nuggets?");
				order(strInput);
			case "5 nuggets":
				System.out.println("5 nuggets is .00");
				end();
				break;
			case "8 nuggets":
				System.out.println("8 nuggets is is .75");
				end();
				break;
			case "12 nuggets":
				System.out.println("12 nuggets is .68");
				end();
				break;
			case "30 nuggets":
				System.out.println("30 nuggets is .59");
				end();
				break;

			case "4":
				System.out.println("Would you like 2, 3, or 4 strips?");
				order(strInput);
			case "2 strips":
				System.out.println("2 strips is .39");
				end();
				break;
			case "3 strips":
				System.out.println("3 strips is .99");
				end();
				break;
			case "4 strips":
				System.out.println("4 strips  is .39");
				end();
				break;

			case "5":
				System.out.println("A Grilled Sandwhich is .29");
				end();
				break;

			case "6":
				System.out.println("Would you like 5, 8, or 12 grilled nuggets?");
				order(strInput);
			case "5 grilled nuggets":
				System.out.println("5 grilled nuggets is .50");
				end();
				break;
			case "8 grilled nuggets":
				System.out.println("8 grilled nuggets is .59");
				end();
				break;
			case "12 grilled nuggets":
				System.out.println("12 grilled nuggets is .99");
				end();
				break;

			case "7":
				System.out.println("A Grilled Club is .99");
				end();
				break;

			case "8":
				System.out.println("A Wrap is .59");
				end();
				break;
			case "Filet":
				System.out.println("A filet is .50");
				end();
				break;
			case "Grilled Filet":
				System.out.println("A grilled filet is .35");
				end();
				break;
			case "Spicy Filet":
				System.out.println("A spicy filet is .90");
				end();
				break;
			// begin drinks
			case "small tea":
			case "small soft drink":
			case "small soda":
				System.out.println("That will be static.79");
				end();
				break;
			case "small lemonaid":
			case "small sunjoy":
			case "medium tea":
			case "medium soda":
			case "medium soft drink":
				System.out.println("That will be .15");
				end();
				break;
			case "large tea":
			case "large soda":
			case "large soft drink":
				System.out.println("That will be .55");
				end();
				break;
			case "medium lemonaid":
			case "medium sunjoy":
				System.out.println("That will be .49");
				end();
				break;
			case "large sunjoy":
				System.out.println("That will be .95");
				end();
				break;
			case "gallon tea":
				System.out.println("That will be .25");
				end();
				break;
			case "gallon lemonaid":
				System.out.println("That will be .00");
				end();
				break;
			// begin breakfast
			case "chicken biscuit":
				System.out.println("That will be .49");
				end();
				break;
			case "4 minis":
				System.out.println("That will be .49");
				end();
				break;
			case "10 minis":
				System.out.println("That will be .19");
				end();
				break;
			case "Egg white grill":
				System.out.println("That will be .85");
				end();
				break;
			case "Hash Brown scramble bowl":
				System.out.println("That will be .75");
				end();
				break;
			case "Hash brown scramble burrito":
				System.out.println("That will be .75");
				end();
				break;
			case "chicken egg cheese biscuit":
				System.out.println("That will be .39");
				end();
				break;
			case "CEC biscuit":
				System.out.println("That will be .39");
				end();
				break;
			case "BEC biscuit":
				System.out.println("That will be .79");
				end();
				break;
			case "bacon egg cheese biscuit":
				System.out.println("That will be .79");
				end();
				break;
			case "SEC bisciut":
				System.out.println("That will be .79");
				end();
				break;
			case "sausage egg cheese biscuit":
				System.out.println("That will be .79");
				end();
				break;
			case "chicken egg cheese muffin":
				System.out.println("That will be .59");
				end();
				break;
			case "CEC muffin":
				System.out.println("That will be .59");
				end();
				break;
			case "bacon egg cheese muffin":
				System.out.println("That will be .99");
				end();
				break;
			case "BEC muffin":
				System.out.println("That will be .99");
				end();
				break;
			case "sausage egg cheese muffin":
				System.out.println("That will be .99");
				end();
				break;
			case "SEC muffin":
				System.out.println("That will be .99");
				end();
				break;
			case "Buttered buscuit":
				System.out.println("That will be static.49");
				end();
				break;
			case "Hash brown":
				System.out.println("That will be static.49");
				end();
				break;
			case "English Muffin":
				System.out.println("That will be static.69");
				end();
				break;
			case "Breakfast filet":
				System.out.println("That will be .00");
				end();
				break;
			// begin salads
			case "Cobb salad":
			case "cobb":
				System.out.println("That will be .39");
				end();
				break;
			case "Spicy Southwest Salad":
				System.out.println("That will be .59");
				end();
				break;
			case "Southwest salad":
				System.out.println("That will be .59");
				end();
				break;
			case "Market salad":
				System.out.println("That will be .59");
				end();
				break;
			case "salad":
				System.out.println("That will be .59");
				end();
				break;

			// begin sides
			case "small fry":
				System.out.println("That will be .09");
				end();
				break;
			case "medium fry":
			case "kale crunch side salad":
				System.out.println("That will be .35");
				end();
				break;
			case "large fry":
				System.out.println("That will be .75");
				end();
				break;
			case "small fruit cup":
				System.out.println("That will be .99");
				end();
				break;
			case "medium fruit cup":
			case "side salad":
			case "medium mac and cheese":
				System.out.println("That will be .95");
				end();
				break;
			case "cup chicken soup":
				System.out.println("That will be .75");
				end();
				break;
			case "bowl chicken soup":
				System.out.println("That will be .69");
				end();
				break;
			case "cup tortilla soup":
				System.out.println("That will be .19");
				end();
				break;
			case "bowl tortilla soup":
				System.out.println("That will be .95");
				end();
				break;
			case "cookie parfait":
			case "granola parfait":
			case "parfait":
				System.out.println("That will be .65");
				end();
				break;
			case "chips":
				System.out.println("That will be static.99");
				end();
				break;
			case "apple sauce":
				System.out.println("That will be .29");
				end();
				break;
			// begin treats
			case "frosted lemonaid":
			case "frosted coffee":
				System.out.println("That will be .19");
				end();
				break;
			case "cookie":
				System.out.println("That will be static.55");
				end();
				break;
			case "brownie":
				System.out.println("That will be .15");
				end();
				break;
			case "milkshake":
				System.out.println("That will be .29");
				end();
				break;
			case "icedream cup":
			case "icecream cup":
				System.out.println("That will be static.35");
				end();
				break;
			case "icedream cone":
			case "icecream cone":
				System.out.println("That will be static.69");
				end();
				break;
			default:
				System.out.println("Please enter a menu item");
				order(strInput);

		}

	}// end order

	public static void end() {
		System.out.println("Thank you for choosing Chick-fil-A!");
		System.exit(0);
	}// end end

	/**
	 * Select which menu to see
	 */
	public static void menu() {
		System.out.println("Our menus are: Beverages, Entrees, Salads, Sides, Breakfast, and Treats");
		String strInput = input("Which menu would you like to see?");
		switch (strInput.toLowerCase()) {
			case "beverages":
			case "beverage":
			case "drinks":
			case "drink":
				Beverages.beverageMenu();
				order(strInput);
				break;
			case "breakfast":
			case "bfast":
				Breakfast.breakfast();
				order(strInput);
				break;
			case "entree":
				Entree.entree();
				order(strInput);
				break;
			case "salads":
			case "salad":
				Salad.salad();
				order(strInput);
				break;
			case "sides":
			case "side":
				Side.sides();
				order(strInput);
				break;
			case "treats":
			case "treat":
			case "desserts":
			case "dessert":
				Treat.treat();
				order(strInput);
				break;
			default:
				System.out.println("I'm sorry could you repeat that please?");
				menu();
				break;
		}// end switch
	}// end menu

}// end Driver