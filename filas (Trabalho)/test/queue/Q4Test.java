package queue;
//Dada um número inteiro n, retorne uma fila contendo
//todos os números maiores que zero e menores que n

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void q4(){
		Q4 q4 = new Q4();
		
		int num = 4;
		
		Queue<Integer> result = q4.q4(num);
		
		Assert.assertTrue(result.front() == 1);
		Assert.assertTrue(result.getSize() == 3);
	}
}
