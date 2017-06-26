package queue;
//3- Dada uma fila de números inteiros, retorne a soma de todos eles.
public class Q3 {

	public int q3(Queue<Integer> q){
		
		int soma = 0;
		int size = q.getSize();
		for (int i = 0; i < size; i++) {
			soma += q.dequeue();
		}
		
		return soma;
	}
}
