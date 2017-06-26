package queue;

import org.junit.Assert;
import org.junit.Test;

//Dados dois arranjos de números decimais, retorne uma fila contendo todos os itens dos dois elevados ao cubo.
public class Q2Test {

	@Test
	public void q2(){
		
		Q2 q2 = new Q2();
		
		Double[] a = {1.0, 2.0};
		Double[] b = {3.0, 4.0};
		
		Queue<Double> result = q2.q2(a, b);
		Assert.assertTrue(result.getSize() == 4);
		Assert.assertTrue(result.dequeue() == 1.0);
		Assert.assertTrue(result.dequeue() == 8.0);
		Assert.assertTrue(result.dequeue() == 27.0);
		Assert.assertTrue(result.front() == 64.0);
	}
}
