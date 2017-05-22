package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void verificaTest() {

		Q4 verif = new Q4();

		int[] nums = { 1, 3, 2, 2, 5, 2, 7, 5 };

		Assert.assertTrue(verif.verifica(nums));

	}

}
