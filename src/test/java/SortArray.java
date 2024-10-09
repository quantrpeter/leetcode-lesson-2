
import java.util.Arrays;
import org.junit.Test;

public class SortArray {

	@Test
	public void test() {
		int x[] = {1, 43, 2, -23, 10};
		Arrays.sort(x);

		for (int temp : x) {
			System.out.println(temp);
		}
	}
}
