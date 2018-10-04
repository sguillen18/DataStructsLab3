package Lab3;


public class Route {
	Station [] stations;
	
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
		int num = (int) (Math.random()* 17) + 1;
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
		stations[1] = og;
		stations[2] = w;
		stations[3] = a;
		stations[4] = ss;
		stations[5] = cc;
		stations[6] = h;
		stations[7] = dc;
		stations[8] = c;
		stations[9] = tmc;
		stations[10] = bb;
		stations[11] = ma;
		stations[12] = r;
		stations[13] = rc;
		stations[14] = js;
		stations[15] = sb;
		stations[16] = gs;
		stations[17] = fh;
		
		for(int i = 0; i < 30; i++) {
			String id = randID();
			String stat = stations[randStation()].getName();
			Passenger p = new Passenger(id, );
		}
		
		
	}
}
