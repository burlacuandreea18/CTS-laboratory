package burlacu.andreea.g1092.simplefactory;

public class NormalRoute extends AbstractRoute{

	public NormalRoute (int noOfStations, String desc) {
		super();
		this.noOfStations=noOfStations;
		this.description=desc;
	}
	
	@Override
	public void ComputeRoute() {
		System.out.println("Computing the normal route...");
	}

	
}
