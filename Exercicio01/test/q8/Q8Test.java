package q8;

import org.junit.Test;
import org.junit.Assert;

//Dada uma lista encadeada N, copie todos valores de N para um array e retorne o mesmo.

public class Q8Test {
	@Test
	public void test(){
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		
		String[] result = Q8.copyListToArray(linkedList);
		
		Assert.assertEquals(result[0], linkedList.getFirst().getValue());
		
		Assert.assertEquals(result[2], linkedList.getLast().getValue());
	}
}