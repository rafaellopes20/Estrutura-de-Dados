package queue;

import java.util.List;

//7- Dada uma lista de números inteiros, retorne uma queue de números inteiros.
public class Q7 {

	public Queue<Integer> q7(List<Integer> list){
		
		Queue<Integer> queue = new ArrayQueue<>();
		
		for (int i = 0; i < list.size(); i++) {
			queue.enqueue(i);
		}
		return queue;
	}
}
