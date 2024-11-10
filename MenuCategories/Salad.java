package MenuCategories;

/**
 * @author TD
 * @author EVH
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Salad {

	public static void salad() {
		Map<String, Double> saladMenu = new HashMap<String, Double>();
		saladMenu.put("Cobb Salad", 9.39);
		saladMenu.put("Spicy Southwest Salad", 9.59);
		saladMenu.put("Market Salad", 9.59);

		StringBuilder sb = new StringBuilder();
		for (Entry<String, Double> entry : saladMenu.entrySet()) {
			sb.append(entry.getKey())
					.append(":  ---  $")
					.append(String.format("%.2f", entry.getValue()))
					.append("\n");
		}
		String result = sb.toString();
		System.out.println(result);
	}// end main

}// end Salads
