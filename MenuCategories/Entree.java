package MenuCategories;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Entree {

	public static void entree() {
		Map<String, Double> entreeMap = new HashMap<String, Double>();
		entreeMap.put("CFA Sandwhich", 4.75);
		entreeMap.put("CFA Delux", 5.45);
		entreeMap.put("Spicy Sandwhich", 5.15);
		entreeMap.put("Spicy Delux", 5.85);
		entreeMap.put("Grilled Sandwhich", 6.29);
		entreeMap.put("Grilled Club", 7.99);
		entreeMap.put("5 Nuggets", 3.00);
		entreeMap.put("8 Nuggets", 4.75);
		entreeMap.put("12 Nuggets", 6.65);
		entreeMap.put("30 Nuggets", 16.59);
		entreeMap.put("5 Grilled Nuggets", 3.50);
		entreeMap.put("8 Grilled Nuggets", 5.59);
		entreeMap.put("12 Grilled Nuggets", 7.99);
		entreeMap.put("2 Strip", 3.39);
		entreeMap.put("3 Strip", 4.99);
		entreeMap.put("4 Strip", 6.39);
		entreeMap.put("Wrap", 7.59);
		entreeMap.put("Filet", 4.50);
		entreeMap.put("Grilled Filet", 5.35);
		entreeMap.put("Spicy Filet", 4.90);

		StringBuilder sb = new StringBuilder();
		for (Entry<String, Double> entry : entreeMap.entrySet()) {
			sb.append(entry.getKey())
					.append(":  ---  $")
					.append(String.format("%.2f", entry.getValue()))
					.append("\n");
		}
		String result = sb.toString();
		System.out.println(result);
	}
}// end entreeMaps
