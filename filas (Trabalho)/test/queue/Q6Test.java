package queue;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class Q6Test {
	//6- Dada uma fila de números inteiros, retorne uma lista de números inteiros.
	@Test
	public void q6(){
		Q6 q6 = new Q6();
		
		Queue<Integer> queue = new ArrayQueue<>();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		List<Integer> result = q6.q6(queue);
		
		Assert.assertTrue(result.size() == 3);
		Assert.assertTrue(result.size() == queue.getSize());
		queue.dequeue();
		result = q6.q6(queue);
		Assert.assertTrue(result.size() == 2);
	}
	
}
