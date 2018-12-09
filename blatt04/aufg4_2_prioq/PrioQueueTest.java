package blatt04.aufg4_2_prioq;

public class PrioQueueTest {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		IPriorityQueue<String> pqueue = new HeapQueue<String>(20);
		//IPriorityQueue<String> pqueue = new SortedQueue<String>(20);
		
		//10 Werte mit den Prioritäten 1,3,5, ..., 19 einfügen
		for (int i = 1; i <= 20; i += 2) {
			Entry<String> entry = new Entry<String>("W" + i, i);
			pqueue.insert(entry);
			System.out.println("insert: " + entry);
		}
		
		//10 Werte mit den Prioritäten 20, 18, ..., 4, 2 einfügen
		for (int i = 20; i > 0; i -= 2) {
			Entry<String> entry = new Entry<String>("W" + i, i);
			pqueue.insert(entry);
			System.out.println("insert: " + entry);
		}
		
		int anzahlFehler = 0;
		//20 Werte aus der Prioritätenwarteschlange entfernen
		//sollte die Werte W1, W2, W3, ...., W20 liefern
		for (int k = 1; k <= 20; k++) {
			Entry<String> entry = pqueue.extractMin();
			System.out.println("remove: " + entry);
			if (entry.getPriority() != k || !entry.getValue().equals("W"+k)) {
				System.out.println("### Fehler bei k = " + k + ": falscher Eintrag: " + entry);
				anzahlFehler++;
			}
		}
		
		if (! pqueue.isEmpty()) {
			System.out.println("### Fehler: Warteschlange sollte leer sein");
			anzahlFehler++;
		}
		
		System.out.println();
		System.out.println("### Anzahl Fehler: " + anzahlFehler);
	}
}
		
