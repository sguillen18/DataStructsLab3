package Lab3;

public class Station {
	private String name;
	private LinkedQueue <Passenger> passengers;
	
	public Station(String n, LinkedQueue <Passenger> p) {
		name = n;
		passengers = p;
	}
	
	public String listOfPass() {
		LinkedQueue <Passenger> copy = passengers;
		String list = " ";
		
		while(!copy.isEmpty()) {
			list += copy.dequeue().getPassInfo();
			list += "\n ";
		}
		
		return list;
	}
	
	public String printStationInfo() {
		return name + " \nPassengers: \n" + listOfPass();
	}
	
	public String getName() {
		return name;
	}
	
	public void setPassList(LinkedQueue <Passenger> p) {
		passengers = p;
	}
	
	public LinkedQueue <Passenger> getPassList() {
		return passengers;
	}
}
