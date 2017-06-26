package queue;

import org.junit.Assert;
//1- Dado um array de números inteiros, retorne uma fila contendo todos os elementos do mesmo.
import org.junit.Test;


public class Q9Test {

	@Test
	public void Q9test() {
		
		Integer[] array1 = {1,2,3};
		Queue<Integer> result = new ArrayQueue<>();
		
		result.enqueue(array1[0]);
		result.enqueue(array1[1]);
		result.enqueue(array1[2]);
		
		Assert.assertTrue(result.getSize() == 3);
		System.out.println("tamanho: "+ result.getSize());
		Assert.assertTrue(result.front() == 1);
		System.out.println("primeiro: "+ result.front());
		result.dequeue();
		result.dequeue();
		result.dequeue();
		Assert.assertTrue(result.isEmpty());
	}

}
