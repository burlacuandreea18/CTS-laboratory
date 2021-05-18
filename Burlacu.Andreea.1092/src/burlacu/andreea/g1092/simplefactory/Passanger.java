package burlacu.andreea.g1092.simplefactory;

public class Passanger {
	String username;
	AbstractRoute route;
	
	public AbstractRoute getRoute() {
		return route;
	}

	public void setRoute(AbstractRoute route) {
		this.route = route;
	}

	public Passanger(String username) {
		super();
		this.username = username;
	}
	
	
}
