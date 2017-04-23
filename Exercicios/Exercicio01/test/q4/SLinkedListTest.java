package q4;

import org.junit.Assert;
import org.junit.Test;

import q4.Node;
import q4.SLinkedList;

public class SLinkedListTest{

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
	}
}