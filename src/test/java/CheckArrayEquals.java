
import java.util.Arrays;
import org.junit.Test;

public class CheckArrayEquals {

	@Test
	public void test() {
		String x1[] = {"peter", "mary", "susan"};
		String x2[] = {"peter", "susan", "mary"};
		System.out.println(Arrays.equals(x1, x2));

		String x3[] = {"peter", "mary", "susan", "11", "22", "33"};
		String x4[] = {"peter", "susan", "mary", "11", "22", "33"};

		System.out.println(Arrays.equals(x3, 3, 5, x4, 3, 5));
	}
}
