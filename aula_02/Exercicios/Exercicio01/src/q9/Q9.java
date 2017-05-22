package q9;

// Dadas duas listas encadeadas, retorne uma nova lista encadeada com conteúdo das duas.

public class Q9 {
	public static SLinkedList<String> copyListsToNewList(SLinkedList<String> list1, SLinkedList<String> list2) {
		SLinkedList<String> result = new SLinkedList<String>();

		Node<String> aux = list1.getFirst();
		while (aux != null) {
			Node<String> node = new Node<String>(aux.getValue());
			result.add(node);

			aux = aux.getNext();
		}

		aux = list2.getFirst();
		while (aux != null) {
			Node<String> node = new Node<String>(aux.getValue());
			result.add(node);

			aux = aux.getNext();
		}

		return result;
	}
}