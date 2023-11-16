
/**
 * @author TD
 * @author EVH
 */

import java.util.HashMap;
import java.util.Map;

public class Treats extends Driver{
	
	public static void main (String[] args) {
		Map<String, Double> dessert = new HashMap<String, Double>();
		dessert.put("Frosted Lemonaid", 4.19);
		dessert.put("Frosted Coffee", 4.19);
		dessert.put("Cookie", 1.55);
		dessert.put("Brownie", 2.15);
		dessert.put("Milkshake", 4.29);
		dessert.put("IceDream Cup", 1.35);
		dessert.put("IceDream Cone", 1.69);

		System.out.printf("Frosted Lemonaid\t $%.2f\n", dessert.get("Frosted Lemonaid"));
		System.out.printf("Frosted Coffee\t $%.2f\n", dessert.get("Frosted Coffee"));
		System.out.printf("Cookie\t $%.2f\n", dessert.get("Cookie"));
		System.out.printf("Brownie\t $%.2f\n", dessert.get("Brownie"));
		System.out.printf("Milkshake\t $%.2f\n", dessert.get("Milkshake"));
		System.out.printf("IceDream Cup\t $%.2f\n", dessert.get("IceDream Cup"));
		System.out.printf("IceDream Cone\t $%.2f\n", dessert.get("IceDream Cone"));
	}

}
