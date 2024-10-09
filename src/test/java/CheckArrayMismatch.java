
import java.util.Arrays;
import org.junit.Test;

public class CheckArrayMismatch {

	@Test
	public void test() {
		String x3[] = {"peter", "mary", "susan", "11", "22", "33"};
		String x4[] = {"peter", "susan", "mary", "11", "22", "33"};

		System.out.println(Arrays.mismatch(x3, x4));
	}
}
