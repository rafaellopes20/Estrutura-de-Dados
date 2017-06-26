package queue;
import org.junit.Assert;
//4- Dado 2 filas, verifique se são iguais, se sim retorne verdadeiro, caso contrario retorne falso
import org.junit.Test;

public class Q12Test {

	@Test
	public void q12(){
		
		Q12 q12 = new Q12();
		
		Queue<Integer> a = new ArrayQueue<>();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		
		Queue<Integer> b = new ArrayQueue<>();
		b.enqueue(1);
		b.enqueue(2);
		b.enqueue(3);
		
		boolean result = q12.q12(a, b);
		
		Assert.assertTrue(result);
		
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		
		b.enqueue(3);
		b.enqueue(2);
		b.enqueue(1);
		
		result = q12.q12(a, b);
		Assert.assertFalse(result);
	
	}
	
}
