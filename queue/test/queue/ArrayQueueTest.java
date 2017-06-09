package queue;

import org.junit.Assert;
import org.junit.Test;

public class ArrayQueueTest {

	@Test
	public void enqueueTest() {
		ArrayQueue<String> queue = new ArrayQueue<>();

		Assert.assertTrue(queue.isEmpty());

		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");

		Assert.assertFalse(queue.isEmpty());
		Assert.assertTrue(queue.getSize() == 3);
	}
	
	@Test
	public void dequeueTest() {
		ArrayQueue<String> queue = new ArrayQueue<>();

		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");

		Assert.assertEquals("A", queue.front());
		Assert.assertEquals("A", queue.front());
		
		Assert.assertEquals("A", queue.dequeue());
		Assert.assertEquals("B", queue.dequeue());
		Assert.assertEquals("C", queue.dequeue());
		Assert.assertTrue(queue.isEmpty());
		
	}

}
