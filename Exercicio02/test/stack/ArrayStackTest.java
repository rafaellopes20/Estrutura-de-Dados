package stack;

import org.junit.Test;

import java.util.List;

import org.junit.Assert;

public class ArrayStackTest {

	/*
	 1- Dado um array de números inteiros, retorne uma pilha contendo todos os elementos do mesmo.
	 */
	@Test
	public void Q1Test(){

		Stack<Integer> stack = new ArrayStack<>(); 
		Q1 q1 = new Q1();
		int[] Array = {1,2,3};

		Stack<Integer> result = q1.toStack(Array);
		
		Assert.assertEquals(3, result.getSize());
	}
	/*
	 2- Altere a pilha desenvolvida em sala de aula (interface Stack e classe ArrayStack)
	  acrescentando o método pop(int n). O método deve retornar uma lista contendo n itens
	  retirados da pilha. Se n for maior que o tamanho da pilha, retornar apenas os elementos disponíveis.
	 */
	@Test
	public void Q2Test(){

		Stack<String> stack = new ArrayStack<>(); 
		stack.push("A");
		stack.push("B");
		stack.push("C");

		List<String> result2 = stack.pop(2);
		
		Assert.assertTrue(result2.size() == 3);
		Assert.assertEquals(result2.get(0), "C");
		Assert.assertEquals(result2.get(1), "B");
	}
	
	/*
	 3- Dada uma pilha de números inteiros, retorne um array de números pares contidos na mesma.
	 */
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
	
	/*
	4- Altere a pilha desenvolvida em sala de aula (interface Stack e classe ArrayStack) acrescentando o método clear().
	  O método deve esvaziar a pilha, retornando um array com todos os seus elementos. 
	 */
	@Test
	public void Q4Test(){

		Stack<Integer> stack = new ArrayStack<>(); 
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		int[] arrayResult = new int[stack.getSize()];
		arrayResult.clone();
		
		System.out.println(arrayResult[2]);
		
		Assert.assertTrue(arrayResult.length == 3); //
		Assert.assertTrue(arrayResult[0] == 0); //
	}
	
	
	
	/*
	 5- Altere a pilha desenvolvida em sala de aula (interface Stack e classe ArrayStack) 
	 acrescentando o método cloneStack(). O método deve retornar uma cópia da pilha atual.
	 */
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
