package q5;

//Altere a lista encadeada desenvolvida em sala de aula acrescentando o método copy. 
//O método deve retornar uma nova lista encadeada, copiando todos os nós da lista atual para a lista nova.

import org.junit.Assert;
import org.junit.Test;

import q6.DNode;

public class SLinkedListTest{

	@Test
	public void Test2(){
		SLinkedList<String> teste = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		teste.add(nodeA);
		teste.add(nodeB);
		teste.add(nodeC);
		/*Node<String> e = new Node<String>();
		e.setValue("E");*/
		
		SLinkedList<String> newList = teste.CopyToList(teste);
		
		//Assert.assertTrue(newList.equals(teste, newList));
	}

}
