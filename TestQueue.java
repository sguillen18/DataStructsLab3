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
		
		Route r = new Route();
		r.main();
		
		Station[] s = r.getStationArray();
		
		for(int j = 0; j < 16; j++) {
			System.out.println(s[j].printStationInfo());
		}
		
		/*LinkedQueue<Passenger> hi = new LinkedQueue <Passenger> ();
		Passenger p1 = new Passenger("12345", "Shawn");
		Passenger p2 = new Passenger("12346", "Penguin");
		Passenger p3 = new Passenger("12347", "Igloo");
		hi.enqueue(p1);
		hi.enqueue(p2);
		hi.enqueue(p3);
		Station fred = new Station("Fred", hi);
		
		System.out.println(fred.printStationInfo());
		System.out.println(fred.listOfPass());*/
		
		
	}

}
