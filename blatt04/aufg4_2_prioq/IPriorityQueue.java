package blatt04.aufg4_2_prioq;

/** 
 * Interface for priority queues of bounded size.
 * @author Georg Schied
 */
public interface IPriorityQueue<E> {
	
	/** Insert an entry, consisting of value and priority, into the priority queue */
	void insert(Entry<E> e);
	
	/** 
	 * returns an entry with maximum priority.
	 * @return removed entry (or null, if queue is empty)
	 */
	Entry<E> extractMin();
	
	/** checks if priority queue is empty */
	boolean isEmpty();
	
	/** checks if priority queue is full */
	boolean isFull();
}
