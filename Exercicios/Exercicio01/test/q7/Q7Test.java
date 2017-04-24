package q7;

import org.junit.Assert;
import org.junit.Test;

//Dado um array N, copie todos os valores de N para uma lista encadeada e retorne a mesma.

public class Q7Test {
	@Test
	public void test(){
		String[] array = {"A", "B", "C", "D"};
		
		SLinkedList<String> result = Q7.copyArrayToList(array);
		
		Assert.assertEquals("A", result.getFirst().getValue());
		Assert.assertEquals("D", result.getLast().getValue());
	}
}