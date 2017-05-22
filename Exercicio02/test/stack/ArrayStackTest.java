package stack;

import org.junit.Test;
import org.junit.Assert;

public class ArrayStackTest {

	@Test
	public void Q1Test(){

		Stack<Integer> stack = new ArrayStack<>(); 
		Q1 q1 = new Q1();
		int[] Array = {1,2,3};

		Stack<Integer> result = q1.toStack(Array);
		
		Assert.assertEquals(3, result.getSize());
	}
	
	@Test
	public void Q3Test(){

		Stack<Integer> stack = new ArrayStack<>(); 
		Q3 q3 = new Q3();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		int[] result3 = q3.toArray(stack);
		
		Assert.assertTrue(result3[0] == 1);
		Assert.assertTrue(result3[1] == 2);
		Assert.assertTrue(result3[2] == 3);
		Assert.assertTrue(result3[3] == 4);
		Assert.assertTrue(result3[4] == 5);
		Assert.assertTrue(result3[5] == 6);
	}
	
}
