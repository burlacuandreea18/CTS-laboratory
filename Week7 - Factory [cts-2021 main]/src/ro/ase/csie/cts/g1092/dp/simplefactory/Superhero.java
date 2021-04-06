package ro.ase.csie.cts.g1092.dp.simplefactory;

public class Superhero {
	
	String name;
	AbstractWeapon weapon;
	
	
	public AbstractWeapon getWeapon() {
		return weapon;
	}
	public void setWeapon(AbstractWeapon weapon) {
		this.weapon = weapon;
	}
	public Superhero(String name) {
		super();
		this.name = name;
	}
	
	
}
