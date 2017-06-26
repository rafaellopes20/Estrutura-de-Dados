package queue;
//1- Dado um array de números inteiros, retorne uma fila contendo todos os elementos do mesmo.
public class Q9 {

	public Queue<Integer> q09(Integer[] array){
		
		Queue<Integer> queue = new ArrayQueue<>();
		
		for (int i = 0; i < array.length; i++) {
			queue.enqueue(array[i]);
		}
		
		return queue;
	}
}
