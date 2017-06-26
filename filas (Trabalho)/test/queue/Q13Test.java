package queue;

import org.junit.Assert;
import org.junit.Test;



//13- Dado 2 filas de números inteiros, retorne a soma de todos eles.
public class Q13Test {

	@Test
	public void q13(){
		Q13 q13 = new Q13();
		
		Queue<Integer> q1 = new ArrayQueue<>();
		q1.enqueue(1);
		q1.enqueue(1);
		
		Queue<Integer> q2 = new ArrayQueue<>();
		q2.enqueue(1);
		q2.enqueue(1);
		
		int result = q13.q13(q1, q2);
		
		Assert.assertTrue(result == 4);
	}
	
}
