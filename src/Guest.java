package src;

import java.util.Scanner;

/**
 * Gets customers name who is placing the order
 * 
 * @author TD
 * @author EVH
 */
public class Guest {
	public String guestName;
	static Scanner scanner = new Scanner(System.in);

	void guest(String name) {
		this.guestName = name;
	}// end Guest method

	public static void getGuestName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("May I have a name for the order?");
		String newGuestName = scanner.nextLine();
		System.out.println("Hello " + newGuestName + ", How may I serve you today?");
	}// end getGuestName

	private static void id() {
		String strInput = input("Do you have an ID? If not, enter \"Guest\":");
		switch (strInput.toLowerCase()) {
			case "1687":
			case "2023":
			case "0":
			case "Guest":
			case "guest":
				System.out.println("User credentials accepted.");
				System.out.println("Thank you for choosing Chick-fil-A!");
				break;
			default:
				System.out.println("Please enter a valid Employee ID");
				id();
				break;
		}// end switch
	}// end id

	/**
	 * This sets input from user as String to return to next line
	 */
	private static String input(String input) {
		return scanner.nextLine();
	}// end input

	/**
	 * Overrides toString to print out proper name of Guest
	 * instead of something like "ClassName@33jds9dkBLAH"
	 */
	public String toString() {
		return guestName;
	}// end toString
}// end Guest class