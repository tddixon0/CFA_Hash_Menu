/**
 * Program created to represent Face-to-Face order taking from a guest at Chick-fil-A
 * Program created to represent Face-to-Face order taking from a guest
 * @author TylerDixon
 * @author EthanVonHagel
 */

import java.util.*;
import java.sql.*;

public class Driver {
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
	
	public static void main (String[] args) {
		Driver driver = new Driver();
		driver.id();
	}//end main
	
	/**
	 * This sets input from user as String to return to next line
	 * @param input
	 * @return
	 */
	private String input(String input) {
		System.out.println(input);
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
			System.out.println("User credentials accepted.");	
			System.out.println("Thank you for choosing Chick-fil-A!");
			greeting();
			break;
		default:
			System.out.println("Please enter a valid Employee ID");
			id();
			break;
		}//end switch
	}//end id
	
	public void order() {
		String strInput = input("What would you like?");
			switch(strInput.toLowerCase()) {
//begin entrees			
			case "1":
			case "cfa sandwhich":
				System.out.printf("A CFA Sandwhich is\t $%s%n", "4.75");
				end();
				break;
				
			case "cfa delux":
			case "1 delux":
				System.out.printf("A CFA Delux is\t $%s%n", "5.45");
				end();
				break;
				
			case "2":
			case "spicy sandwhich": 
				System.out.printf("A Spicy Sandwhich is\t $%s%n", "5.15");
				end();
				break;
				
			case "spicy delux":
			case "2 delux":
				System.out.printf("A Spicy Delux is\t $%s%n", "5.85");
				end();
				break;
				
			case "3":
				System.out.println("Would you like 5, 8, 12, or 30 nuggets?");
				order();
			case "5 nuggets":
				System.out.printf("5 nuggets is\t $%s%n", "3.00");
				end();
				break;
			case "8 nuggets":
				System.out.printf("8 nuggets is is\t $%s%n", "4.75");
				end();
				break;
			case "12 nuggets":
				System.out.printf("12 nuggets is\t $%s%n", "6.68");
				end();
				break;
			case "30 nuggets":
				System.out.printf("30 nuggets is\t $%s%n", "16.59");
				end();
				break;
				
			case "4":
				System.out.println("Would you like 2, 3, or 4 strips?");
				order();
			case "2 strips":
				System.out.printf("2 strips is\t $%s%n", "3.39");
				end();
				break;
			case "3 strips":
				System.out.printf("3 strips is\t $%s%n", "4.99");
				end();
				break;
			case "4 strips":
				System.out.printf("4 strips  is\t $%s%n", "6.39");
				end();
				break;
				
			case "5":
				System.out.printf("A Grilled Sandwhich is\t $%s%n", "6.29");
				end();
				break;
				
			case "6":
				System.out.println("Would you like 5, 8, or 12 grilled nuggets?");
				order();
			case "5 grilled nuggets":
				System.out.printf("5 grilled nuggets is\t $%s%n", "3.50");
				end();
				break;
			case "8 grilled nuggets":
				System.out.printf("8 grilled nuggets is\t $%s%n", "5.59");
				end();
				break;
			case "12 grilled nuggets":
				System.out.printf("12 grilled nuggets is\t $%s%n", "7.99");
				end();
				break;
				
			case "7":
				System.out.printf("A Grilled Club is\t $%s%n", "7.99");
				end();
				break;
				
			case "8":
				System.out.printf("A Wrap is\t $%s%n", "7.59");
				end();
				break;
			case "Filet":
				System.out.printf("A filet is\t $%s%n", "4.50");
				end();
				break;
			case "Grilled Filet":
				System.out.printf("A grilled filet is\t $%s%n", "5.35");
				end();
				break;
			case "Spicy Filet":
				System.out.printf("A spicy filet is\t $%s%n", "4.90");
				end();
				break;
//begin drinks
			case "small tea":
			case "small soft drink":
			case "small soda":
				System.out.printf("That will be\t $%s%n", "1.79");
				end();
				break;
			case "small lemonaid":
			case "small sunjoy":
			case "medium tea":
			case "medium soda":
			case "medium soft drink":
				System.out.printf("That will be\t $%s%n", "2.15");
				end();
				break;
			case "large tea":
			case "large soda":
			case "large soft drink":
				System.out.printf("That will be\t $%s%n", "2.55");
				end();
				break;
			case "medium lemonaid":
			case "medium sunjoy":
				System.out.printf("That will be\t $%s%n", "2.49");
				end();
				break;
			case "large sunjoy":
				System.out.printf("That will be\t $%s%n", "2.95");
				end();
				break;
			case "gallon tea":
				System.out.printf("That will be\t $%s%n", "6.25");
				end();
				break;
			case "gallon lemonaid":
				System.out.printf("That will be\t $%s%n", "12.00");
				end();
				break;
//begin breakfast
			case "chicken biscuit":
				System.out.printf("That will be\t $%s%n", "3.49");
				end();
				break;
			case "4 minis":
				System.out.printf("That will be\t $%s%n", "4.49");
				end();
				break;
			case "10 minis":
				System.out.printf("That will be\t $%s%n", "11.19");
				end();
				break;	
			case "Egg white grill":
				System.out.printf("That will be\t $%s%n", "4.85");
				end();
				break;
			case "Hash Brown scramble bowl":
				System.out.printf("That will be\t $%s%n", "4.75");
				end();
				break;
			case "Hash brown scramble burrito":
				System.out.printf("That will be\t $%s%n", "4.75");
				end();
				break;
			case "chicken egg cheese biscuit":
				System.out.printf("That will be\t $%s%n", "4.39");
				end();
				break;
			case "CEC biscuit":
				System.out.printf("That will be\t $%s%n", "4.39");
				end();
				break;
			case "BEC biscuit":
				System.out.printf("That will be\t $%s%n", "4.79");
				end();
				break;
			case "bacon egg cheese biscuit":
				System.out.printf("That will be\t $%s%n", "4.79");
				end();
				break;
			case "SEC bisciut":
				System.out.printf("That will be\t $%s%n", "4.79");
				end();
				break;
			case "sausage egg cheese biscuit":
				System.out.printf("That will be\t $%s%n", "4.79");
				end();
				break;
			case "chicken egg cheese muffin":
				System.out.printf("That will be\t $%s%n", "4.59");
				end();
				break;
			case "CEC muffin":
				System.out.printf("That will be\t $%s%n", "4.59");
				end();
				break;
			case "bacon egg cheese muffin":
				System.out.printf("That will be\t $%s%n", "3.99");
				end();
				break;
			case "BEC muffin":
				System.out.printf("That will be\t $%s%n", "3.99");
				end();
				break;
			case "sausage egg cheese muffin":
				System.out.printf("That will be\t $%s%n", "3.99");
				end();
				break;
			case "SEC muffin":
				System.out.printf("That will be\t $%s%n", "3.99");
				end();
				break;
			case "Buttered buscuit":
				System.out.printf("That will be\t $%s%n", "1.49");
				end();
				break;
			case "Hash brown":
				System.out.printf("That will be\t $%s%n", "1.49");
				end();
				break;
			case "English Muffin":
				System.out.printf("That will be\t $%s%n", "1.69");
				end();
				break;
			case "Breakfast filet":
				System.out.printf("That will be\t $%s%n", "2.00");
				end();
				break;
//begin salads
			case "Cobb salad":
			case "cobb":
				System.out.printf("That will be\t $%s%n", "9.39");
				end();
				break;
			case "Spicy Southwest Salad":
				System.out.printf("That will be\t $%s%n", "9.59");
				end();
				break;
			case "Southwest salad":
				System.out.printf("That will be\t $%s%n", "9.59");
				end();
				break;
			case "Market salad":
				System.out.printf("That will be\t $%s%n", "9.59");
				end();
				break;
			case "salad":
				System.out.printf("That will be\t $%s%n", "9.59");
				end();
				break;
			
//begin sides
			case "small fry":
				System.out.printf("That will be\t $%s%n", "2.09");
				end();
				break;
			case "medium fry":
			case "kale crunch side salad":
				System.out.printf("That will be\t $%s%n", "2.35");
				end();
				break;
			case "large fry":
				System.out.printf("That will be\t $%s%n", "2.75");
				end();
				break;
			case "small fruit cup":
				System.out.printf("That will be\t $%s%n", "2.99");
				end();
				break;
			case "medium fruit cup":
			case "side salad":
			case "medium mac and cheese":
				System.out.printf("That will be\t $%s%n", "3.95");
				end();
				break;
			case "cup chicken soup":
				System.out.printf("That will be\t $%s%n", "3.75");
				end();
				break;
			case "bowl chicken soup":
				System.out.printf("That will be\t $%s%n", "5.69");
				end();
				break;
			case "cup tortilla soup":
				System.out.printf("That will be\t $%s%n", "5.19");
				end();
				break;
			case "bowl tortilla soup":
				System.out.printf("That will be\t $%s%n", "7.95");
				end();
				break;
			case "cookie parfait":
			case "granola parfait":
			case "parfait":
				System.out.printf("That will be\t $%s%n", "4.65");
				end();
				break;
			case "chips":
				System.out.printf("That will be\t $%s%n", "1.99");
				end();
				break;
			case "apple sauce":
				System.out.printf("That will be\t $%s%n", "2.29");
				end();
				break;
//begin treats
			case "frosted lemonaid":
			case "frosted coffee":
				System.out.printf("That will be\t $%s%n", "5.19");
				end();
				break;
			case "cookie":
				System.out.printf("That will be\t $%s%n", "1.55");
				end();
				break;
			case "brownie":
				System.out.printf("That will be\t $%s%n", "2.15");
				end();
				break;
			case "milkshake":
				System.out.printf("That will be\t $%s%n", "4.29");
				end();
				break;
			case "icedream cup":
			case "icecream cup":
				System.out.printf("That will be\t $%s%n", "1.35");
				end();
				break;
			case "icedream cone":
			case "icecream cone":
				System.out.printf("That will be\t $%s%n", "1.69");
				end();
				break;
			default:
				System.out.println("Please enter a menu item");
				order();
				
			}
		
		}//end order
		
	public void end() {
		System.out.println("Thank you for choosing Chick-fil-A!");
		System.exit(0);
	}//end end
	
	/**
	 * Introduction to the conversation
	 * Asks the guest for their name and uses it while talking
	 */
	public void greeting() {
		Guest newGuest;
		System.out.println("May I have a name for the order?");
		newGuest = new Guest(scanner.nextLine());
		System.out.println("Hello " + newGuest + ", How may I serve you today?");
		System.out.println("Take a look at our menu with the matching prices by saying \"menu\"");
			String strInput = input("If you'd like to order, just say \"order\"");
				switch(strInput.toLowerCase()){
				case "menu":
				case "Menu":
					menu();
					break;
				case "order":
				case "Order":
				case "o":
					order();
					break;
				default:
					System.out.println("Please enter a valid command.");
					greeting();
					break;
			}//end switch		
	}//end greeting

	/**
	 * Select which menu to see
	 */
	public void menu() {
		System.out.println("Our menus are: Beverages, Entrees, Salads, Sides, Breakfast, and Treats");
		String strInput = input("Which menu would you like to see?");
		switch(strInput.toLowerCase()) {
		case "beverages":
		case "beverage":
		case "drinks":
		case "drink":
			Beverages.main(null);
//			beverageMenu();
			order();
			break;
		case "breakfast":
		case "bfast":
			Breakfast.main(null);
			order();
			break;
		case "entree":
			Entrees.main(null);
			order();
			break;
		case "salads":
		case "salad":
			Salads.main(null);
			order();
			break;
		case "sides":
		case "side":
			Sides.main(null);
			order();
			break;
		case "treats":
		case "treat":
		case "desserts":
		case "dessert":
			Treats.main(null);
			order();
			break;
		default:
			System.out.println("I'm sorry could you repeat that please?");
			menu();
			break;
		}//end switch
	}//end menu
	
}//end Driver
