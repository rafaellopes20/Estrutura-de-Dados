package q8;

//Dada uma lista encadeada N, copie todos valores de N para um array e retorne o mesmo.

public class Q8 {

	public static String[] copyListToArray(SLinkedList<String> list) {
		int counter = 0;
		String[] result = new String[(int) list.getSize()];
		Node<String> aux = list.getFirst();
		while (aux != null) {
			result[counter] = aux.getValue();
			aux = aux.getNext();
			counter++;
		}

		return result;
	}
}