package menu.cfa;

import java.util.HashMap;
import java.util.Map;
//Map<K,V>
// K = The type of keys maintained by the map
// V = The type of mapped values

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

//		System.out.println(entree.get("Wrap"));
		double CFAsand = entree.get("CFA Sandwhich");
		System.out.printf("CFA sandwhich is $%.2f\n", CFAsand);
		
	}
	public void entreePrice() {
		
	}
	double get(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}//end Entrees
