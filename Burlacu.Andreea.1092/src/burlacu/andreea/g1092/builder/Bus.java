package burlacu.andreea.g1092.builder;

public class Bus {
	String routeName;
	int noOfStations;
	
	
	boolean isFull;
	
	Route typeOfRoute;
	
	String licensePlates;
	int maxPassangers;
	
	public Bus() {
		
	}
	
	public Bus(String routeName, int maxPassangers, boolean isFull, Route typeRoute,
			 String licensePlates, int noOfStations) {
		this.routeName = routeName;
		this.noOfStations = noOfStations;
		this.maxPassangers = maxPassangers;
		this.isFull = isFull;
		this.typeOfRoute = typeRoute;
		this.licensePlates = licensePlates;
	}
	
	public static class BusBuilder {
		Bus bus=null;
		
		public BusBuilder(String routeName, int noOfStations) {
			this.bus=new Bus();
			this.bus.routeName = routeName;
			this.bus.noOfStations = noOfStations;
		}
		
		public BusBuilder isFull() {
			this.bus.isFull=true;
			return this;
		}
		
		public BusBuilder SetRouteType(Route route) {
			this.bus.typeOfRoute= route;
			return this;
		}
		
		public BusBuilder SetLicensePlates(String licensePlates) {
			this.bus.licensePlates=licensePlates;
			return this;
		}
		
		public BusBuilder SetMaxNoOfPassangers(int maxPass) {
			this.bus.maxPassangers=maxPass;
			return this;
		}
		
		public Bus build() {
			return this.bus;
		}
	}

	
	
}
