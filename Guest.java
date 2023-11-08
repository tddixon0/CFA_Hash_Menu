
/**
 * Gets customers name who is placing the order
 * @author TD
 * @author EVH
 */
public class Guest {
	private String guestName;
	
	Guest(String name) {
		this.guestName = name;
	}//end Guest method
	public String getGuestName() {
		return guestName;
	}//end getGuestName
	
	/**
	 * Overrides toString to print out proper name of Guest
	 * instead of something like "ClassName@33jds9dkBLAH"
	 */
	public String toString() {
		return guestName;
	}//end toString
}//end Guest class
