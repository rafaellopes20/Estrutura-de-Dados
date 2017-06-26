package queue;

import org.junit.Assert;
import org.junit.Test;



/* 1- Dada uma fila de caracteres, retorne uma outra fila contendo apenas os vogais presentes na primeira.*/
public class Q1Test {

	@Test
	public void q1(){
		Q1 q1 = new Q1();
		Queue<Character> q = new ArrayQueue<>();
		
		q.enqueue('a');
		q.enqueue('b');
		q.enqueue('c');
		q.enqueue('e');
		
		Queue<Character> result = q1.q1(q);
		
		Assert.assertTrue(result.getSize() == 2);
		Assert.assertTrue(result.front() == 'a');
		Assert.assertTrue(result.dequeue() == 'a');
		Assert.assertTrue(result.front() == 'e');
	}
}
