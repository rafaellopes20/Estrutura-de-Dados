package queue;
//4- Dado 2 filas, verifique se são iguais, se sim retorne verdadeiro, caso contrario retorne falso
public class Q12 {

	public boolean q12(Queue<Integer> a, Queue<Integer> b){
		
		if(a.getSize() != b.getSize()){
			return false;
		}
		while(!a.isEmpty()){
			if(!a.dequeue().equals(b.dequeue())){
				return false;
			}
		}
		
		return true;
	}
	
}
