package MenuCategories;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Breakfast {

	public static void breakfast() {
		Map<String, Double> bfast = new HashMap<String, Double>();
		bfast.put("Chicken Biscuit", 3.49);
		bfast.put("4 minis", 4.49);
		bfast.put("10 minis", 11.19);
		bfast.put("Egg White Grill", 4.85);
		bfast.put("Hash Brown Scramble Burrito", 4.75);
		bfast.put("Hash Brown Scramble Bowl", 4.75);
		bfast.put("Chicken Egg Cheese Biscuit", 4.39);
		bfast.put("Bacon Egg Cheese Biscuit", 3.79);
		bfast.put("Sausage Egg Cheese Biscuit", 3.79);
		bfast.put("Chicken Egg Cheese Muffin", 4.59);
		bfast.put("Bacon Egg Cheese Muffin", 3.99);
		bfast.put("Sausage Egg Cheese Muffin", 3.99);
		bfast.put("Buttered Biscuit", 1.49);
		bfast.put("English Muffin", 1.69);
		bfast.put("Hash Browns", 1.49);
		bfast.put("Breakfast Filet", 2.00);

		StringBuilder sb = new StringBuilder();
		for (Entry<String, Double> entry : bfast.entrySet()) {
			sb.append(entry.getKey())
					.append(":  ---  $")
					.append(String.format("%.2f", entry.getValue()))
					.append("\n");
		}
		String result = sb.toString();
		System.out.println(result);
	}

}
