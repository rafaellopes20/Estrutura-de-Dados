package stack;
// 3- Dada uma pilha de números inteiros, retorne um array de números pares contidos na mesma.
public class Q3 {

	public int[] toArray (Stack<Integer> stack){
		
		int[] Result = new int[stack.getSize()]; // para o resultado, deve-se ter o tamanho da pilha
		int contador=0;
		
		while(!stack.isEmpty()){ //enquanto a pilha nao for vazia, fará este tratamento
			int x = stack.pop();
				if(x % 2 == 0){
					Result[contador++] = x; //resultado[da posiçao / contador] é igual ao numero setado na variavel auxiliar X
				}
		}
		
		return Result;
	}
}
