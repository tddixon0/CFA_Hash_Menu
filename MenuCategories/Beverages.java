package MenuCategories;

import java.util.HashMap;
import java.util.Map;

public class Beverages {

	public static Map<String, Object> beverage() {
		Map<String, Object> beverageMenu = new HashMap<String, Object>();
		beverageMenu.put("Small Tea", 1.79);
		beverageMenu.put("Medium Tea", 2.15);
		beverageMenu.put("Large Tea", 2.55);
		beverageMenu.put("Small Lemonaid", 2.15);
		beverageMenu.put("Medium Lemonaid", 2.49);
		beverageMenu.put("Large Lemonaid", 2.95);
		beverageMenu.put("Small Sunjoy", 2.15);
		beverageMenu.put("Medium Sunjoy", 2.49);
		beverageMenu.put("Large Sunjoy", 2.95);
		beverageMenu.put("Small soft drink", 1.79);
		beverageMenu.put("Medium soft drink", 2.15);
		beverageMenu.put("Large soft drink", 2.55);
		beverageMenu.put("Gallon Tea", 6.25);
		beverageMenu.put("Gallon Lemonaid", 12.00);

		for (Map.Entry<String, Object> e : beverageMenu.entrySet())
			System.out.println("" + e.getKey() + ":    " + e.getValue());

		// System.out.printf("Small Tea\t $%.2f\n", beverageMenu.get("Small Tea"));
		// System.out.printf("Medium Tea\t $%.2f\n", beverageMenu.get("Medium Tea"));
		// System.out.printf("Large Tea\t $%.2f\n", beverageMenu.get("Large Tea"));
		// System.out.printf("Small Lemonaid\t $%.2f\n", beverageMenu.get("Small
		// Lemonaid"));
		// System.out.printf("Medium Lemonaid\t $%.2f\n", beverageMenu.get("Medium
		// Lemonaid"));
		// System.out.printf("Large Lemonaid\t $%.2f\n", beverageMenu.get("Large
		// Lemonaid"));
		// System.out.printf("Small Sunjoy\t $%.2f\n", beverageMenu.get("Small
		// Sunjoy"));
		// System.out.printf("Medium Sunjoy\t $%.2f\n", beverageMenu.get("Medium
		// Sunjoy"));
		// System.out.printf("Large Sunjoy\t $%.2f\n", beverageMenu.get("Large
		// Sunjoy"));
		// System.out.printf("Small Soft Drink\t $%.2f\n", beverageMenu.get("Small soft
		// drink"));
		// System.out.printf("Medium Soft Drink\t $%.2f\n", beverageMenu.get("Medium
		// soft drink"));
		// System.out.printf("Large Soft Drink\t $%.2f\n", beverageMenu.get("Large soft
		// drink"));
		// System.out.printf("Gallon of Tea\t $%.2f\n", beverageMenu.get("Gallon Tea"));
		// System.out.printf("Gallon Lemonaid\t $%.2f\n", beverageMenu.get("Gallon
		// Lemonaid"));

		return beverageMenu;
	}// end main

}
