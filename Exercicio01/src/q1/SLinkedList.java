package q1;

public class SLinkedList<T> { // <T> pode ser qualquer coisa

	private Node<T> first; // node chama-se nó!

	private Node<T> last;
	
	private long size = 0;
	
	public long getSize(){
		return size;
	}
	
	public Node<T> search (T value){
		Node<T> aux = this.getFirst();
		
		while(aux != null){
			if(aux.getValue() == value){
				return aux;
			}
			aux = aux.getNext();
		}
		return null;
	}
	
	/*
	public void removeFirst(){
		if(!isEmpty()){
			first = first.getNext();
			size--;
			if(isEmpty()){
				last = null;
			}
		}
	}*/

	public void add(Node<T> node) { // método para adicionar o valor na lista encadeada
		  //Firt == null
		  //size == 0
		if (isEmpty()) { // validando se existe apenas 1 numero, se sim, validar o first e o last
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
		size++;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}

}
