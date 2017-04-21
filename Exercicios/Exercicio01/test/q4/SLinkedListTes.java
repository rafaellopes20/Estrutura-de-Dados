package q4;

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
		
		
		
		
		
		
		
		
	/*	int result = linkedList.getNodeDepth(nodeA);
		System.out.println("valor que esta saindo é: " + result); // coloque print para saber qual o valor saído
		Assert.assertTrue(result == 0);
		int result2 = linkedList.getNodeDepth(nodeB);
		System.out.println("valor que esta saindo é: " + result2);
		Assert.assertTrue(result2 == 1);
		int result3 = linkedList.getNodeDepth(nodeC);
		System.out.println("valor que esta saindo é: " + result3);
		Assert.assertTrue(result3 == 2);
		
	/*	int result = linkedList.getNodeHeight(nodeA);
		Assert.assertTrue(result == 2);
		
		int result2 = linkedList.getNodeHeight(nodeC);
		Assert.assertTrue(result2 == 0);
		
		int result3 = linkedList.getNodeHeight(new Node<>("F"));
		Assert.assertTrue(result3 == -1);
		
		/*Node<String> result = linkedList.search("B");
		Assert.assertEquals(nodeB, result);
		
		result = linkedList.search("F");
		Assert.assertNull(result);
		
		result = linkedList.search("C");
		Assert.assertEquals(nodeC, result);
		
		Assert.assertTrue(linkedList.getSize() == 3);
		Assert.assertFalse(linkedList.isEmpty());*/
	}
	/*@Test
	public void removeFirstTest(){
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
	*/
}
