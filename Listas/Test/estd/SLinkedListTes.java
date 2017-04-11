package estd;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTes {

	@Test
	public void getSizeTest(){
		SLinkedList<String>linkedList = new SLinkedList<>();
		Assert.assertTrue(linkedList.getSize() == 0);
		Assert.assertTrue(linkedList.isEmpty()); // testando a classe booleana
		
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		//node.setValue("A");
		linkedList.add(nodeA); // é um tipo de variavel
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		
		Assert.assertTrue(linkedList.getSize() == 3);
		Assert.assertFalse(linkedList.isEmpty());
	}
	
}
