package q3;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {
	@Test
	public void test(){
		SLinkedList<String> linkedList1 = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList1.add(nodeA);
		linkedList1.add(nodeB);
		linkedList1.add(nodeC);
		
		SLinkedList<String> linkedList2 = new SLinkedList<>();
		Node<String> nodeX = new Node<>("X");
		Node<String> nodeY = new Node<>("Y");
		Node<String> nodeZ = new Node<>("Z");

		linkedList2.add(nodeX);
		linkedList2.add(nodeY);
		linkedList2.add(nodeZ);
	
		SLinkedList<String> result = Q3.copyListsToNewList(linkedList1, linkedList2);
		
		Assert.assertEquals("A", result.getFirst().getValue());
		Assert.assertEquals("Z", result.getLast().getValue());
		
	}
}