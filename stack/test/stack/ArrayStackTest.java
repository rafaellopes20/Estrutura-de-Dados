package stack;

import org.junit.Test;
import org.junit.Assert;

public class ArrayStackTest {

	@Test
	public void pushTest(){
// Aqui sim, iremos dizer qual o tipo de dado que a variavel vai receber Stack<"String"> (pois no c�digo est� como "E" (n�o � um tipo))
		Stack<String> stack = new ArrayStack<>(); // Ser� novo no ArrayStack<>(), pois ele que armazenar� os valores
												  // Podemos tamb�m colocar o valor do tamanho do array, exemplo: ArrayStack<>(100)
		
		Assert.assertEquals(0,  stack.getSize()); // definindo o dado do tamanho da pilha (0)
		Assert.assertTrue(stack.isEmpty()); // validando se a pilha est� vazia (verdadeiro, pois nao tem nada ainda)
		
		//Declarando o que o m�todo PUSH vai adicionar na pilha (3 valores no caso)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3,  stack.getSize()); // Se no teste o tamanho da pilha for = 3 (pois declarou-se 3 letras), deu certo.
		Assert.assertFalse(stack.isEmpty()); // caso contr�rio, se retornar vazio (m�todo empty), deu errado (vazio)
	}
	
	@Test
	public void topTest(){
// Aqui sim, iremos dizer qual o tipo de dado que a variavel vai receber Stack<"String"> (pois no c�digo est� como "E" (n�o � um tipo))
		Stack<String> stack = new ArrayStack<>(); // Ser� novo no ArrayStack<>(), pois ele que armazenar� os valores
		
		//Declarando o que o m�todo PUSH vai adicionar na pilha (3 valores no caso)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3,  stack.getSize()); // Se no teste o tamanho da pilha for = 3 (pois declarou-se 3 letras), deu certo.
		Assert.assertEquals("C",  stack.top()); // Se no teste na posi�o da pilha for = C deu certo.
		Assert.assertEquals("C",  stack.top()); // Se no teste na posi�o da pilha for = C deu certo.
		Assert.assertEquals(3,  stack.getSize()); // Se no teste o tamanho da pilha for = 3 (pois declarou-se 3 letras), deu certo.
	}
	
	@Test
	public void popTest(){
// Aqui sim, iremos dizer qual o tipo de dado que a variavel vai receber Stack<"String"> (pois no c�digo est� como "E" (n�o � um tipo))
		Stack<String> stack = new ArrayStack<>(); // Ser� novo no ArrayStack<>(), pois ele que armazenar� os valores
		
		//Declarando o que o m�todo PUSH vai adicionar na pilha (3 valores no caso)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals("A",  stack.pop());
		Assert.assertEquals("B",  stack.pop());
		Assert.assertEquals("C",  stack.pop());
		Assert.assertEquals(0,  stack.getSize());
		Assert.assertTrue(stack.isEmpty());
		Assert.assertEquals(null,  stack.pop());
	}
	
	@Test
	public void resizeTest(){
// Aqui sim, iremos dizer qual o tipo de dado que a variavel vai receber Stack<"String"> (pois no c�digo est� como "E" (n�o � um tipo))
		Stack<String> stack = new ArrayStack<>(2); // Ser� novo no ArrayStack<>(2), com tamanho inicial 2
		
		//Declarando o que o m�todo PUSH vai adicionar na pilha (3 valores no caso)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3,  stack.getSize()); // Se no teste o tamanho da pilha for = 3 (pois declarou-se 3 letras), deu certo.
		Assert.assertEquals("C",  stack.top()); // Se no teste na posi�o da pilha for = C deu certo.
		Assert.assertEquals("C",  stack.top()); // Se no teste na posi�o da pilha for = C deu certo.
		Assert.assertEquals(3,  stack.getSize()); // Se no teste o tamanho da pilha for = 3 (pois declarou-se 3 letras), deu certo.
	}
	
	@Test
	public void invertTest(){ // testando a invers�o do array
		
		int[] array = {1,2,3,4,5,6,7}; //definindo valores no array que dever� ser invertido
		int[] arrayInvertido = {7,6,5,4,3,2,1}; //definindo os valores invertidos do array acima
		int[] arrayResult; // o valor do array ser� definido aqui.
		
		ArrayInverted a = new ArrayInverted(); // criando o array "a" para armazenar o valor da classe ArrayInverted
		
		arrayResult = a.Q1(array); // o resultado do array da classe ArrayInverted, ser� armazenado no Result
		Assert.assertArrayEquals(arrayInvertido, arrayResult); // Se o arrayInvertido for igual o arrayResultt (resultado), deu certo.
		
	}
	
}
