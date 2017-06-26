package queue;
//2- Dada uma fila de números inteiros, retorne um array de números pares contidos na mesma.
import org.junit.Test;

public class Q10 {

	public int[] q10(Queue<Integer> a){
		
		int[] array = new int [a.getSize()];
		int cont = 0;
		 
		while(!a.isEmpty()){
			int temp = a.dequeue();
			if(temp % 2 == 0){
				array[cont++] = temp;
			}
		}
		
		
				
		return array;
	}
}
