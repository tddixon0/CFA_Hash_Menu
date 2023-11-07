/**
 * Program created to represent Face-to-Face order taking from a guest
 * @author Tyler Dixon
 * @author Ethan Von Hagel
 */
package menu.cfa;

import java.util.*;

public class Driver {
	//test
	static Scanner scanner = new Scanner(System.in);
	static Beverages bev = new Beverages();
	static Breakfast bfast = new Breakfast();
	static Entrees entree = new Entrees();
	static Guest guest = new Guest(null);
	static Menu menu = new Menu();
	static Salads salads = new Salads();
	static Sides side = new Sides();
	static Treats treat = new Treats();
//	Hashing hash = new Hashing(0);
	
	public static void main (String[] args) {
		Driver driver = new Driver();
		driver.greeting();
//		entree.main(args);
	}
	
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
	 * Introduction to the conversation
	 * Asks the guest for their name and uses it while talking
	 */
	public void greeting() {
		Guest newGuest;
		System.out.println("Thank you for choosing Chick-fil-A LaVale.");
		System.out.println("May I have a name for the order?");
		newGuest = new Guest(scanner.nextLine());
		System.out.println("Hello " + newGuest + ", How may I serve you today?");
		System.out.println("Take a look at our menu with the matching price");
		//using Hashmap, of course
		System.out.println("Just type \"menu\"");
		menu();
	}//end greeting
	
	/**
	 * Select which menu to see
	 */
	public void menu() {
		String strInput = input("Which menu would you like to see?");
		System.out.println("Choose between: Beverages, Breakfast, Entrees, Salads, Sides, and Treats");
		switch(strInput.toLowerCase()) {
		case "beverages":
		case "beverage":
		case "drinks":
		case "drink":
			beverageMenu();
			menu();
			break;
		case "breakfast":
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
		System.out.printf("Frosted Lemonaid\t $%.2f\n", bfast.get("Frosted Lemonaid"));
		System.out.printf("Frosted Coffee\t $%.2f\n", bfast.get("Frosted Coffee"));
		System.out.printf("Cookie\t $%.2f\n", bfast.get("Cookie"));
		System.out.printf("Brownie\t $%.2f\n", bfast.get("Brownie"));
		System.out.printf("Milkshake\t $%.2f\n", bfast.get("Milkshake"));
		System.out.printf("IceDream Cup\t $%.2f\n", bfast.get("IceDream Cup"));
		System.out.printf("IceDream Cone\t $%.2f\n", bfast.get("IceDream Cone"));

		
	}

	private void sideMenu() {
		System.out.printf("Small Fry\t $%.2f\n", bfast.get("Small Fry"));
		System.out.printf("Medium Fry\t $%.2f\n", bfast.get("Medium Fry"));
		System.out.printf("Large Fry\t $%.2f\n", bfast.get("Large Fry"));
		System.out.printf("Small Fruit Cup\t $%.2f\n", bfast.get("Small Fruit Cup"));
		System.out.printf("Medium Fruit Cup\t $%.2f\n", bfast.get("Medium Fruit Cup"));
		System.out.printf("Side Salad\t $%.2f\n", bfast.get("Side Salad"));
		System.out.printf("Small Mac and Cheese\t $%.2f\n", bfast.get("Small Mac and Cheese"));
		System.out.printf("Medium Mac and Cheese\t $%.2f\n", bfast.get("Medium Mac and Cheese"));
		System.out.printf("Cup Chicken Noode Soup\t $%.2f\n", bfast.get("Cup Chicken Noode Soup"));
		System.out.printf("Bowl Chicken Noodle Soup\t $%.2f\n", bfast.get("Bowl Chicken Noodle Soup"));
		System.out.printf("Cup Tortilla Soup\t $%.2f\n", bfast.get("Cup Tortilla Soup"));
		System.out.printf("Bowl Tortilla Soup\t $%.2f\n", bfast.get("Bowl Tortilla Soup"));
		System.out.printf("Kale Crunch Side Salad\t $%.2f\n", bfast.get("Kale Crunch Side Salad"));
		System.out.printf("Cookie Parfait\t $%.2f\n", bfast.get("Cookie Parfait"));
		System.out.printf("Granola Parfait\t $%.2f\n", bfast.get("Granola Parfait"));
		System.out.printf("Chips\t $%.2f\n", bfast.get("Chips"));
		System.out.printf("Kids Apple Sauce\t $%.2f\n", bfast.get("Kids Apple Sauce"));
		
	}

	private void saladMenu() {
		System.out.printf("Cobb Salad\t $%.2f\n", bfast.get("Cobb Salad"));
		System.out.printf("Spicy Southwest Salad\t $%.2f\n", bfast.get("Spicy Southwest Salad"));
		System.out.printf("Market Salad\t $%.2f\n", bfast.get("Market Salad"));

	}//end saladMenu

	private void entreeMenu() {
		System.out.printf("CFA Sandwhich\t $%.2f\n", bfast.get("CFA Sandwhich"));
		System.out.printf("CFA Delux\t $%.2f\n", bfast.get("CFA Delu"));
		System.out.printf("Spicy Sandwhich\t $%.2f\n", bfast.get("Spicy Sandwhich"));
		System.out.printf("Spicy Delux\t $%.2f\n", bfast.get("Spicy Delux"));
		System.out.printf("Grilled Sandwhich\t $%.2f\n", bfast.get("Grilled Sandwhich"));
		System.out.printf("Grilled Club\t $%.2f\n", bfast.get("Grilled Club"));
		System.out.printf("5 Nuggets\t $%.2f\n", bfast.get("5 Nuggets"));
		System.out.printf("8 Nuggets\t $%.2f\n", bfast.get("8 Nuggets"));
		System.out.printf("12 Nuggets\t $%.2f\n", bfast.get("12 Nuggets"));
		System.out.printf("30 Nuggets\t $%.2f\n", bfast.get("30 Nuggets"));
		System.out.printf("5 Grilled Nuggets\t $%.2f\n", bfast.get("5 Grilled Nuggets"));
		System.out.printf("8 Grilled Nuggets\t $%.2f\n", bfast.get("8 Grilled Nuggets"));
		System.out.printf("12 Grilled Nuggets\t $%.2f\n", bfast.get("12 Grilled Nuggets"));
		System.out.printf("2 Strip\t $%.2f\n", bfast.get("2 Strip"));
		System.out.printf("3 Strip\t $%.2f\n", bfast.get("3 Strip"));
		System.out.printf("4 Strip\t $%.2f\n", bfast.get("4 Strip"));
		System.out.printf("Wrap\t $%.2f\n", bfast.get("Wrap"));
		System.out.printf("Filet\t $%.2f\n", bfast.get("Filet"));
		System.out.printf("Grilled Filet\t $%.2f\n", bfast.get("Grilled Filet"));
		System.out.printf("Spicy Filet\t $%.2f\n", bfast.get("Spicy Filet"));

	}//end entreeMenu

	private void beverageMenu() {
		System.out.printf("Small Tea\t $%.2f\n", bfast.get("Small Tea"));
		System.out.printf("Medium Tea\t $%.2f\n", bfast.get("Medium Tea"));
		System.out.printf("Large Tea\t $%.2f\n", bfast.get("Large Tea"));
		System.out.printf("Small Lemonaid\t $%.2f\n", bfast.get("Small Lemonaid"));
		System.out.printf("Medium Lemonaid\t $%.2f\n", bfast.get("Medium Lemonaid"));
		System.out.printf("Large Lemonaid\t $%.2f\n", bfast.get("Large Lemonaid"));
		System.out.printf("Small Sunjoy\t $%.2f\n", bfast.get("Small Sunjoy"));
		System.out.printf("Medium Sunjoy\t $%.2f\n", bfast.get("Medium Sunjoy"));
		System.out.printf("Large Sunjoy\t $%.2f\n", bfast.get("Large Sunjoy"));
		System.out.printf("Small Soft Drink\t $%.2f\n", bfast.get("Small Soft Drink"));
		System.out.printf("Medium Soft Drink\t $%.2f\n", bfast.get("Medium Soft Drink"));
		System.out.printf("Large Soft Drink\t $%.2f\n", bfast.get("Large Soft Drink"));
		System.out.printf("Gallon of Tea\t $%.2f\n", bfast.get("Gallon of Tea"));
		System.out.printf("Gallon Lemonaid\t $%.2f\n", bfast.get("Gallon Lemonaid"));
		
	}//end beverageMenu

	private void breakfastMenu() {
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
