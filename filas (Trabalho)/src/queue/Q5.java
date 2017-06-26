package queue;
//5- Dado 2 arrays de char, retorne uma fila contendo todos os elementos do mesmo.
public class Q5 {

	public Queue<Character> q5(char[] a, char[] b){
				
		Queue<Character> queue = new ArrayQueue<>();
		
		for (int i = 0; i < a.length; i++) {
			queue.enqueue(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			queue.enqueue(b[i]);
		}
		
		return queue;
	}
}
