
import java.util.Arrays;
import org.junit.Test;

public class FindElement {

	@Test
	public void test() {
		String x[] = {"peter", "mary", "susan"};
		Arrays.sort(x);
		System.out.println(Arrays.binarySearch(x, "peter"));
		System.out.println(Arrays.binarySearch(x, "mary"));
		System.out.println(Arrays.binarySearch(x, "susan"));
	}
}
