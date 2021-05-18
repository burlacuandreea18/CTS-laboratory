package burlacu.andreea.g1092.decorator;

public abstract class PassangerProfile {
	String username;
	int noOfTrips;
	float rate;
	
	public PassangerProfile(String username, int noOfTrips,float rate) {
		super();
		this.username = username;
		this.noOfTrips = noOfTrips;
		this.rate=rate;
	}
	
	public abstract void buyTicket();
	public abstract void rateTrip(int stars);
	public abstract void ratePassanger(int stars, String username);
	public abstract void reportTicketInspector(String route);
	public abstract void getDiscount(int noOfTrips, float rate);
	
	
	
}
