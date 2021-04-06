package ro.ase.csie.cts.g1092.dp.simplefactory;

public class TestSimpleFactory {
	
	public static void main(String[] args) {
		
		Superhero superman= new Superhero("Superman");
		//superman.setWeapon(new Bazooka("Boom"));
		//superman.setWeapon(new MachineGun("MG", 50, 100));
		
		AbstractWeapon bazooka=
				WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "BOOM");
		superman.setWeapon(bazooka);
		superman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
	
	}
}
