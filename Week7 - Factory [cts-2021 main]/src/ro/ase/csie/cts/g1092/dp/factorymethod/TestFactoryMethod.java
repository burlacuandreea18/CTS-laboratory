package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.Superhero;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponsFactory;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		Superhero superman= new Superhero("Superman");
		boolean kidsMode=true;
		
		AbstractWeaponsFactory abstractFactory = null;
		if(kidsMode)
			abstractFactory = new WaterWeaponsFactory();
		else
			abstractFactory = new RealWeaponsFactory();
		
		AbstractWeapon bazooka=
				abstractFactory.getWeapon(WeaponType.BAZOOKA, "BOOM");
		superman.setWeapon(bazooka);
		superman.setWeapon(abstractFactory.getWeapon(
				WeaponType.MACHINE_GUN, "MG"));
	 

	}

}
