package q2;

public class Q2<T> {
	
	public Node<T> removeValue(T value){
		Node<T> remove = this.getFirst();
		
		while (remove != null){
			if(remove.getValue() == value){
				remove = remove.removeFirst();
			}
			remove = remove.getNext();
		}
		return remove;
	}
}


// ######### TESTE ###########
package q2;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void removeTest(){
		SLinkedList<String>linkedList = new SLinkedList<>();
		
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		
		Node<String> result = linkedList.removeFirst();
		Assert.assertTrue(result);
		
		result = linkedList.removeFirst();
		Assert.assertTrue(result);
	}
}