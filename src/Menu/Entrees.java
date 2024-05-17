package src.Menu;

import java.util.HashMap;
import java.util.Map;
//Map<K,V>
// K = The type of keys maintained by the map
// V = The type of mapped values

import src.Driver;

public class Entrees extends Driver{
	
	public static void main (String[] args) {
		//using generics & wrapper type
		Map<String, Double> entree = new HashMap<String, Double>();
			entree.put("CFA Sandwhich", 4.75);
			entree.put("CFA Delux", 5.45);
			entree.put("Spicy Sandwhich", 5.15);
			entree.put("Spicy Delux", 5.85);
			entree.put("Grilled Sandwhich", 6.29);
			entree.put("Grilled Club", 7.99);
			entree.put("5 Nuggets", 3.00);
			entree.put("8 Nuggets", 4.75);
			entree.put("12 Nuggets", 6.65);
			entree.put("30 Nuggets", 16.59);
			entree.put("5 Grilled Nuggets", 3.50);
			entree.put("8 Grilled Nuggets", 5.59);
			entree.put("12 Grilled Nuggets", 7.99);
			entree.put("2 Strip", 3.39);
			entree.put("3 Strip", 4.99);
			entree.put("4 Strip", 6.39);
			entree.put("Wrap", 7.59);
			entree.put("Filet", 4.50);
			entree.put("Grilled Filet", 5.35);
			entree.put("Spicy Filet", 4.90);

			System.out.printf("CFA Sandwhich\t $%.2f\n", entree.get("CFA Sandwhich"));
			System.out.printf("CFA Delux\t $%.2f\n", entree.get("CFA Delux"));
			System.out.printf("Spicy Sandwhich\t $%.2f\n", entree.get("Spicy Sandwhich"));
			System.out.printf("Spicy Delux\t $%.2f\n", entree.get("Spicy Delux"));
			System.out.printf("Grilled Sandwhich\t $%.2f\n", entree.get("Grilled Sandwhich"));
			System.out.printf("Grilled Club\t $%.2f\n", entree.get("Grilled Club"));
			System.out.printf("5 Nuggets\t $%.2f\n", entree.get("5 Nuggets"));
			System.out.printf("8 Nuggets\t $%.2f\n", entree.get("8 Nuggets"));
			System.out.printf("12 Nuggets\t $%.2f\n", entree.get("12 Nuggets"));
			System.out.printf("30 Nuggets\t $%.2f\n", entree.get("30 Nuggets"));
			System.out.printf("5 Grilled Nuggets\t $%.2f\n", entree.get("5 Grilled Nuggets"));
			System.out.printf("8 Grilled Nuggets\t $%.2f\n", entree.get("8 Grilled Nuggets"));
			System.out.printf("12 Grilled Nuggets\t $%.2f\n", entree.get("12 Grilled Nuggets"));
			System.out.printf("2 Strip\t $%.2f\n", entree.get("2 Strip"));
			System.out.printf("3 Strip\t $%.2f\n", entree.get("3 Strip"));
			System.out.printf("4 Strip\t $%.2f\n", entree.get("4 Strip"));
			System.out.printf("Wrap\t $%.2f\n", entree.get("Wrap"));
			System.out.printf("Filet\t $%.2f\n", entree.get("Filet"));
			System.out.printf("Grilled Filet\t $%.2f\n", entree.get("Grilled Filet"));
			System.out.printf("Spicy Filet\t $%.2f\n", entree.get("Spicy Filet"));
		
	}
	public void entreePrice() {
		
	}
	double get(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void put(String string, double d) {
		// TODO Auto-generated method stub
		
	}
}//end Entrees
