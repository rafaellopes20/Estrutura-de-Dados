package queue;

import org.junit.Assert;
import org.junit.Test;


public class Q8Test {
	//8- Dado 2 filas de caracters, verifique se são iguais, se sim retorne verdadeiro, caso contrario retorne falso
	@Test
	public void q8(){
		Q8 q8 = new Q8();
		
		Queue<Character> a = new ArrayQueue<>();
		a.enqueue('a');
		a.enqueue('b');
		
		Queue<Character> b = new ArrayQueue<>();
		b.enqueue('a');
		b.enqueue('b');
		
		boolean result = q8.q8(a, b);
		
		Assert.assertTrue(result);
		
		a.enqueue('a');
		a.enqueue('b');
		
		b.enqueue('d');
		b.enqueue('e');
		
		result = q8.q8(a, b);
		
		Assert.assertFalse(result);
	}

}
