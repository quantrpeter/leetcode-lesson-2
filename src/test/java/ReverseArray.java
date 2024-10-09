import java.util.stream.IntStream;
import org.junit.Test;

public class ReverseArray {

	@Test
	public void test() {
		int x1[] = {1, 2, 3, 4, 5};
		int reversed[] = IntStream.rangeClosed(1, x1.length).map(i -> x1[x1.length - i]).toArray();
		for (int temp : reversed) {
			System.out.println(temp);
		}
	}
}
