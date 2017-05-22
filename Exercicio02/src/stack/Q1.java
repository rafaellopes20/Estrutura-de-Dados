package stack;
// 1- Dado um array de n�meros inteiros, retorne uma pilha contendo todos os elementos do mesmo.
public class Q1 {

	public Stack<Integer> toStack (int[] n){ // array criado � int[] n - N � o nome do array
		
/*pilha*/Stack<Integer> stack = new ArrayStack<>(n.length);  // o array stack recebera o que est� dentro do (), ou seja, o tamanho de N
		
		for (int i = 0; i < n.length; i++) { // para cada contador I avan�ado, ser� um novo resultado adicionado a pilha
			stack.push(n[i]); // stack.push() adicionar� o numero na pilha de acordo com a volta do FOR, ou seja 
		}                    // (n[i]) o N na I, mostrar� o valor que ser� colocado na posi��o               
		return stack; // ap�s tudo terminado, retorne a pilha com todos os elementos gravados no FOR
	}
	
}
