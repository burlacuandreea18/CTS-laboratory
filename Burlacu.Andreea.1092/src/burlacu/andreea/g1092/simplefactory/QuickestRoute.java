package burlacu.andreea.g1092.simplefactory;

public class QuickestRoute extends AbstractRoute{

	public QuickestRoute(int noOfStations, String desc) {
		super();
		this.description=desc;
		this.noOfStations=noOfStations;
	}

	@Override
	public void ComputeRoute() {
		System.out.println("Computing the quickest route...");
		
	}

}
