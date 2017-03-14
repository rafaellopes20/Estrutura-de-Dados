package estd;

import org.junit.Test;
import org.junit.Assert; // Comando para verificação de testes (Afirmação)

public class EvenTest {

	@Test
	public void contEvensTest() {
		Even even = new Even();
		int[] nums = { 5, 6, 8, 4, 1, 9 };

		int resultado = even.countEvens(nums);

		Assert.assertTrue(resultado == 3); // validando o número de PARES existentes - no caso 3

	}

}
