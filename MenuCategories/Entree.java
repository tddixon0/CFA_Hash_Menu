package MenuCategories;

import java.util.HashMap;
import java.util.Map;

public class Entree{
	
	public static Map<String, Object> entree() {
		Map<String, Object> entreeMap = new HashMap<String, Object>();
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

			System.out.printf("CFA Sandwhich\t $%.2f\n", entreeMap.get("CFA Sandwhich"));
			System.out.printf("CFA Delux\t $%.2f\n", entreeMap.get("CFA Delux"));
			System.out.printf("Spicy Sandwhich\t $%.2f\n", entreeMap.get("Spicy Sandwhich"));
			System.out.printf("Spicy Delux\t $%.2f\n", entreeMap.get("Spicy Delux"));
			System.out.printf("Grilled Sandwhich\t $%.2f\n", entreeMap.get("Grilled Sandwhich"));
			System.out.printf("Grilled Club\t $%.2f\n", entreeMap.get("Grilled Club"));
			System.out.printf("5 Nuggets\t $%.2f\n", entreeMap.get("5 Nuggets"));
			System.out.printf("8 Nuggets\t $%.2f\n", entreeMap.get("8 Nuggets"));
			System.out.printf("12 Nuggets\t $%.2f\n", entreeMap.get("12 Nuggets"));
			System.out.printf("30 Nuggets\t $%.2f\n", entreeMap.get("30 Nuggets"));
			System.out.printf("5 Grilled Nuggets\t $%.2f\n", entreeMap.get("5 Grilled Nuggets"));
			System.out.printf("8 Grilled Nuggets\t $%.2f\n", entreeMap.get("8 Grilled Nuggets"));
			System.out.printf("12 Grilled Nuggets\t $%.2f\n", entreeMap.get("12 Grilled Nuggets"));
			System.out.printf("2 Strip\t $%.2f\n", entreeMap.get("2 Strip"));
			System.out.printf("3 Strip\t $%.2f\n", entreeMap.get("3 Strip"));
			System.out.printf("4 Strip\t $%.2f\n", entreeMap.get("4 Strip"));
			System.out.printf("Wrap\t $%.2f\n", entreeMap.get("Wrap"));
			System.out.printf("Filet\t $%.2f\n", entreeMap.get("Filet"));
			System.out.printf("Grilled Filet\t $%.2f\n", entreeMap.get("Grilled Filet"));
			System.out.printf("Spicy Filet\t $%.2f\n", entreeMap.get("Spicy Filet"));
		
			return entreeMap;
	}
}//end entreeMaps
