package estd;

import org.junit.Assert;
import org.junit.Test;


public class Q1Test {

	@Test
	public void q1Test() {

		Q1 provaLais = new Q1();

		int[] nums = { 3, 5, 6, 2, 2, 5 };

		Assert.assertTrue(provaLais.q1(nums));

	}

}
