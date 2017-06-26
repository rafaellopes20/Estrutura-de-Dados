package queue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Q7Test {
	//7- Dada uma lista de números inteiros, retorne uma queue de números inteiros.
	@Test
	public void q7(){
		Q7 q7 = new Q7();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Queue<Integer> result = q7.q7(list);
		
		Assert.assertTrue(result.getSize() == 4);
		list.remove(0);
		result = q7.q7(list);
		Assert.assertTrue(result.getSize() == 3);
		Assert.assertTrue(result.front() == 0);
	}
}
