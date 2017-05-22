package stack;

//Dado um array de inteiros (int[]), retorne um novo array de inteiros invertido.

public class ArrayInverted {
	public int[] Q1(int[] arrayInverted) {

		Stack<Integer> stack = new ArrayStack<>(arrayInverted.length); //Declarando a pilha do stack, recebendo o parametro do tamanho do array
		for (int i = 0; i < arrayInverted.length; i++) {//repetiçao para armazenar os valores do array
			stack.push(arrayInverted[i]);//a pilha stack, adicionará (POP) os valores dentro de arrayInverted[i]
		}
		
		int[] array = new int[arrayInverted.length]; // cria-se entao um novo array para armazenar os valores invertidos
		
		for (int i = 0; i < arrayInverted.length; i++) { //repetiçao para armazenar os valores do array
			array[i] = stack.pop(); // o array criado, receberá os valores que estão no stack.pop();
		}		
		return array; // retorno por fim, o array do segundo for
	}

}
