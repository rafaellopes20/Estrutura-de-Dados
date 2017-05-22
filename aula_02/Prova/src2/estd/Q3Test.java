package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {

	@Test
	public void somaNumTest() {

		Q3 provaCont = new Q3();

		int[] nums = { 3, 5, 2, 2, 2, 2 };

		Assert.assertTrue(provaCont.somaNum(nums));

	}

}
