
import java.util.Arrays;
import java.util.Comparator;
import org.junit.Test;

public class SortArray2 {

	@Test
	public void test() {
		String x[] = {"peter", "mary", "susan"};
		Arrays.sort(x, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				System.out.println(o1 + " == " + o2);
				if (o1.equals("mary") || o1.equals("susan")) {
					return -1;
				} else {
					return 1;
				}
			}

		});

		for (String temp : x) {
			System.out.println(temp);
		}
	}
}
