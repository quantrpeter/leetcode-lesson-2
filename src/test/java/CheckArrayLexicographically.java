
import java.util.Arrays;
import org.junit.Test;

public class CheckArrayLexicographically {

	@Test
	public void test() {
		int x1[] = {1, 2, 3, 4, 5};
		int x2[] = {1, 2, 3, 4, 1};

		System.out.println(Arrays.compare(x1, x2));
	}
}
