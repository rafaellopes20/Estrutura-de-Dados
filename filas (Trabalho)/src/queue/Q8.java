package queue;
//8- Dado 2 filas de caracters, verifique se são iguais, se sim retorne verdadeiro, caso contrario retorne falso
public class Q8 {

	public boolean q8(Queue<Character> a, Queue<Character> b){
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
