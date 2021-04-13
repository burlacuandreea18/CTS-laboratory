package ro.ase.csie.cts.dp.decorator;


public class TestDecorator {

	public static void main(String[] args) {
		SuperHeroCharacter fantasyHero = 
				new FantasySuperHero("Blue Dragon", 1000, true);
		fantasyHero.move();
		fantasyHero.takeAHit(500);
		
		//the dragon looks wounded
		
		SuperHeroCharacter woundedHero = 
				new WoundedDecorator(fantasyHero);
		
		woundedHero.move();
		
		fantasyHero.heal(200);
		
		//add a shield/armour to dragon
		
		SuperHeroCharacter heroWithShield =
				new ShieldDecorator(fantasyHero, 200);
		heroWithShield.takeAHit(500);
		
		SuperHeroCharacter woundedHeroWithShield =
				new ShieldDecorator(heroWithShield, 250);
		
		woundedHeroWithShield.move();
		woundedHeroWithShield.takeAHit(260);
	}

}
