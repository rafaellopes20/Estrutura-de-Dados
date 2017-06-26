package queue;
//Dados dois arranjos de números decimais, retorne uma fila contendo todos os itens dos dois elevados ao cubo.
public class Q2 {

	public Queue<Double> q2(Double[] a, Double[] b){
		
		Queue<Double> queue =  new ArrayQueue<>();
		
		for (Double recebe : a) {
			queue.enqueue(Math.pow(recebe, 3));
		}
		for (Double recebe : b) {
			queue.enqueue(Math.pow(recebe, 3));
		}
		return queue;
	}
}
