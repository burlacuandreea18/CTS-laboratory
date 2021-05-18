package burlacu.andreea.g1092.decorator;

public abstract class AbstractDecorator extends PassangerProfile {

	PassangerProfile decoratedObject;
	
	public AbstractDecorator(PassangerProfile decoratedObject) {
		super(decoratedObject.username, decoratedObject.noOfTrips, decoratedObject.rate);
		this.decoratedObject=decoratedObject;
	}

	@Override
	public void buyTicket() {
		this.decoratedObject.buyTicket();
	}

	@Override
	public void rateTrip(int stars) {
		this.decoratedObject.rateTrip(stars);
	}

	@Override
	public void reportTicketInspector(String route) {
		this.decoratedObject.reportTicketInspector(route);	
	}
	
}
