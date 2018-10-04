package Lab3;

public class TestQueue {
	
	public static void main(String[] args) {
		LinkedQueue <String> lq = new LinkedQueue <> ();
		
		lq.enqueue ("AAA");
		lq.enqueue ("BBB");
		lq.enqueue ("XXX");
		lq.enqueue ("YYY");
		
		System.out.println ("The item at the front is "+ lq.getFront());
		
		while (!lq.isEmpty()) 
			System.out.println ("The front item is "+ lq.dequeue());
		int idx;
		for (idx = 1; idx <= 5; idx ++) 
			lq.enqueue ((Integer.toString(idx*1111)));
		for (idx = 1; idx <= 4; idx ++)
			System.out.println (lq.dequeue());
		lq.clear();
		try {
			System.out.println (lq.getFront());
		}
		catch (EmptyQueueException ex) {
			System.out.println ("Could not get front of empty queue");
		}
		
	}

}
