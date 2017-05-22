package q4;

import org.junit.Assert;
import org.junit.Test;

//Altere a lista encadeada desenvolvida em sala de aula acrescentando(sobscrevendo)
//o método equals, usando a seguinte regra: duas listas são iguais quando todos os seus nós são iguais.

public class SLinkedListTest {

	@Test
	public void searchTest() {
		SLinkedList<String> list1 = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		list1.add(nodeA);
		list1.add(nodeB);
		list1.add(nodeC);
		
		SLinkedList<String> list2 = new SLinkedList<>();
		Node<String> nodeD = new Node<>("A");
		Node<String> nodeE = new Node<>("B");
		Node<String> nodeF = new Node<>("C");

		list2.add(nodeD);
		list2.add(nodeE);
		list2.add(nodeF);
		
		SLinkedList<String> list3 = new SLinkedList<>();
		Node<String> nodeG = new Node<>("X");
		Node<String> nodeH = new Node<>("Y");
		Node<String> nodeI = new Node<>("Z");

		list3.add(nodeG);
		list3.add(nodeH);
		list3.add(nodeI);
		
		SLinkedList<String> listResult = new SLinkedList<>();
		
		boolean result1 = listResult.EqualsList(list1, list3);
		Assert.assertTrue(result1);

		//boolean result2 = listResult.EqualsList(list1, list3);
		//Assert.assertFalse(result2); 
		
	}

}