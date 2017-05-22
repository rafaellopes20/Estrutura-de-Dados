package q4;

//Altere a lista encadeada desenvolvida em sala de aula acrescentando(sobscrevendo)
//o método equals, usando a seguinte regra: duas listas são iguais quando todos os seus nós são iguais.

public class SLinkedList<T> { // <T> pode ser qualquer coisa

	private Node<T> first; // node chama-se nó!

	private Node<T> last;
	
	
	public boolean EqualsList(SLinkedList<T> list1, SLinkedList<T> list2){
		Node<T> aux1 = list1.getFirst();//Variavel auxiliar1 referente a lista1 recebida por parametro
		Node<T> aux2 = list1.getFirst();//Variavel auxiliar2 referente a lista2 recebida por parametro
		
		while (aux1 != null && aux2 != null) {
			if(!aux1.equals(aux2)){
				return false;
			}
			
			if((aux1 == null && aux2 != null) || (aux1 != null && aux2 == null)){
				return false;
			}
			
			aux1 = aux1.getNext();
			aux2 = aux2.getNext();
		}
		return true;
	}
	
	
	
	
	
	
	
	
	public int getNodeDepth(Node<T> node){
		int result = 0;
		
		Node<T> aux = this.getFirst();
		
		while(aux != null){
			if(aux == node){
				return result;
			}
			result ++;
			aux = aux.getNext();
		}
		return result;
	}
	
	
	
	

	public int getNodeHeight(Node<T> node) {
		int result = -1;
		boolean found = false;

		Node<T> aux = this.getFirst();

		while (aux != null) {
			if (node.equals(aux)) {
				found = true;
			}

			if (found) {
				result++;
			}
			aux = aux.getNext();
		}
		return result;
	}

	private long size = 0;

	public long getSize() {
		return size;
	}

	public Node<T> search(T value) {
		Node<T> aux = this.getFirst();

		while (aux != null) {
			if (aux.getValue() == value) {
				return aux;
			}
			aux = aux.getNext();
		}
		return null;
	}

	/*
	 * public void removeFirst(){ if(!isEmpty()){ first = first.getNext();
	 * size--; if(isEmpty()){ last = null; } } }
	 */

	public void add(Node<T> node) { // método para adicionar o valor na lista
									// encadeada
		// Firt == null
		// size == 0
		if (isEmpty()) { // validando se existe apenas 1 numero, se sim, validar
							// o first e o last
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
		size++;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}

}
