package q6;

import org.junit.Assert;
import org.junit.Test;

//Dada uma lista duplamente encadeada L, crie uma outra lista cujos elementos estejam na ordem invertida de L.

public class SLinkedListTes {

	@Test
	public void getSizeTest(){
		DLinkedList<String> linkedList = new DLinkedList<>();
		DNode<String> nodeA = new DNode<>("A");
		DNode<String> nodeB = new DNode<>("B");
		DNode<String> nodeC = new DNode<>("C");
		//node.setValue("A");
		linkedList.addLast(nodeA); // é um tipo de variavel
		linkedList.addLast(nodeB);
		linkedList.addLast(nodeC);
		
		DLinkedList<String> result = Q6.invert(linkedList);

		Assert.assertEquals("A", result.getLast().getValue());
		System.out.println(result.getLast().getValue());
		Assert.assertEquals("C", result.getFirst().getValue());
		System.out.println(result.getFirst().getValue());
		
	}
}