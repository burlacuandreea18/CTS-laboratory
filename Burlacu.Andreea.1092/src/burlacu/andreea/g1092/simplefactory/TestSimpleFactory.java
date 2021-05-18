package burlacu.andreea.g1092.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		Passanger passanger= new Passanger("OldTraveler");
		
		AbstractRoute normalRoute= 
				RouteFactory.getRoute(RouteType.NORMAL, "This is an ok route!");
		passanger.setRoute(normalRoute);

	}

}
