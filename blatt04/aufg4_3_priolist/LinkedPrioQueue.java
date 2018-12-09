package blatt04.aufg4_3_priolist;

/**
 * Linked-list implementation of priority queues
 * */
public class LinkedPrioQueue<E> implements IPriorityQueue<E> {
	private ListNode<E> first;
	private ListNode<E> last;
	private int count;

	private class ListNode<T> {
		public T value;
		public ListNode<T> next;
		public ListNode(T m, ListNode<T> n) {
			value = m;
			next = n;
		}
	}

	public LinkedPrioQueue() {
		//TODO
		//TODO
		//TODO
		//TODO		
	}


	@Override
	public boolean isEmpty() {
		if(first == last)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		//TODO
		//TODO
		//TODO
		//TODO		
		return true;
	}



	@Override
	public void insert(Entry<E> e) {


	}

	@Override
	public Entry<E> extractMin() {
		//TODO
		//TODO
		//TODO
		//TODO		
		return null;
	}


}
