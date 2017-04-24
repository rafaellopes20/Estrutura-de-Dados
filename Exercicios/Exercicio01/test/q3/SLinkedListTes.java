package q3;

import org.junit.Assert;
import org.junit.Test;

//Altura de um n� N em uma lista encadeada � a dist�ncia entre N e o fim da lista. Mais precisamente,
//a altura de N � o n�mero de passos do caminho que leva de N at� o �ltimo n� da lista. 
//Escreva um m�todo que retorne a altura de um n�.

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
		
		int result = linkedList.getNodeHeight(nodeA);
		Assert.assertTrue(result == 2);
		
		int result2 = linkedList.getNodeHeight(nodeC);
		Assert.assertTrue(result2 == 0);
		
		int result3 = linkedList.getNodeHeight(new Node<>("F"));
		Assert.assertTrue(result3 == -1);
		
	}

}
