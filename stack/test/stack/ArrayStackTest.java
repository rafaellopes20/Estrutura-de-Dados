package stack;

import org.junit.Test;
import org.junit.Assert;

public class ArrayStackTest {

	@Test
	public void pushTest(){
// Aqui sim, iremos dizer qual o tipo de dado que a variavel vai receber Stack<"String"> (pois no código está como "E" (não é um tipo))
		Stack<String> stack = new ArrayStack<>(); // Será novo no ArrayStack<>(), pois ele que armazenará os valores
												  // Podemos também colocar o valor do tamanho do array, exemplo: ArrayStack<>(100)
		
		Assert.assertEquals(0,  stack.getSize()); // definindo o dado do tamanho da pilha (0)
		Assert.assertTrue(stack.isEmpty()); // validando se a pilha está vazia (verdadeiro, pois nao tem nada ainda)
		
		//Declarando o que o método PUSH vai adicionar na pilha (3 valores no caso)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3,  stack.getSize()); // Se no teste o tamanho da pilha for = 3 (pois declarou-se 3 letras), deu certo.
		Assert.assertFalse(stack.isEmpty()); // caso contrário, se retornar vazio (método empty), deu errado (vazio)
	}
	
	@Test
	public void topTest(){
// Aqui sim, iremos dizer qual o tipo de dado que a variavel vai receber Stack<"String"> (pois no código está como "E" (não é um tipo))
		Stack<String> stack = new ArrayStack<>(); // Será novo no ArrayStack<>(), pois ele que armazenará os valores
		
		//Declarando o que o método PUSH vai adicionar na pilha (3 valores no caso)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3,  stack.getSize()); // Se no teste o tamanho da pilha for = 3 (pois declarou-se 3 letras), deu certo.
		Assert.assertEquals("C",  stack.top()); // Se no teste na posião da pilha for = C deu certo.
		Assert.assertEquals("C",  stack.top()); // Se no teste na posião da pilha for = C deu certo.
		Assert.assertEquals(3,  stack.getSize()); // Se no teste o tamanho da pilha for = 3 (pois declarou-se 3 letras), deu certo.
	}
	
	@Test
	public void popTest(){
// Aqui sim, iremos dizer qual o tipo de dado que a variavel vai receber Stack<"String"> (pois no código está como "E" (não é um tipo))
		Stack<String> stack = new ArrayStack<>(); // Será novo no ArrayStack<>(), pois ele que armazenará os valores
		
		//Declarando o que o método PUSH vai adicionar na pilha (3 valores no caso)
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
	
}
