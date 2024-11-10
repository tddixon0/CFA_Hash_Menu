package MenuCategories;

/**
 * @author TD
 * @author EVH
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Treat {

	public static void treat() {
		Map<String, Double> dessertMenu = new HashMap<String, Double>();
		dessertMenu.put("Frosted Lemonaid", 4.19);
		dessertMenu.put("Frosted Coffee", 4.19);
		dessertMenu.put("Cookie", 1.55);
		dessertMenu.put("Brownie", 2.15);
		dessertMenu.put("Milkshake", 4.29);
		dessertMenu.put("IceDream Cup", 1.35);
		dessertMenu.put("IceDream Cone", 1.69);

		StringBuilder sb = new StringBuilder();
		for (Entry<String, Double> entry : dessertMenu.entrySet()) {
			sb.append(entry.getKey())
					.append(":  ---  $")
					.append(String.format("%.2f", entry.getValue()))
					.append("\n");
		}
		String result = sb.toString();
		System.out.println(result);
	}

}
