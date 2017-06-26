package queue;
import org.junit.Assert;
//3- Dada uma fila de números inteiros, retorne a soma de todos eles.
import org.junit.Test;

public class Q3Test {

	@Test
	public void q3(){
		Q3 q3 = new Q3();
		Queue<Integer> queue = new ArrayQueue<>();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		int result = q3.q3(queue);
		
		Assert.assertTrue(result == 6);
		
	}
}
