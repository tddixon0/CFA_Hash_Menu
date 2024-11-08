package MenuCategories;

/**
 * @author TD
 * @author EVH
 */

import java.util.HashMap;
import java.util.Map;

import src.Driver;

public class Sides extends Driver{
	
	public static void main (String[] args) {
		Map<String, Double> side = new HashMap<String, Double>();
		side.put("Small Fry", 2.09);
		side.put("Medium Fry", 2.35);
		side.put("Large Fry", 2.75);
		side.put("Small Fruit Cup", 2.99);
		side.put("Medium Fruit Cup", 3.95);
		side.put("Side Salad", 3.95);
		side.put("Small Mac and Cheese", 3.15);
		side.put("Medium Mac and Cheese", 3.95);
		side.put("Cup Chicken Noodle Soup", 3.75);
		side.put("Bowl Chicken Noodle Soup", 5.69);
		side.put("Cup Tortilla Soup", 5.19);
		side.put("Bowl Tortilla Soup", 7.95);
		side.put("Kale Crunch Side Salad", 2.35);
		side.put("Cookie Parfait", 4.65);
		side.put("Granola Parfait", 4.65);
		side.put("Chips", 1.99);
		side.put("Kids Apple Sauce", 2.29);

		System.out.printf("Small Fry\t $%.2f\n", side.get("Small Fry"));
		System.out.printf("Medium Fry\t $%.2f\n", side.get("Medium Fry"));
		System.out.printf("Large Fry\t $%.2f\n", side.get("Large Fry"));
		System.out.printf("Small Fruit Cup\t $%.2f\n", side.get("Small Fruit Cup"));
		System.out.printf("Medium Fruit Cup\t $%.2f\n", side.get("Medium Fruit Cup"));
		System.out.printf("Side Salad\t $%.2f\n", side.get("Side Salad"));
		System.out.printf("Small Mac and Cheese\t $%.2f\n", side.get("Small Mac and Cheese"));
		System.out.printf("Medium Mac and Cheese\t $%.2f\n", side.get("Medium Mac and Cheese"));
		System.out.printf("Cup Chicken Noode Soup\t $%.2f\n", side.get("Cup Chicken Noode Soup"));
		System.out.printf("Bowl Chicken Noodle Soup\t $%.2f\n", side.get("Bowl Chicken Noodle Soup"));
		System.out.printf("Cup Tortilla Soup\t $%.2f\n", side.get("Cup Tortilla Soup"));
		System.out.printf("Bowl Tortilla Soup\t $%.2f\n", side.get("Bowl Tortilla Soup"));
		System.out.printf("Kale Crunch Side Salad\t $%.2f\n", side.get("Kale Crunch Side Salad"));
		System.out.printf("Cookie Parfait\t $%.2f\n", side.get("Cookie Parfait"));
		System.out.printf("Granola Parfait\t $%.2f\n", side.get("Granola Parfait"));
		System.out.printf("Chips\t $%.2f\n", side.get("Chips"));
		System.out.printf("Kids Apple Sauce\t $%.2f\n", side.get("Kids Apple Sauce"));
	}//end main

}//end Sides
