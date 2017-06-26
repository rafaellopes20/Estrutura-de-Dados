package queue;

import org.junit.Assert;
import org.junit.Test;
//2- Dada uma fila de números inteiros, retorne um array de números pares contidos na mesma.
public class Q10Test {

	@Test
	public void Q10(){
		
		Queue<Integer> queue = new ArrayQueue<>();
		Q10 q10 = new Q10();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		int[] result = q10.q10(queue);
		
		Assert.assertTrue(result.length == 4);
		Assert.assertTrue(result[0] == 2);
		Assert.assertTrue(result[1] == 4);
	}
}
