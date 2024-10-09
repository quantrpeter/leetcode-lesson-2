
import java.util.Arrays;
import org.junit.Test;

public class ChangeArraySize {

	@Test
	public void test() {
		int x1[] = new int[3];
		Arrays.fill(x1, 10);
		x1 = Arrays.copyOf(x1, 5);
		for (int temp : x1) {
			System.out.println(temp);
		}
	}
}
