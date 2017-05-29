package stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedStack<E> implements Stack<E> {

	private LinkedList<E> list = new LinkedList<>();

	@Override
	public void push(E e) {
		list.add(e);
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		} else {
			return list.remove(list.size() - 1);
			//ou return list.removeLast();
			//ou return list.peekLast();     ESSA NÃO NECESSITA DO IF
		}
	}

	@Override
	public E top() {
		if(isEmpty()){
			return null;
		}else{
			return list.get(list.size() -1);
			//OU return list.getLast();
		}
	}

	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
		// OUreturn list.size() == 0;
	}

}
