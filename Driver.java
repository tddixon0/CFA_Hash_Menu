/**
 * Program created to represent Face-to-Face order taking from a guest at Chick-fil-A
 * Program created to represent Face-to-Face order taking from a guest
 * @author TylerDixon
 * @author EthanVonHagel
 */

import java.io.*;
import java.util.*;

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
		String strInput = input("Do you have an ID? Enter it now:");
		switch(strInput.toLowerCase()) {
		case "06671687":
		case "00000000":
		case "0":
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
		System.out.println("What would you like?");
		
	}
	
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
			System.out.println();
				switch(strInput.toLowerCase()){
				case "menu":
				case "Menu":
					menu();
					break;
				case "order":
				case "Order":
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
			beverageMenu();
			menu();
			break;
		case "breakfast":
		case "bfast":
			breakfastMenu();
			menu();
			break;
		case "entree":
			entreeMenu(); 
			menu();
			break;
		case "salads":
		case "salad":
			saladMenu();
			menu();
			break;
		case "sides":
		case "side":
			sideMenu();
			menu();
			break;
		case "treats":
		case "treat":
		case "desserts":
		case "dessert":
			treatMenu();
			menu();
			break;
		default:
			System.out.println("I'm sorry could you repeat that please?");
			menu();
			break;
		}//end switch
		
	}//end menu
	
	private void treatMenu() {
		Map<String, Double> dessert = new HashMap<String, Double>();
		dessert.put("Frosted Lemonaid", 4.19);
		dessert.put("Frosted Coffee", 4.19);
		dessert.put("Cookie", 1.55);
		dessert.put("Brownie", 2.15);
		dessert.put("Milkshake", 4.29);
		dessert.put("IceDream Cup", 1.35);
		dessert.put("IceDream Cone", 1.69);
		
		System.out.printf("Frosted Lemonaid\t $%.2f\n", dessert.get("Frosted Lemonaid"));
		System.out.printf("Frosted Coffee\t $%.2f\n", dessert.get("Frosted Coffee"));
		System.out.printf("Cookie\t $%.2f\n", dessert.get("Cookie"));
		System.out.printf("Brownie\t $%.2f\n", dessert.get("Brownie"));
		System.out.printf("Milkshake\t $%.2f\n", dessert.get("Milkshake"));
		System.out.printf("IceDream Cup\t $%.2f\n", dessert.get("IceDream Cup"));
		System.out.printf("IceDream Cone\t $%.2f\n", dessert.get("IceDream Cone"));
	}//end treatMenu

	private void sideMenu() {
		Map<String, Double> side = new HashMap<String, Double>();
		side.put("Small Fry", 2.09);
		side.put("Medium Fry", 2.35);
		side.put("Large Fry", 2.75);
		side.put("Small Fruit Cup", 2.99);
		side.put("Medium Fruit Cup", 3.95);
		side.put("Side Salad", 3.95);
		side.put("Small Mac and Cheese", 3.15);
		side.put("Medium Mac and Cheese", 3.95);
		side.put("Cup Chicken Noode Soup", 3.75);
		side.put("Bowl Chicken Noodle Soup", 5.69);
		side.put("Cup Tortilla Soup", 5.19);
		side.put("Bowl Tortilla Soup", 7.95);
		side.put("Kale Crunch Side Salad", 2.35);
		side.put("Cookie Parfait", 4.65);
		side.put("Granola Parfait", 4.65);
		side.put("Chips", 1.99);
		side.put("Kids Apple Sauce", 2.29);
		
		System.out.printf("Small Fry\t $%.2f\n", side.get("Small Fry"));
		System.out.printf("Medium Fry\t $%.2f\n", side.get("Medium Fry"));
		System.out.printf("Large Fry\t $%.2f\n", side.get("Large Fry"));
		System.out.printf("Small Fruit Cup\t $%.2f\n", side.get("Small Fruit Cup"));
		System.out.printf("Medium Fruit Cup\t $%.2f\n", side.get("Medium Fruit Cup"));
		System.out.printf("Side Salad\t $%.2f\n", side.get("Side Salad"));
		System.out.printf("Small Mac and Cheese\t $%.2f\n", side.get("Small Mac and Cheese"));
		System.out.printf("Medium Mac and Cheese\t $%.2f\n", side.get("Medium Mac and Cheese"));
		System.out.printf("Cup Chicken Noode Soup\t $%.2f\n", side.get("Cup Chicken Noode Soup"));
		System.out.printf("Bowl Chicken Noodle Soup\t $%.2f\n", side.get("Bowl Chicken Noodle Soup"));
		System.out.printf("Cup Tortilla Soup\t $%.2f\n", side.get("Cup Tortilla Soup"));
		System.out.printf("Bowl Tortilla Soup\t $%.2f\n", side.get("Bowl Tortilla Soup"));
		System.out.printf("Kale Crunch Side Salad\t $%.2f\n", side.get("Kale Crunch Side Salad"));
		System.out.printf("Cookie Parfait\t $%.2f\n", side.get("Cookie Parfait"));
		System.out.printf("Granola Parfait\t $%.2f\n", side.get("Granola Parfait"));
		System.out.printf("Chips\t $%.2f\n", side.get("Chips"));
		System.out.printf("Kids Apple Sauce\t $%.2f\n", side.get("Kids Apple Sauce"));
	}//end sideMenu

	private void saladMenu() {
		Map<String, Double> salad = new HashMap<String, Double>();
		salad.put("Cobb Salad", 9.39);
		salad.put("Spicy Southwest Salad", 9.59);
		salad.put("Market Salad", 9.59);
		
		System.out.printf("Cobb Salad\t $%.2f\n", salad.get("Cobb Salad"));
		System.out.printf("Spicy Southwest Salad\t $%.2f\n", salad.get("Spicy Southwest Salad"));
		System.out.printf("Market Salad\t $%.2f\n", salad.get("Market Salad"));

	}//end saladMenu

	private void entreeMenu() {
		Map<String, Double> entree = new HashMap<String, Double>();
		entree.put("CFA Sandwhich", 4.75);
		entree.put("CFA Delux", 5.45);
		entree.put("Spicy Sandwhich", 5.15);
		entree.put("Spicy Delux", 5.85);
		entree.put("Grilled Sandwhich", 6.29);
		entree.put("Grilled Club", 7.99);
		entree.put("5 Nuggets", 3.00);
		entree.put("8 Nuggets", 4.75);
		entree.put("12 Nuggets", 6.65);
		entree.put("30 Nuggets", 16.59);
		entree.put("5 Grilled Nuggets", 3.50);
		entree.put("8 Grilled Nuggets", 5.59);
		entree.put("12 Grilled Nuggets", 7.99);
		entree.put("2 Strip", 3.39);
		entree.put("3 Strip", 4.99);
		entree.put("4 Strip", 6.39);
		entree.put("Wrap", 7.59);
		entree.put("Filet", 4.50);
		entree.put("Grilled Filet", 5.35);
		entree.put("Spicy Filet", 4.90);
		
		System.out.printf("CFA Sandwhich\t $%.2f\n", entree.get("CFA Sandwhich"));
		System.out.printf("CFA Delux\t $%.2f\n", entree.get("CFA Delux"));
		System.out.printf("Spicy Sandwhich\t $%.2f\n", entree.get("Spicy Sandwhich"));
		System.out.printf("Spicy Delux\t $%.2f\n", entree.get("Spicy Delux"));
		System.out.printf("Grilled Sandwhich\t $%.2f\n", entree.get("Grilled Sandwhich"));
		System.out.printf("Grilled Club\t $%.2f\n", entree.get("Grilled Club"));
		System.out.printf("5 Nuggets\t $%.2f\n", entree.get("5 Nuggets"));
		System.out.printf("8 Nuggets\t $%.2f\n", entree.get("8 Nuggets"));
		System.out.printf("12 Nuggets\t $%.2f\n", entree.get("12 Nuggets"));
		System.out.printf("30 Nuggets\t $%.2f\n", entree.get("30 Nuggets"));
		System.out.printf("5 Grilled Nuggets\t $%.2f\n", entree.get("5 Grilled Nuggets"));
		System.out.printf("8 Grilled Nuggets\t $%.2f\n", entree.get("8 Grilled Nuggets"));
		System.out.printf("12 Grilled Nuggets\t $%.2f\n", entree.get("12 Grilled Nuggets"));
		System.out.printf("2 Strip\t $%.2f\n", entree.get("2 Strip"));
		System.out.printf("3 Strip\t $%.2f\n", entree.get("3 Strip"));
		System.out.printf("4 Strip\t $%.2f\n", entree.get("4 Strip"));
		System.out.printf("Wrap\t $%.2f\n", entree.get("Wrap"));
		System.out.printf("Filet\t $%.2f\n", entree.get("Filet"));
		System.out.printf("Grilled Filet\t $%.2f\n", entree.get("Grilled Filet"));
		System.out.printf("Spicy Filet\t $%.2f\n", entree.get("Spicy Filet"));

	}//end entreeMenu

	private void beverageMenu() {
		Map<String, Double> bev = new HashMap<String, Double>();
		bev.put("Small Tea", 1.79);
		bev.put("Medium Tea", 2.15);
		bev.put("Large Tea", 2.55);
		bev.put("Small Lemonaid", 2.15);
		bev.put("Medium Lemonaid", 2.49);
		bev.put("Large Lemonaid", 2.95);
		bev.put("Small Sunjoy", 2.15);
		bev.put("Medium Sunjoy", 2.49);
		bev.put("Large Sunjoy", 2.95);
		bev.put("Small soft drink", 1.79);
		bev.put("Medium soft drink", 2.15);
		bev.put("Large soft drink", 2.55);
		bev.put("Gallon Tea", 6.25);
		bev.put("Gallon Lemonaid", 12.00);
		
		System.out.printf("Small Tea\t $%.2f\n", bev.get("Small Tea"));
		System.out.printf("Medium Tea\t $%.2f\n", bev.get("Medium Tea"));
		System.out.printf("Large Tea\t $%.2f\n", bev.get("Large Tea"));
		System.out.printf("Small Lemonaid\t $%.2f\n", bev.get("Small Lemonaid"));
		System.out.printf("Medium Lemonaid\t $%.2f\n", bev.get("Medium Lemonaid"));
		System.out.printf("Large Lemonaid\t $%.2f\n", bev.get("Large Lemonaid"));
		System.out.printf("Small Sunjoy\t $%.2f\n", bev.get("Small Sunjoy"));
		System.out.printf("Medium Sunjoy\t $%.2f\n", bev.get("Medium Sunjoy"));
		System.out.printf("Large Sunjoy\t $%.2f\n", bev.get("Large Sunjoy"));
		System.out.printf("Small Soft Drink\t $%.2f\n", bev.get("Small soft drink"));
		System.out.printf("Medium Soft Drink\t $%.2f\n", bev.get("Medium soft drink"));
		System.out.printf("Large Soft Drink\t $%.2f\n", bev.get("Large soft drink"));
		System.out.printf("Gallon of Tea\t $%.2f\n", bev.get("Gallon Tea"));
		System.out.printf("Gallon Lemonaid\t $%.2f\n", bev.get("Gallon Lemonaid"));
		
	}//end beverageMenu

	private void breakfastMenu() {
		Map<String, Double> bfast = new HashMap<String, Double>();
		bfast.put("Chicken Biscuit", 3.49);
		bfast.put("4 minis", 4.49);
		bfast.put("10 minis", 11.19);
		bfast.put("Egg White Grill", 4.85);
		bfast.put("Hash Brown Scramble Burrito", 4.75);
		bfast.put("Hash Brown Scramble Bowl", 4.75);
		bfast.put("Chicken Egg Cheese Biscuit", 4.39);
		bfast.put("Bacon Egg Cheese Buscuit", 3.79);
		bfast.put("Sausage Egg Cheese Buscuit", 3.79);
		bfast.put("Chicken Egg Cheese Muffin", 4.59);
		bfast.put("Bacon Egg Cheese Muffin", 3.99);
		bfast.put("Sausage Egg Cheese Muffin", 3.99);
		bfast.put("Buttered Biscuit", 1.49);
		bfast.put("English Muffin", 1.69);
		bfast.put("Hash Browns", 1.49);
		bfast.put("Breakfast Filet", 2.00);
		
		System.out.printf("Chicken Buscuit\t $%.2f\n", bfast.get("Chicken Biscuit"));
		System.out.printf("4 minis\t $%.2f\n", bfast.get("4 minis"));
		System.out.printf("10 minis\t $%.2f\n", bfast.get("10 minis"));
		System.out.printf("Egg White Grill\t $%.2f\n", bfast.get("Egg White Grill"));
		System.out.printf("Hash Brown Scramble Bowl\t $%.2f\n", bfast.get("Hash Brown Scramble Bowl"));
		System.out.printf("Hash Brown Scramble Burrito\t $%.2f\n", bfast.get("Hash Brown Scramble Burrito"));
		System.out.printf("Chicken Egg Cheese Biscuit\t $%.2f\n", bfast.get("Chicken Egg Cheese Biscuit"));
		System.out.printf("Bacon Egg Cheese Buscuit\t $%.2f\n", bfast.get("Bacon Egg Cheese Buscuit"));
		System.out.printf("Sausage Egg Cheese Buscuit\t $%.2f\n", bfast.get("Sausage Egg Cheese Buscuit"));
		System.out.printf("Chicken Egg Cheese Muffin\t $%.2f\n", bfast.get("Chicken Egg Cheese Muffin"));
		System.out.printf("Bacon Egg Cheese Muffin\t $%.2f\n", bfast.get("Bacon Egg Cheese Muffin"));
		System.out.printf("Sausage Egg Cheese Muffin\t $%.2f\n", bfast.get("Sausage Egg Cheese Muffin"));
		System.out.printf("Buttered Biscuit\t $%.2f\n", bfast.get("Buttered Biscuit"));
		System.out.printf("English Muffin\t $%.2f\n", bfast.get("English Muffin"));
		System.out.printf("Hash Browns\t $%.2f\n", bfast.get("Hash Browns"));
		System.out.printf("Breakfast Filet\t $%.2f\n", bfast.get("Breakfast Filet"));

	}//end breakfastMenu
	
}//end Driver
