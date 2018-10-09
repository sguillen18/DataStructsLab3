package Lab3;


public class Route {
	private Station [] stations = new Station[17];
	
	public Route() {
		
	}
	
	public String randID() {
		String identification = "";
		for(int i = 0; i < 5; i++) {
			int num = (int) (Math.random()* 10);
			identification += num;
		}
		return identification;
	}
	
	public int randStation() {
		int num = (int) (Math.random()* 17);
		return num;
	}
	
	public void main(){
		//creates new stations
		Station og = new Station("Oak Grove", null);
		Station w = new Station("Wellington", null);
		Station a = new Station("Assembly", null);
		Station ss = new Station("Sullivan Square", null);
		Station cc = new Station("Community College", null);
		Station h = new Station("Haymarket", null);
		Station dc = new Station("Downtown Crossing", null);
		Station c = new Station("Chinatown", null);
		Station tmc = new Station("Tufts Medical Center", null);
		Station bb = new Station("Back Bay", null);
		Station ma = new Station("Massachusetts Avenue", null);
		Station r = new Station("Ruggles", null);
		Station rc = new Station("Roxbury Crossing", null);
		Station js = new Station("Jackson Square", null);
		Station sb = new Station("Stony Brook", null);
		Station gs = new Station("Green Street", null);
		Station fh = new Station("Forest Hill", null);
		
		//adds to array
		stations[0] = og;
		stations[1] = w;
		stations[2] = a;
		stations[3] = ss;
		stations[4] = cc;
		stations[5] = h;
		stations[6] = dc;
		stations[7] = c;
		stations[8] = tmc;
		stations[9] = bb;
		stations[10] = ma;
		stations[11] = r;
		stations[12] = rc;
		stations[13] = js;
		stations[14] = sb;
		stations[15] = gs;
		stations[16] = fh;
		
		for(int j = 0; j < 17; j++) {
			LinkedQueue <Passenger> pa = new LinkedQueue <Passenger> ();
			stations[j].setPassList(pa);
		}
		
		for(int i = 0; i < 60; i++) {
			String id = randID();
			int num = randStation();
			Station s = stations[num];
			String stat = s.getName();
			Passenger p = new Passenger(id, stat);

			LinkedQueue <Passenger> copyList = s.getPassList();
			copyList.enqueue(p);
			s.setPassList(copyList);
		}
		
		
	}
	
	public Station[] getStationArray() {
		return stations;
	}
}
