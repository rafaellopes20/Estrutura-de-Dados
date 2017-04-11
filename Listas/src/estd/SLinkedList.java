package estd;

public class SLinkedList<T> { // <T> pode ser qualquer coisa

	private Node<T> first; // node chama-se n�!

	private Node<T> last;
	
	private long size = 0;
	
	public long getSize(){
		return size;
	}
	
	public void removeFirst(){
		if(!isEmpty()){
			first = first.getNext();
			size--;
		}
	}

	public void add(Node<T> node) { // m�todo para adicionar o valor na lista encadeada
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
