/**
 * @author TD
 * @author EVH
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Salads extends Driver{
	
	public static void main (String[] args) {
		Map<String, Double> salad = new HashMap<String, Double>();
		salad.put("Cobb Salad", 9.39);
		salad.put("Spicy Southwest Salad", 9.59);
		salad.put("Market Salad", 9.59);
		hasDuplicate(null);
		
	}//end main
	
	public static boolean hasDuplicate(List<Double> list) {
		Set<Double> set = new HashSet<>(list);
		return set.size() < list.size();
	}

}//end Salads
