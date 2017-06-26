package queue;
// 3- Dada 3 Arrays de números inteiros, retorne uma fila com todos os inteiros contidos na mesma.
public class Q11 {

	public Queue<Integer> q11(int[] a1, int[] a2, int[] a3){
		
		Queue<Integer> queue =  new ArrayQueue<>();
		
		for (int i : a1) {
			queue.enqueue(i);
		}
		for (int i : a2) {
			queue.enqueue(i);
		}
		for (int i : a3) {
			queue.enqueue(i);
		}
				
		return queue;
	}
}
