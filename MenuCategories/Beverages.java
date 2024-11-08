package MenuCategories;

import java.util.HashMap;
import java.util.Map;

import src.Driver;

public class Beverages extends Driver{
	
	public static void main (String [] args) {
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
	
	}//end main
	
}
