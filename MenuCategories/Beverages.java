package MenuCategories;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Beverages {

	public static void beverageMenu() {
		Map<String, Double> beverageMenu = new HashMap<String, Double>();
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

		StringBuilder sb = new StringBuilder();
		for (Entry<String, Double> entry : beverageMenu.entrySet()) {
			sb.append(entry.getKey())
					.append(":  ---  $")
					.append(String.format("%.2f", entry.getValue()))
					.append("\n");
		}
		String result = sb.toString();
		System.out.println(result);
	}

	// This was the old format that was sys out for every item. bad practice
	// System.out.printf("Small Tea\t $%.2f\n", beverageMenu.get("Small Tea"));
}
