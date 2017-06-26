package queue;
//3- Dada 3 Arrays de números inteiros, retorne uma fila com todos os inteiros contidos na mesma.

import org.junit.Assert;
import org.junit.Test;

public class Q11Test {

	@Test	
	public void q11(){
		
		Q11 q11 = new Q11();
		
		int[] a1 = {1,2};
		int[] a2 = {3,4};
		int[] a3 = {5,6};
		
		Queue<Integer> result = q11.q11(a1, a2, a3);
		
		Assert.assertTrue(result.getSize() == 6);
		Assert.assertTrue(result.front() == 1);
		result.dequeue();
		result.dequeue();
		Assert.assertTrue(result.getSize() == 4);
		Assert.assertTrue(result.front() == 3);
		
	}
}
