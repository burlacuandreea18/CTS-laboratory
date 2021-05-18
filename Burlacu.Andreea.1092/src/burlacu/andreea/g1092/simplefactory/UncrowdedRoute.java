package burlacu.andreea.g1092.simplefactory;

public class UncrowdedRoute extends AbstractRoute {

	public UncrowdedRoute(int noOfStations, String desc) {
		super();
		this.noOfStations=noOfStations;
		this.description=desc;
	}

	@Override
	public void ComputeRoute() {
		System.out.println("Computing the most uncrowded route...");
		
	}

}
