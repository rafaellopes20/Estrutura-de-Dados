package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void tirarXTest() {

		Q2 provaString = new Q2();

		String texto = "oxamana";

		String result = provaString.tirarX(texto);

		String expected = "oamana";

		Assert.assertEquals(expected, result);

	}

}
