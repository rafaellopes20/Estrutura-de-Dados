package q1;

public class Q1 {


	public int numerosInteiros(int[] node) {
		Node<T> aux = node.getFirst();
		int result = 0;
		
		while (aux != null) {
			if (aux.getValue() % 2 == 0) {
				Node<T> node = new Node<T>(aux.getValue());
				result.add(node);
			}
			aux = aux.getNext();
		}
		return result;
	}
}

//########## TESTE ############

package q1;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void numerosInteiros(){
		SLinkedList<String>linkedList = new SLinkedList<>();
		
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		
		Node<T> result = linkedList.numerosInteiros();
		Assert.assertTrue(result);		
	}
}