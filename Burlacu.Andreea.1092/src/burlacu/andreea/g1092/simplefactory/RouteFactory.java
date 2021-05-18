package burlacu.andreea.g1092.simplefactory;

public class RouteFactory {

	
	public static AbstractRoute getRoute(RouteType type, String desc) {
		AbstractRoute route = null;
		switch (type) {
		case NORMAL:
			route=new NormalRoute(6, desc);
			break;
		case QUICKEST:
			route=new QuickestRoute(4, desc);

		case UNCROWDED:
			route=new UncrowdedRoute(5, desc);
			
		default:
			throw new UnsupportedOperationException();
		}
		return route;
	}
}
