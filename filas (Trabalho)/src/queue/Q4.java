package queue;
//Dada um n�mero inteiro n, retorne uma fila contendo
//todos os n�meros maiores que zero e menores que n
public class Q4 {

	public Queue<Integer> q4(Integer num){
		
		Queue<Integer> queue = new ArrayQueue<>();
		
		for (int i = 1; i < num; i++) {
				queue.enqueue(i);
		}
		
		return queue;
	}
}
