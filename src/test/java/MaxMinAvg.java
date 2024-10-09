
import java.util.Arrays;
import org.junit.Test;

public class MaxMinAvg {

	@Test
	public void test() {
		int x1[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.stream(x1).max().getAsInt());
		System.out.println(Arrays.stream(x1).min().getAsInt());
		System.out.println(Arrays.stream(x1).average().getAsDouble());
	}
}
