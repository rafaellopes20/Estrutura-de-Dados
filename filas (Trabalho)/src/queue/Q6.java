package queue;

import java.util.ArrayList;
import java.util.List;

//6- Dada uma fila de n�meros inteiros, retorne uma lista de n�meros inteiros.
public class Q6 {

	public List<Integer> q6(Queue<Integer> fila){
	
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < fila.getSize(); i++) {
			list.add(i);
		}
		
		return list;
	}
}
