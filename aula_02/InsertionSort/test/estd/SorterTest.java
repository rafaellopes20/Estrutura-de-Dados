package estd;

import org.junit.Assert;
import org.junit.Test;

public class SorterTest {

	@Test //Numero
	public void sortTest() {
		Sorter sorter = new Sorter();
		int[] n = { 4, 3, 2, 1 };
		sorter.sort(n);
		int[] expected = { 1, 2, 3, 4 };
		Assert.assertArrayEquals(expected, n);
	}

	@Test // Char
	public void sortTestChar() {
		Sorter sorter = new Sorter();
		int[] n = { 'C', 'D', 'B', 'A' };
		sorter.sort(n);
		int[] expected = { 'A', 'B', 'C', 'D' };
		Assert.assertArrayEquals(expected, n);
	}

	@Test // String
	public void sortStringTest() {
		Sorter sorter = new Sorter();
		String[] n = { "Fabio", "Ana" };
		sorter.sortString(n);
		String[] expected = { "Ana", "Fabio" };
		Assert.assertArrayEquals(expected, n);
	}
}
