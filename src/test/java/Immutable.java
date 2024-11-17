
import java.util.HashMap;
import org.junit.Test;

/**
 *
 * @author Peter <peter@quantr.hk>
 */
public class Immutable {

	@Test
	public void test() {
		HashMap<String, Integer> prices1 = new HashMap();
		prices1.put("Shoes", 200);
		prices1.put("Bag", 300);
		prices1.put("Clothes", 200);
		System.out.println(prices1);

		// primtive type : int, float, double, boolean
		// Object        : Integer, Float, Double, Boolean, String
		
	}
}
