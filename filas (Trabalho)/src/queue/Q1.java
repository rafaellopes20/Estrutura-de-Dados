package queue;
/* 1- Dada uma fila de caracteres, retorne uma outra fila contendo apenas os vogais presentes na primeira.*/
public class Q1 {

	public Queue<Character> q1(Queue<Character> q){
		Queue<Character> queue = new ArrayQueue<>();
		
		int size = q.getSize();
		
		for (int i = 0; i < size; i++) {
			char x = q.dequeue();
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
				queue.enqueue(x);
			}
		}
		
		return queue;
	}
}
