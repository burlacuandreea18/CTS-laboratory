package ro.ase.csie.cts.dp.adapter.disney;

public class DonaldDuck implements DisneyActions {

	String name;
	int lifePoints;
	
	
	
	public DonaldDuck(int lifePoints) {
		super();
		this.name="Donald Duck";
		this.lifePoints = lifePoints;
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("Is moving to a new location");
		
	}

	@Override
	public void isWounded(int lostLifePoints) {
		System.out.println(String.format("%s lost % points", name, lostLifePoints));
		
	}

	@Override
	public void isHealing(int recoverdPoints) {
		System.out.println(String.format("%s recovered % points", name, lifePoints));
		
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPower() {
		return this.lifePoints;
	}

}
