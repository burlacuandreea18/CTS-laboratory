package burlacu.andreea.g1092.decorator;

public class PremiumPassanger extends PassangerProfile{
	boolean hasMembership;

	public PremiumPassanger(String username, int noOfTrips, float rate, boolean hasMembership) {
		super(username, noOfTrips, rate);
		this.hasMembership=hasMembership;
	}

	@Override
	public void buyTicket() {
		if(this.hasMembership) {
			System.out.println("The passanger owns a membership");
		}
		else
		{
			System.out.println("Process passanger purchase...");
		}
	}

	@Override
	public void rateTrip(int stars) {
		System.out.println(String.format("Passanger %s gave this trip %d stars", username, stars));

	}

	@Override
	public void ratePassanger(int stars, String username) {
		System.out.println(String.format("Passanger %s gave this passanger %s %d stars", this.username,username, stars));

	}

	@Override
	public void reportTicketInspector(String route) {
		System.out.println(String.format("Passanger %s reported a ticket inspector on the %d route", username, route));
		
	}

	@Override
	public void getDiscount(int noOfTrips, float rate) {
		if(noOfTrips%5==0 && rate>4.5)
			System.out.println("Applying discount");
		else
			System.out.println("The passanger is not eligible for discount");
		
	}
}
