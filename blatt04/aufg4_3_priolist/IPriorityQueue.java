package blatt04.aufg4_3_priolist;

public interface IPriorityQueue<E> {
	/** Eintrag (mit Wert und Priorität) in die Prioritätenwarteschlange aufnehmen */
	void insert(Entry<E> e);
	
	/** Den Eintrag mit der höchsten Priorität (= kleinster wert für Priorität) aus
	 *  der Warteschlange entnehmen
	 *  
	 * @return entnommener Eintrag (bzw. null, wenn Warteschlange leer
	 */
	Entry<E> extractMin();
	
	/** Prüft, ob Warteschlange leer ist */
	boolean isEmpty();
	
	/** Prüft, ob Warteschlange voll ist */
	boolean isFull();
}
