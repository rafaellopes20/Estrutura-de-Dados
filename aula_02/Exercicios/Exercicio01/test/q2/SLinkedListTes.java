package q2;

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
		linkedList.add(nodeA); // � um tipo de variavel
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		
		int result = linkedList.getNodeDepth(nodeA);
		System.out.println("valor que esta saindo �: " + result); // coloque print para saber qual o valor sa�do
		Assert.assertTrue(result == 0);
		int result2 = linkedList.getNodeDepth(nodeB);
		System.out.println("valor que esta saindo �: " + result2);
		Assert.assertTrue(result2 == 1);
		int result3 = linkedList.getNodeDepth(nodeC);
		System.out.println("valor que esta saindo �: " + result3);
		Assert.assertTrue(result3 == 2);
	}
}
