package stack;

import org.junit.Test;

import java.util.List;

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
	public void Q2Test(){

		Stack<String> stack = new ArrayStack<>(); 
		stack.push("C");
		stack.push("B");
		stack.push("A");

		List<String> result2 = stack.pop(2);
		
		Assert.assertTrue(result2.size() == 3);
		Assert.assertEquals(result2.get(0), "C");
		Assert.assertEquals(result2.get(1), "B");
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
		
		Assert.assertTrue(result3[0] == 6); // inverte-se estes dados, pois
		Assert.assertTrue(result3[1] == 4); // a pilha ela tira o primeiro...
		Assert.assertTrue(result3[2] == 2);// portanto fica assim
	}
	
	@Test
	public void Q5Test(){

		Stack<Integer> stack = new ArrayStack<>(); 
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		Stack<Integer> stackCopy = stack.cloneStack();
		
		Assert.assertTrue(stackCopy.getSize() == stack.getSize()); // Verificando se o tamanho da pilha é igual ao tamanho da pilha original
	}
	
}
