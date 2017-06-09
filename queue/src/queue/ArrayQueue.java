package queue;

public class ArrayQueue<E> implements Queue<E> {

	private E[] array;

	private int head = 0;

	private int tail = 0;
	
	private int size = 0;

	public ArrayQueue() {
		array = (E[]) new Object[20];
	}

	public ArrayQueue(int i) {
		array = (E[]) new Object[i];
	}

	@Override
	public void enqueue(E e) {
		array[tail++] = e;
		size++;
	}

	@Override
	public E dequeue() {
		E aux = array[head];
		array[head] = null;
		head++;
		size--;
		return aux;
	}

	@Override
	public E front() {
		return array[head];
	}

	@Override
	public boolean isEmpty() {
		return getSize() == 0;
	}

	@Override
	public int getSize() {
		return size;
	}

}
