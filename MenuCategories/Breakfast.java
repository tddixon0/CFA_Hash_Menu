package MenuCategories;

import java.util.HashMap;
import java.util.Map;

import src.Driver;

public class Breakfast extends Driver{

	public static final Double CB = 3.49;

		public Map<String, Double> breakfast() {
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
		
		System.out.printf("Chicken Buscuit\t $%.2f\n", bfast.get("Chicken Biscuit"));
		System.out.printf("4 minis\t $%.2f\n", bfast.get("4 minis"));
		System.out.printf("10 minis\t $%.2f\n", bfast.get("10 minis"));
		System.out.printf("Egg White Grill\t $%.2f\n", bfast.get("Egg White Grill"));
		System.out.printf("Hash Brown Scramble Bowl\t $%.2f\n", bfast.get("Hash Brown Scramble Bowl"));
		System.out.printf("Hash Brown Scramble Burrito\t $%.2f\n", bfast.get("Hash Brown Scramble Burrito"));
		System.out.printf("Chicken Egg Cheese Biscuit\t $%.2f\n", bfast.get("Chicken Egg Cheese Biscuit"));
		System.out.printf("Bacon Egg Cheese Biscuit\t $%.2f\n", bfast.get("Bacon Egg Cheese Buscuit"));
		System.out.printf("Sausage Egg Cheese Biscuit\t $%.2f\n", bfast.get("Sausage Egg Cheese Buscuit"));
		System.out.printf("Chicken Egg Cheese Muffin\t $%.2f\n", bfast.get("Chicken Egg Cheese Muffin"));
		System.out.printf("Bacon Egg Cheese Muffin\t $%.2f\n", bfast.get("Bacon Egg Cheese Muffin"));
		System.out.printf("Sausage Egg Cheese Muffin\t $%.2f\n", bfast.get("Sausage Egg Cheese Muffin"));
		System.out.printf("Buttered Biscuit\t $%.2f\n", bfast.get("Buttered Biscuit"));
		System.out.printf("English Muffin\t $%.2f\n", bfast.get("English Muffin"));
		System.out.printf("Hash Browns\t $%.2f\n", bfast.get("Hash Browns"));
		System.out.printf("Breakfast Filet\t $%.2f\n", bfast.get("Breakfast Filet"));
		
		return bfast;

	}
	public double get(String price) {
		return 0;
	}
  }
