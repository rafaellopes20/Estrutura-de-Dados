package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q5Test {
	//5- Dado 2 arrays de char, retorne uma fila contendo todos os elementos do mesmo.
	@Test
	public void q5(){
		
		Q5 q5 = new Q5();
		
		char[] a = {'A', 'B', 'C'};
		char[] b = {'D', 'E', 'F'};
		
		Queue<Character> result =  q5.q5(a, b);
		
		Assert.assertTrue(result.getSize() == 6);
		Assert.assertTrue(result.front() == 'A');
		result.dequeue();
		Assert.assertTrue(result.front() == 'B');
		
	}
}
