package burlacu.andreea.g1092.builder;

public class TestBuilder {

	public static void main(String[] args) {
		

		Route schoolRoute = new Route("School route");
		Bus bus = new Bus("Sc 2", 7, false, schoolRoute, "BR 02 FNB", 30);
		
		
		Bus bus2 =
				new Bus.BusBuilder("2", 15)
				.SetRouteType(schoolRoute)
				.SetLicensePlates("BR 22 ZZZ")
				.SetMaxNoOfPassangers(25)
				.build();
		Bus bus10=
				new Bus.BusBuilder("10", 12)
				.isFull()
				.SetMaxNoOfPassangers(30)
				.build();
	}

}
