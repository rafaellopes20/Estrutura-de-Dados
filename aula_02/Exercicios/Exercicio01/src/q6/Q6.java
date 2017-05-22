package q6;

//Dada uma lista duplamente encadeada L, crie uma outra lista cujos elementos estejam na ordem invertida de L.

public class Q6 {

	public static DLinkedList<String> invert(DLinkedList<String> list) {
		DLinkedList<String> result = new DLinkedList<>();
		DNode<String> aux = list.getFirst();

		while (aux != null) {
			DNode<String> node = new DNode<String>(aux.getValue());
			result.addFirst(node);
			aux = aux.getNext();
		}
		return result;
	}
}
