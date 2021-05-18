package burlacu.andreea.g1092.decorator;

public class TestDecorator {
	
	public static void main(String[] args) {
		PassangerProfile passanger =
				new PremiumPassanger("Calatorul", 122, 3, true);
		passanger.rateTrip(3);
	}
}
