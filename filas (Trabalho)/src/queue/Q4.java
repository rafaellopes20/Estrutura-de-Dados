package queue;
//Dada um número inteiro n, retorne uma fila contendo
//todos os números maiores que zero e menores que n
public class Q4 {

	public Queue<Integer> q4(Integer num){
		
		Queue<Integer> queue = new ArrayQueue<>();
		
		for (int i = 1; i < num; i++) {
				queue.enqueue(i);
		}
		
		return queue;
	}
}
