package queue;
//13- Dado 2 filas de números inteiros, retorne a soma de todos eles.
public class Q13 {

	public int q13(Queue<Integer> a, Queue<Integer> b){
		
		int soma = 0;
		int tamanhoA = a.getSize();
		int tamanhob = b.getSize();
		
		for (int i = 0; i < tamanhoA; i++) {
			soma += a.dequeue();
		}
		for (int i = 0; i < tamanhob; i++) {
			soma += b.dequeue();
		}
		return soma;
	}
}
