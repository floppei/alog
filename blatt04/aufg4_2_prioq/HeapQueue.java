package blatt04.aufg4_2_prioq;


public class HeapQueue<E> implements IPriorityQueue<E>{
	private Entry<E>[] arr;
	private int count = 0;
		
	public HeapQueue(int maxSize) {
		arr = new Entry[maxSize];
	}
	
	@Override
	public void insert(Entry<E> e) {
		Entry entry = new Entry(e.getValue(),e.getPriority());
		arr[count+1] = entry;
		count++;


	}
	
	 
	@Override
	public Entry<E> extractMin() {
		arr[0] = arr[count];
		count--;


		return null;
	}

	
	@Override
	public boolean isEmpty() {
		if(count == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean isFull() {
		if(count==arr.length)
			return true;
		else
			return false;
	}
	
}
