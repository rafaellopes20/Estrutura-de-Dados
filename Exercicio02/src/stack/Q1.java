package stack;
// 1- Dado um array de números inteiros, retorne uma pilha contendo todos os elementos do mesmo.
public class Q1 {

	public Stack<Integer> toStack (int[] n){ // array criado é int[] n - N é o nome do array
		
/*pilha*/Stack<Integer> stack = new ArrayStack<>(n.length);  // o array stack recebera o que está dentro do (), ou seja, o tamanho de N
		
		for (int i = 0; i < n.length; i++) { // para cada contador I avançado, será um novo resultado adicionado a pilha
			stack.push(n[i]); // stack.push() adicionará o numero na pilha de acordo com a volta do FOR, ou seja 
		}                    // (n[i]) o N na I, mostrará o valor que será colocado na posição               
		return stack; // após tudo terminado, retorne a pilha com todos os elementos gravados no FOR
	}
	
}
