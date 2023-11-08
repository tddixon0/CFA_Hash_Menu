/**
 * @author TD
 * @author EVH
 */
import java.util.HashMap;
import java.util.Map;

public class Breakfast extends Driver{

	public static final Double CB = 3.49;

	@SuppressWarnings("unused")
	public static void main (String args[]) {
		Map<String, Double> bfast = new HashMap<String, Double>();
		bfast.put("Chicken Buscuit", 3.49);
			double CB = bfast.get("Chicken Buscuit");
		bfast.put("4 minis", 4.49);
			double Minis = bfast.get("4 minis");
		bfast.put("10 minis", 11.19);
			double Ten = bfast.get("10 minis");
		bfast.put("Egg White Grill", 4.85);
			double EWG = bfast.get("Egg White Grill");
		bfast.put("Hash Brown Scramble Burrito", 4.75);
			double HBSBurr = bfast.get("Hash Brown Scramble Burrito");
		bfast.put("Hash Brown Scramble Bowl", 4.75);
			double HBSBowl = bfast.get("Hash Brown Scramble Bowl");
		bfast.put("Chicken Egg Cheese Biscuit", 4.39);
			double CECBis = bfast.get("Chicken Egg Cheese Biscuit");
		bfast.put("Bacon Egg Cheese Buscuit", 3.79);
			double BECBis = bfast.get("Bacon Egg Cheese Buscuit");
		bfast.put("Sausage Egg Cheese Buscuit", 3.79);
			double SECBis = bfast.get("Sausage Egg Cheese Buscuit");
		bfast.put("Chicken Egg Cheese Muffin", 4.59);
			double CECMuff = bfast.get("Chicken Egg Cheese Muffin");
		bfast.put("Bacon Egg Cheese Muffin", 3.99);
			double BECMuff = bfast.get("Bacon Egg Cheese Muffin");
		bfast.put("Sausage Egg Cheese Muffin", 3.99);
			double SECMuff = bfast.get("Sausage Egg Cheese Muffin");
		bfast.put("Buttered Biscuit", 1.49);
			double BB = bfast.get("Buttered Buscuit");
		bfast.put("English Muffin", 1.69);
			double EM = bfast.get("English Muffin");
		bfast.put("Hash Browns", 1.49);
			double HB = bfast.get("Hash Browns");
		bfast.put("Breakfast Filet", 2.00);
			double BFil = bfast.get("Breakfast Filet");
			
			double CB1 = entree.get("CFA Sandwhich");
			System.out.printf("CFA sandwhich is $%.2f\n", CB);

	}//end main
	
	public double get(String price) {
		return 0;
	}
}//end Breakfast
